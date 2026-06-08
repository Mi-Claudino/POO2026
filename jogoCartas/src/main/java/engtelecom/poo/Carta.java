package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class Carta {
    protected Naipe naipe;
    protected Valores valor;

    public Carta(Valores valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public void desenhar(Draw draw) {
    }
}