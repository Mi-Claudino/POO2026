package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class Main implements DrawListener {



    private Draw draw;

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


    }

    static void main() {

    }

    @Override
    public void mouseClicked(double x, double y) {
        this.draw.picture(x,y,"cartas/1p.png");
        this.draw.show();
    }
}
