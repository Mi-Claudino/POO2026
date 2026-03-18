package engtelecom.poo;

public class Carro {

    public String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public static final int VELOCIDADE_MAXIMA = 300;
    private static final int VELOCIDADE_MINIMA = 0;

    public Carro(String modelo, int velocidadeMaxima){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        if (this.velocidadeMaxima > VELOCIDADE_MAXIMA) {this.velocidadeMaxima = VELOCIDADE_MAXIMA;}
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMaxima = VELOCIDADE_MAXIMA;
    }

    public int getVelocidadeMaxima(){return velocidadeMaxima;}

    public String getModelo(){
        return modelo;
    }

    public int getVelocidadeAtual(){return velocidadeAtual;}

    public int acelerar(int a){
        velocidadeAtual = velocidadeAtual + a;
        if (velocidadeAtual > velocidadeMaxima){ velocidadeAtual = velocidadeMaxima;}
//        velocidadeAtual = (velocidadeAtual + a > 200) ? 200 :;
        return velocidadeAtual;
    }

    public void frear(int f){
        velocidadeAtual = velocidadeAtual - f;
        if (velocidadeAtual < VELOCIDADE_MINIMA) {velocidadeAtual = VELOCIDADE_MINIMA;}
    }




}

// acelerar
// frear