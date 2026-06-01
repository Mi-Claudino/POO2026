package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.time.LocalTime;

public abstract class Cronometro extends Relogios {

    public enum Modo {
        RELOGIO,
        PROGRESSIVO,
        REGRESSIVO
    }

    public enum Tamanho {
        PEQUENO, MEDIO, GRANDE
    }

    protected Modo modo;
    protected Tamanho tamanho;
    private int horaInicialRegressivo;
    private int minutoInicialRegressivo;
    private int segundoInicialRegressivo;
    protected boolean finalizado;

    public Cronometro(Draw draw, Modo modo, Tamanho tamanho) {
        super(draw);
        this.modo = modo;
        this.tamanho = tamanho;
        this.finalizado = false;
        if (modo == Modo.PROGRESSIVO) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Cronometro(Draw draw, int hora, int minuto, int segundo, Modo modo, Tamanho tamanho) {
        super(draw, hora, minuto, segundo);
        this.modo = modo;
        this.tamanho = tamanho;
        this.finalizado = false;
        if (modo == Modo.PROGRESSIVO) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else if (modo == Modo.REGRESSIVO) {
            this.horaInicialRegressivo = hora;
            this.minutoInicialRegressivo = minuto;
            this.segundoInicialRegressivo = segundo;
        }
    }


    public void reiniciar() {
        this.finalizado = false;
        if (modo == Modo.PROGRESSIVO) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else if (modo == Modo.REGRESSIVO) {
            this.hora = horaInicialRegressivo;
            this.minuto = minutoInicialRegressivo;
            this.segundo = segundoInicialRegressivo;
        }
    }


    @Override
    public void tick() {
        switch (modo) {
            case RELOGIO:
                super.tick();
                break;
            case PROGRESSIVO:
                super.tick();
                break;
            case REGRESSIVO:
                tickRegressivo();
                break;
        }
    }

    private void tickRegressivo() {
        if (finalizado) return;
        if (hora == 0 && minuto == 0 && segundo == 0) {
            finalizado = true;
            return;
        }
        segundo--;
        if (segundo < 0) {
            segundo = 59;
            minuto--;
            if (minuto < 0) {
                minuto = 59;
                hora--;
                if (hora < 0) hora = 0;
            }
        }
    }

    public Modo getModo()        { return modo; }
    public Tamanho getTamanho()  { return tamanho; }
    public boolean isFinalizado(){ return finalizado; }
}
