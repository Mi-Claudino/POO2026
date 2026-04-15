package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {
    private int tripulantes;
    private int passageiros;
    private int pesoMaximo;
    private int combustivelMaximo;
    private int quantidadeMotores;
    private ArrayList<Motor> motores;

    public Aviao(String tipoMotor, int tripulantes, int passageiros, int pesoMaximo, int combustivelMaximo, int quantidadeMotores, int consumo) {
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.pesoMaximo = pesoMaximo;
        this.combustivelMaximo = combustivelMaximo;
        this.quantidadeMotores = quantidadeMotores;
        this.motores = new ArrayList<>();

        if (this.quantidadeMotores <= 8) {for (int i = 0; i < quantidadeMotores; i++) {
            this.motores.add(new Motor(tipoMotor, consumo));
        }
            quantidadeMotores = 1;

        }




    }
}



