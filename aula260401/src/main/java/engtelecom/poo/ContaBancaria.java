package engtelecom.poo;

public class ContaBancaria {

    private String numero;
    private String nome;
    private double saldo;

    public ContaBancaria(String numero, double nome, String saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero='" + numero + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public double sacar(double valor){
        this.saldo = (valor > saldo) ? saldo : saldo - valor;
        return this.saldo;
    }

    public double depositar(double valor) {
//        if (valor < 0 ){
//            IO.println("Você não pode depositar valores negativos");
//    }
//        this.saldo = (this.saldo + valor);
//        return this.saldo
        this.saldo += (valor > 0) ? valor : 0;
        return this.saldo;
    }

    public String getNumero() {
        return numero;
    }
}
