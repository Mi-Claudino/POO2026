package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmentos {

    private double[][] segX;
    private double[][] segY;
    private boolean[] ligado;

    public Segmentos(double x, double y, double tamanho) {
        if (tamanho < 1 || tamanho > 3) {
            tamanho = 2;
        }

        double t = tamanho * 50;

        segX = new double[7][];
        segY = new double[7][];
        ligado = new boolean[7];

        segX[0] = new double[]{ 0.1*t+x, 0.2*t+x, 1.0*t+x, 1.1*t+x, 1.0*t+x, 0.2*t+x };
        segY[0] = new double[]{ 2.0*t+y, 2.1*t+y, 2.1*t+y, 2.0*t+y, 1.9*t+y, 1.9*t+y };

        segX[1] = new double[]{ 1.0*t+x, 1.1*t+x, 1.1*t+x, 1.0*t+x, 0.9*t+x, 0.9*t+x };
        segY[1] = new double[]{ 1.1*t+y, 1.2*t+y, 1.9*t+y, 2.0*t+y, 1.9*t+y, 1.2*t+y };

        segX[2] = new double[]{ 1.0*t+x, 1.1*t+x, 1.1*t+x, 1.0*t+x, 0.9*t+x, 0.9*t+x };
        segY[2] = new double[]{ 0.2*t+y, 0.3*t+y, 1.0*t+y, 1.1*t+y, 1.0*t+y, 0.3*t+y };

        segX[3] = new double[]{ 0.1*t+x, 0.2*t+x, 1.0*t+x, 1.1*t+x, 1.0*t+x, 0.2*t+x };
        segY[3] = new double[]{ 0.2*t+y, 0.3*t+y, 0.3*t+y, 0.2*t+y, 0.1*t+y, 0.1*t+y };

        segX[4] = new double[]{ 0.1*t+x, 0.2*t+x, 0.2*t+x, 0.1*t+x, 0.0*t+x, 0.0*t+x };
        segY[4] = new double[]{ 0.2*t+y, 0.3*t+y, 1.0*t+y, 1.1*t+y, 1.0*t+y, 0.3*t+y };

        segX[5] = new double[]{ 0.1*t+x, 0.2*t+x, 0.2*t+x, 0.1*t+x, 0.0*t+x, 0.0*t+x };
        segY[5] = new double[]{ 1.1*t+y, 1.2*t+y, 1.9*t+y, 2.0*t+y, 1.9*t+y, 1.2*t+y };

        segX[6] = new double[]{ 0.1*t+x, 0.2*t+x, 1.0*t+x, 1.1*t+x, 1.0*t+x, 0.2*t+x };
        segY[6] = new double[]{ 1.1*t+y, 1.2*t+y, 1.2*t+y, 1.1*t+y, 1.0*t+y, 1.0*t+y };

        setNum(0);
    }

    public void setNum(int numero) {
        if (numero < 0 || numero > 9) return;


        for (int i = 0; i < 7; i++) ligado[i] = false;

        switch (numero) {
            case 0:
                ligado[0] = true; ligado[1] = true; ligado[2] = true;
                ligado[3] = true; ligado[4] = true; ligado[5] = true;
                break;
            case 1:
                ligado[1] = true; ligado[2] = true;
                break;
            case 2:
                ligado[0] = true; ligado[1] = true; ligado[3] = true;
                ligado[4] = true; ligado[6] = true;
                break;
            case 3:
                ligado[0] = true; ligado[1] = true; ligado[2] = true;
                ligado[3] = true; ligado[6] = true;
                break;
            case 4:
                ligado[1] = true; ligado[2] = true;
                ligado[5] = true; ligado[6] = true;
                break;
            case 5:
                ligado[0] = true; ligado[2] = true; ligado[3] = true;
                ligado[5] = true; ligado[6] = true;
                break;
            case 6:
                ligado[0] = true; ligado[2] = true; ligado[3] = true;
                ligado[4] = true; ligado[5] = true; ligado[6] = true;
                break;
            case 7:
                ligado[0] = true; ligado[1] = true; ligado[2] = true;
                break;
            case 8:
                ligado[0] = true; ligado[1] = true; ligado[2] = true;
                ligado[3] = true; ligado[4] = true; ligado[5] = true; ligado[6] = true;
                break;
            case 9:
                ligado[0] = true; ligado[1] = true; ligado[2] = true;
                ligado[3] = true; ligado[5] = true; ligado[6] = true;
                break;
        }
    }

    public void desenhar(Draw desenho, Color cor) {
        Color escura = new Color(
                (int)(cor.getRed()   * 0.2),
                (int)(cor.getGreen() * 0.2),
                (int)(cor.getBlue()  * 0.2)
        );

        for (int i = 0; i < 7; i++) {
            desenho.setPenColor(ligado[i] ? cor : escura);
            desenho.filledPolygon(segX[i], segY[i]);
        }
    }
}
