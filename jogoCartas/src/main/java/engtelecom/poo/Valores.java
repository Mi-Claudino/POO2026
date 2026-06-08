package engtelecom.poo;

public enum Valores {
    AS(1,"Ás","1"),
    DOIS(2,"Dois","2"),
    TRES(3, "Três","3"),
    QUATRO(4, "Quatro","4"),
    CINCO(5, "Cinco","5"),
    SEIS(6,"Seis","6"),
    SETE(7,"Sete","7"),
    OITO(8,"Oito","8"),
    NOVE(9,"Nove","9"),
    DEZ(10,"Dez","10"),
    VALETE(11,"Valete","j"),
    DAMA(12,"Dama","q"),
    REI(13,"Rei","k");

    public final int valor;
    public final String nome;
    public final String inicial;

    Valores(int valor, String nome, String inicial) {
        this.valor = valor;
        this.nome = nome;
        this.inicial = inicial;
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

    public static getByInicial(int i){

    }
}