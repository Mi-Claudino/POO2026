package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.time.LocalTime;

public abstract class Relogios {

    protected int hora;
    protected int minuto;
    protected int segundo;
    protected Draw draw;


    public Relogios(Draw draw) {
        this.draw = draw;
        LocalTime agora = LocalTime.now();
        this.hora = agora.getHour();
        this.minuto = agora.getMinute();
        this.segundo = agora.getSecond();
    }

    public Relogios(Draw draw, int hora, int minuto, int segundo) {
        this.draw = draw;
        setHora(hora, minuto, segundo);
    }

    public void setHora(int hora, int minuto, int segundo) {
        this.hora   = Math.max(0, Math.min(23, hora));
        this.minuto = Math.max(0, Math.min(59, minuto));
        this.segundo = Math.max(0, Math.min(59, segundo));
    }

    public int getHora()    { return hora; }
    public int getMinuto()  { return minuto; }
    public int getSegundo() { return segundo; }


    public void tick() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }
    public abstract void atualizar();
    public abstract void desenhar();
}