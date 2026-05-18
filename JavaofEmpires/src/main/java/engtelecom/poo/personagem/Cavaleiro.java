package engtelecom.poo.personagem;

public class Cavaleiro extends Personagem implements Guerreiro{
    public Cavaleiro(){
        super (50, 3,2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro está atacando com força " + this.ataque;
    }

    @Override
    public String mover() {
        return "Cavaleiro está se movendo com velocidade " + this.velocidade;

    }
}
