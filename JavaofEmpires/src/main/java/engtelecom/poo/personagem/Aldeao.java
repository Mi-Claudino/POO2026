package engtelecom.poo.personagem;

public class Aldeao extends Personagem {
    public Aldeao(){
        super(25,1,0.8);
    }

    @Override
    public String Mover() {
        return "Aldeão está se movenedo com velocidade" + this.velocidade;
    }

    @Override
    public String Atacar() {
        return "Aldeão está atacando com ataque" + this.ataque;
    }
}
