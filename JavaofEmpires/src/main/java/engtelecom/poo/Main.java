package engtelecom.poo;

import engtelecom.poo.personagem.Personagem;
import engtelecom.poo.personagem.Cavaleiro;
import engtelecom.poo.personagem.Aldeao;
import engtelecom.poo.personagem.Arqueiro;


public class Main {
    static void main() {
        Personagem[] personagems = new Personagem[5];
        personagems[0] = new Aldeao();
        personagems[1] = new Arqueiro();
        personagems[2] = new Cavaleiro();
        personagems[3] = new Aldeao();
        personagems[4] = new Cavaleiro();

        for (Personagem p : personagems){
            // IO.println(p.atacar());
            IO.println(p.mover());
        }

        // Personagem p = new Personagem();


    }
}
