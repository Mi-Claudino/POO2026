package engtelecom.poo;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias; // 2, 4
    // private String[] d; // segunda, quarta



    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "sigla='" + sigla + '\'' +
                ", dias=" + Arrays.toString(dias);
    }



}
