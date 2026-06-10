package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class DadoGrafico extends Dado implements Elemento{
    private int x;
    private int y;
    private Draw draw;


    @Override
    public void desenhar(Draw desenho) {
        this.draw.picture(this.x,this.y,"dados/"+face+".png");
        this.draw.show();

    }
}
