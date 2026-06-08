package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import javax.swing.*;
import java.awt.*;

public class CartaGrafica extends Carta {

    private Draw draw;
    private double x;
    private double y;
    private boolean up;

    public CartaGrafica(Valores valor, Naipe naipe, double x, double y, boolean up) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
        this.up = up;
    }

    public void desenhar(Draw desenho) {

        this.draw.picture(this.x,this.y,"cartas/"+valor.inicial+naipe.inicial+".png");
        this.draw.show();
    }

    public boolean clicouDentro(double x, double y){
        ImageIcon imageIcon = new ImageIcon("1o.png");
        Image image = imageIcon.getImage();

        int largura = 72;
        int altura = 96;

        return false;
    }

}

