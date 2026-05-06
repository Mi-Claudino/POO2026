package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {

        Draw draw = new Draw();
        draw.setXscale(0,800);
        draw.setYscale(0,800);
        draw.setCanvasSize(800,800);


        // draw.circle(.5,.5,.3);
        draw.setPenColor(Color.GREEN);
        draw.circle(400, 400,200);
        draw.filledCircle(200,200,100);
        draw.square(400,400,200);




        double [] x = {100, 300, 500, 600, 100};
        double [] y = {100, 300, 300, 100 ,100};
        draw.polygon(x,y);


        draw.setFontSize(30);

        draw.enableDoubleBuffering();

        for (int i = 0; i < 10; i++) {
            draw.clear();
            draw.text(400,400,"" + i);
            draw.show();
            TimeUnit.MILLISECONDS.sleep(100);

        }
        draw.setPenColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 800; i+=50) {

            draw.line(i,0,i,800);

            draw.line(0,i,800,i);
        }
        draw.show();








    }
}
