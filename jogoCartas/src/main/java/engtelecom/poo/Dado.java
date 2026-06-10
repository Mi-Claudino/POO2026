package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Dado {
    protected int face;
    protected int[] estatisticas;
    private Random r;



    public void imprimirEst(){

    }

    public Dado() {
        this.face = 1;
        this.estatisticas = new int[6];
        this.r = new Random();
    }

    public final int jogar(){
        this.face = r.nextInt(1,7);
        this.estatisticas[this.face-1]++;
        return this.face;

    }


}
