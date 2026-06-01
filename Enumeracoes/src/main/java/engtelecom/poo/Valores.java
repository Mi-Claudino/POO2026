package engtelecom.poo;

public enum Valores {
    AS(1,"Ás"),
    DOIS(2,"Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6,"Seis"),
    SETE(7,"Sete"),
    OITO(8,"Oito"),
    NOVE(9,"Nove"),
    DEZ(10,"Dez"),
    VALETE(11,"Valete"),
    DAMA(12,"Dama"),
    REI(13,"Rei");

    public final int valor;
    public final String nome;

    Valores(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public static Valores getByValor(int c){
        for (Valores valores : Valores.values()){
            if (valores.valor == c){
                return valores;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }

    @Override
    public String toString() {
        return "Valores{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                '}';
    }
}
