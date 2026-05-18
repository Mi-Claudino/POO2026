package engtelecom.poo.personagem;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro(){
        super(35, 2, 1);
    }

    @Override
    public String atacar() {
        return "Arqueiro está atacando com força" + this.ataque;
    }

    @Override
    public String mover() {
        return "Arqueiro está se movendo a velocidade" + this.velocidade;
    }
}
