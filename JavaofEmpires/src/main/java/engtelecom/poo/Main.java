package engtelecom.poo;

import engtelecom.poo.personagem.*;


public class Main {
    static void main() {
        Personagem[] personagens = new Personagem[5];
        personagens[0] = new Aldeao();
        personagens[1] = new Arqueiro();
        personagens[2] = new Cavaleiro();
        personagens[3] = new Aldeao();
        personagens[4] = new Cavaleiro();

        for (Personagem p : personagens){
            if (p instanceof Aldeao){
            IO.println(((Aldeao) p).coletarMadeira());
        }
            IO.println(p.mover());


            // Personagem p = new Personagem();


    }
        Aldeao a = new Aldeao();
        Guerreiro g = a;
}
}
