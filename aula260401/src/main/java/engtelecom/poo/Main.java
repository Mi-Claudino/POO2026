package engtelecom.poo;

import java.util.ArrayList;




public class Main {

    private ArrayList<ContaBancaria> contas = new ArrayList<>();



    public  void menu(int opcao){
        // TODO implementar switch case

        switch (opcao) {
            case 1 ->{
                String nome = IO.readln("Entre com o nome: ");
                double saldo = Double.parseDouble(IO.readln("Entre com o saldo: "));
                String numero = IO.readln("Entre com o numero");
                ContaBancaria c = new ContaBancaria(nome, saldo, numero);
                contas.add(c);
            }
            case 2 ->{



            }
            case 3->{
                contas.forEach(e ->{
                    if (e.getNumero().equals(numero)){
                        e.depositar(valor);
                    }
                });
            }

        }

        // Menu com 3 opções
        // 1 - Criar conta
        // 2 - Listar todas contas
        // 3 - Depositar
        // 4 - Sacar
        // 5 - Sair





    }







    static void main() {

        // var lista = new Arraylist<>();
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Juca");
        lista.add("Maria");
        lista.add("Pedro");

        lista.add(1,"João");

        String nome = lista.get(1);
        IO.println(nome);

        IO.println(lista.size());

        // imprimir todos os elementos da lista
        IO.println(lista);
        for (int i = 0; i < lista.size(); i++) {

        }

        // percorrer todos elementos da coleção e imprimir somente se tiver uma Maria
        // for each, melhor que o fori em baixo
        for (String elemento: lista){
            if (elemento.equals("Maria")){
                IO.println(elemento);
            }
        }

        for (int i = 0; i < lista.size() ; i++) {
            if (lista.get(i).equals("Maria")){
                IO.println(lista.get(i));
            }

        }

        // Com expressões lambdas ->
        lista.forEach(elemento -> {
            IO.println(elemento);
        });

        lista.forEach(elemento ->{
            if (elemento.equals("Maria")){
                IO.println(elemento + " deu certo");
            }
        });

        lista.forEach(a -> IO.println(a));
        // method reference
        lista.forEach(IO::println);

        // remover Maria
        lista.removeIf(elemento -> elemento.equals("Maria"));
        // se fizer com fori ou for each vai dar ruim!
        lista.forEach(IO::println);

        Main main = new main();

        main.menu(1);




    }
}
