package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class App implements DrawListener {

    private Draw draw;
    private List<CartaGrafica> baralho;


    public App() {
        this.draw = new Draw();
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3);
        this.draw.setTitle("Jogo de cartas");

        this.draw.addListener(this);

        this.draw.clear(Draw.GREEN);
        this.draw.show();
        this.baralho = new ArrayList<>();

        int x = 50;

        // Criando todas as cartas
        for (Naipe naipe : Naipe.values()) {
            for (Valores valor : Valores.values()) {

                CartaGrafica carta = new CartaGrafica(valor, naipe, x, 300, true);
                baralho.add(carta);
                x += 20;
            }
        }
        for (CartaGrafica c : baralho) {
            c.desenhar(this.draw);
        }

        this.draw.show();
    }

    static void main() {
        App app = new App();

    }

    @Override
    public void mouseClicked(double x, double y) {

        this.draw.picture(x, y, "cartas/1p.png");
        this.draw.show();
    }
}

