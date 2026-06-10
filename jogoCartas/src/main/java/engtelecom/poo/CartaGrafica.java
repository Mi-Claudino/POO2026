package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import javax.swing.*;
import java.awt.*;

public class CartaGrafica extends Carta implements Elemento{


    private double x;
    private double y;
    private boolean up;

    public CartaGrafica(Valores valor, Naipe naipe, double x, double y, boolean up) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
        this.up = up;
    }

    @Override
    public void desenhar(Draw desenho) {
        desenho.picture(this.x,this.y,"cartas/"+valor.inicial+naipe.inicial+".png");
    }

    public boolean clicouDentro(double x, double y){
        ImageIcon imageIcon = new ImageIcon("1o.png");
        Image image = imageIcon.getImage();

        int largura = 72;
        int altura = 96;

        return false;
    }

}

