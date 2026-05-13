package engtelecom.poo;

import engtelecom.poo.produtos.SemFio;
import engtelecom.poo.produtos.Telefone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Telefone telefone = new Telefone(10,"233", "A56",35, new Dimensao(1,2,1));

        SemFio semFio = new SemFio(45,"445","552",67,new Dimensao(1,2,3),32,2,100);

        Telefone a = new SemFio(45,"445","552",67,new Dimensao(1,2,3),32,2,100);

        SemFio b = (SemFio) a;

        IO.println(semFio.toString());

        Telefone produtos[] = new Telefone[2];
        produtos[0] = new SemFio(45,"445","552",67,new Dimensao(1,2,3),32,2,100);
        produtos[1] = new Telefone(10,"233", "A56",35, new Dimensao(1,2,1));

        for(Telefone t : produtos){
            if (t instanceof SemFio s);
            double frequencia = semFio.getFrequencia();
            IO.println("sem fio com frequencia" + frequencia);
        }
    }
}
