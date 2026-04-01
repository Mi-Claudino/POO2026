package engtelecom.poo;

public class Objeto {

    private double x;
    private double y;


    public Objeto(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d,%d",x,y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX(){
        return x;
    }


    public double getY() {
        return y;
    }

    public double calcularDistancia(double x2, double y2){
        double distancia = Math.sqrt(Math.pow(x2-this.x, 2) + Math.pow(y2-this.y, 2));
        return distancia;
    }


}







