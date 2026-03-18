package engtelecom.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAXIMA = 23;
    private static final int MINUTO_MAXIMO = 59;
    private static final int SEGUNDO_MAXIMO = 59;

    @Override
    public String toString() {
        return String.format("02%d;02%d;02%d", hora, minuto, segundo);
    }

    public void setHorario(int hora, int minuto, int segundo) {
        this.hora = hora;
        if (this.hora > HORA_MAXIMA) {
            return;
        }
        this.minuto = minuto;
        if (this.minuto > MINUTO_MAXIMO) {
            return;
        }

        this.segundo = segundo;
        if (this.segundo > SEGUNDO_MAXIMO) {
            return;
        }


    }

    public int getHorario() {

    }
}
