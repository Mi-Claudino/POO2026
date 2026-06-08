package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class App implements DrawListener {



    private Draw draw;
    private List<Carta> baralho;

    public App(){
        this.draw = new Draw();
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3);
        this.draw.setTitle("Jogo de cartas");

        this.draw.addListener(this);

        this.draw.clear(Draw.GREEN);
        this.draw.show();
        this.baralho = new ArrayList<>();

        // Criando todas as cartas
        for (Naipe naipe : Naipe.values()){
            for(Valor valor: Valor.values()){
                Carta carta = new Carta(naipe,valor);
                baralho.add(carta);
            }
        }
        for(Carta c : baralho){
            c.desenhar(this.draw);
        }

        CartaGrafica cartagrafica = new CartaGrafica(1,o,100,100,0);
    }

    static void main() {
        App app = new App();

    }

    @Override
    public void mouseClicked(double x, double y) {

        this.draw.picture(x,y,"cartas/1p.png");
        this.draw.show();
    }
}
