package engtelecom.poo;

import java.awt.image.ImagingOpException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

public class Main {
    static void main() {

        String sigla = IO.readln("Entre com a sigla: ");

        int dia1 = Integer.parseInt(IO.readln("Entre com o 1o. dia: "));
        DiasDaSemana d1 = DiasDaSemana.getByCodigo(dia1);

        int dia2 = Integer.parseInt(IO.readln("Entre com o 2o. dia: "));
        DiasDaSemana d2 = DiasDaSemana.getByCodigo(dia2);

        DiasDaSemana[] dias = {d1, d2};

        Disciplina d = new Disciplina(sigla, dias);

        int planeta = Integer.parseInt(IO.readln("Entre com a posicão: "));
        Planetas p = Planetas.getByPosicao(planeta);


        IO.println(d);
        IO.println(p);
        //Sigla: POO
        //aulas: segunda quarta


//        Deque<Carta> baralho = new ArrayDeque<>();
//
//        for (Naipe n){
//            for (Valores v){
//                carta = new Carta(n,v);
//                baralho.add(carta);
//            }
//        }


        Caixa<String> c = new Caixa<>("Olá mundo");
        Caixa<Pessoa> pe = new Caixa<>(new Pessoa("Joao"));

        String s = c.getConteudo();

        // String errado = pe.getConteudo();

        ArrayList<String> a;
        HashMap<String, String> b;


    }
}
