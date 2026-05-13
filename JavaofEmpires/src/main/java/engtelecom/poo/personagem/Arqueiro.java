package engtelecom.poo.personagem;

public class Arqueiro extends Personagem{
    public Arqueiro(){
        super(35, 2, 1);
    }

    @Override
    public String Atacar() {
        return "Arqueiro está atacando com força" + this.ataque;
    }

    @Override
    public String Mover() {
        return "Arqueiro está se movendo a velocidade" + this.velocidade;
    }
}
