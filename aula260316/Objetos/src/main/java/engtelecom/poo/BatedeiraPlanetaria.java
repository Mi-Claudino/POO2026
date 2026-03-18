package engtelecom.poo;

public class BatedeiraPlanetaria {
    //BATER
    //PARAR
    //TROCAR BATEDOR
    //GET TIPO DE BATEDOR
    //AUMENTAR DIMINUIR VELCOCIDADE

    private boolean batendo;
    private String tipoBatedor = "Globo";
    private int velocidade;

    public void comecarPararBatida() {
        batendo = !batendo;
    }

    public boolean isBatendo() {
        return batendo;
    }

    public void setTipoBatedor(String tb){
        tipoBatedor = tb;
    }

    public String getTipoBatedor(){return tipoBatedor;}

    public void setVelocidade(int v){velocidade = v;}

    public void aumentarVelocidade(){velocidade++;}

    public void diminuirVelocidade(){velocidade--;}

    public int getVelocidade(){return velocidade;}




}
