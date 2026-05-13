package engtelecom.poo.personagem;

public class Cavaleiro extends Personagem{
    public Cavaleiro(){
        super (50, 3,2);
    }

    @Override
    public String Atacar() {
        return "Cavaleiro está atacando com força " + this.ataque;
    }

    @Override
    public String Mover() {
        return "Cavaleiro está se movendo com velocidade " + this.velocidade;

    }
}
