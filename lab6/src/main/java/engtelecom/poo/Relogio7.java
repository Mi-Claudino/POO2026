package engtelecom.poo;

import java.util.ArrayList;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Relogio7 extends Cronometro {

    private ArrayList<Segmentos> displays;
    private double tamanho;
    private Color cor;

    public Relogio7(double x, double y, int tamanho, int modo, Color cor) {
        super(x, y, modo);
        this.tamanho = tamanho;
        this.cor = cor;
        montarSegmentos(tamanho);
    }

    public Relogio7(int hora, int min, int sec, double x, double y, double tamanho, int modo, Color cor) {
        super(hora, min, sec, x, y, modo);
        this.tamanho = tamanho;
        this.cor = cor;
        montarSegmentos(tamanho);
    }

    private void montarSegmentos(double tamanho) {
        this.displays = new ArrayList<>();
        this.tamanho = (tamanho < 1 || tamanho > 3) ? 2 : tamanho;

        double t = this.tamanho * 50;

        double passo = 1.2 * t;
        double gap   = 2.0 * t;

        this.displays.add(new Segmentos(x, y, this.tamanho));
        this.displays.add(new Segmentos(x + passo, y, this.tamanho));
        this.displays.add(new Segmentos(x + passo + gap, y, this.tamanho));
        this.displays.add(new Segmentos(x + passo*2 + gap, y, this.tamanho));
        this.displays.add(new Segmentos(x + passo*2 + gap*2,y, this.tamanho));
        this.displays.add(new Segmentos(x + passo*3 + gap*2,y, this.tamanho));

        ligarDisplay();
    }

    private void ligarDisplay() {
        displays.get(0).setNum(this.horas / 10);
        displays.get(1).setNum(this.horas % 10);
        displays.get(2).setNum(this.minutos / 10);
        displays.get(3).setNum(this.minutos % 10);
        displays.get(4).setNum(this.segundos / 10);
        displays.get(5).setNum(this.segundos % 10);
    }

    @Override
    public void desenhar(Draw desenho) {
        ligarDisplay();
        displays.forEach(segs -> {
            segs.desenhar(desenho, cor);
        });
    }
}
