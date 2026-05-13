package engtelecom.poo;

public class Dimensao {

    private double altura;
    private double largura;
    private double comprimento;

    public Dimensao(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }
}

