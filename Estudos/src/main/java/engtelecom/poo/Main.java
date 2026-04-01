package engtelecom.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Objeto teste = new Objeto(1,4);

        IO.println(teste.toString());

        IO.println(teste.calcularDistancia(6,8));
    }
}
