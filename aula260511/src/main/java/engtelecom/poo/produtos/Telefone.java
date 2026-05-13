package engtelecom.poo.produtos;

import engtelecom.poo.Dimensao;

public class Telefone {

    private int codigo;
    private String numSerie;
    protected String modelo;
    private double peso;
    private Dimensao dimensao;

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao;
    }

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;


    }
}