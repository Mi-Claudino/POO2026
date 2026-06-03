package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("1.Normal 2. Não implementado 3.Rreg ");
        int escolha = Integer.parseInt(IO.readln("Escolha: "));
        if (escolha < 1 || escolha > 3) {
            throw new IllegalArgumentException("Opcao inválida: " + escolha);
        }

        Draw desenho = new Draw();
        ArrayList<Relogios> relogios = new ArrayList<>();
        desenho.setCanvasSize(1000, 1000);
        desenho.setXscale(0, 1000);
        desenho.setYscale(0, 1000);
        desenho.enableDoubleBuffering();
        desenho.setDefaultCloseOperation(3);
        relogios.add(new Analogico(500, 500));
        relogios.add(new Relogio7(300, 700, 1, escolha, Draw.RED));
        relogios.add(new Texto(100, 600, escolha, 25, Draw.BLUE));

        while (true) { desenho.clear(Draw.WHITE);
            for (Relogios relogio : relogios) {
                relogio.atualizarTempo();
                relogio.desenhar(desenho);
            }
            desenho.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}

