package engtelecom.poo;

public class PersonagemJogo {

    private String nome;
    private String classe;
    private int vida;
    // private int força;


    public void setNome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setClasse(String c){
        classe = c;
    }

    public String getClasse(){
        return classe;
    }

    public void setVida(int v){
        vida = v;
    }

    public int getVida(){
        return vida;
    }

    public void tomarDano(){
        vida--;
    }

    public void curarVida(){
        vida++;
    }

}
