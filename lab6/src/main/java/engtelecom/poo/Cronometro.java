package engtelecom.poo;

public abstract class Cronometro extends Relogios {

    protected int modo;

    public Cronometro(double x, double y, int modo) {
        super(x, y);
        this.modo = modo;
    }

    public Cronometro(int hora, int min, int sec, double x, double y, int modo) {
        super(hora, min, sec, x, y);
        this.modo = modo;
    }

    protected void reverse() {
        if (horas == 0 && minutos == 0 && segundos == 0) {
            return;
        }

        segundos--;
        if (segundos < 0) {
            segundos = 59;
            minutos--;
            if (minutos < 0) {
                minutos = 59;
                horas--;
                if (horas < 0) {
                    return;
                }
            }
        }
    }

    @Override
    public void atualizarTempo() {
        if (modo == 3) {
            reverse();
        } else {
            avancarTempo();
        }
    }
}
