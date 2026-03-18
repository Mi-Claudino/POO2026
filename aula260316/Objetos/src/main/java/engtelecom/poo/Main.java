package engtelecom.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Contador contador1 = new Contador();

        IO.println(contador1.getContagem());

        contador1.setContagem(200);

        contador1.aumentar();

        IO.println(contador1.getContagem());
        }
    }

