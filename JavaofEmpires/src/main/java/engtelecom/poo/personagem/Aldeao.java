package engtelecom.poo.personagem;

public class Aldeao extends Personagem implements Guerreiro, Coletador{
    public Aldeao(){
        super(25,1,0.8);
    }

    @Override
    public String mover() {
        return "Aldeão está se movenedo com velocidade" + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Aldeão está atacando com ataque" + this.ataque;
    }


    @Override
    public String coletarMadeira() {
        return "";
    }

    @Override
    public String coletarOuro() {
        return "";
    }
}
