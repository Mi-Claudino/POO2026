package engtelecom.poo;


import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static String formatar(String mascara, String valor) throws ParseException {

        MaskFormatter maskFormatter = null;

        maskFormatter = new MaskFormatter(mascara);

        return "";
    }

    static void main() {
        String s = null;
        try {
            s = formatar("(##)","48");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        IO.println(s);



//        Scanner ler = new Scanner(System.in);
//        int a, b;
//
//        try {
//            System.out.print("Entre com o número: ");
//            a = ler.nextInt();
//            System.out.print("Entre com o número: ");
//            b = ler.nextInt();
//
//            int res = a / b;
//
//            System.out.println(a + " divido por " + b + " = " + res);
//        }catch(InputMismatchException e){
//            System.err.println("Só é permitido números inteiros");
//            ler.nextLine();
//        }catch(ArithmeticException e){
//            System.err.println("Divisor não pode ser 0");
//        }catch(Exception e){
//            System.err.println(e.toString());
//        }
//
//        System.out.println("Fim do programa");

    }
}
