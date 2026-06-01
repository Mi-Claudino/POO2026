package engtelecom.poo;

public enum Naipe {

    PAUS("Paus", 4),
    OUROS("Ouros", 1),
    COPAS("Copas", 3),
    ESPADAS("Espadas", 2);


    public final String simbolo;
    public final int forca;


    Naipe(String simbolo, int forca) {
        this.simbolo = simbolo;
        this.forca = forca;
    }
    public static Naipe getByForca(int c){
        for (Naipe naipe : Naipe.values()){
            if (naipe.forca == c){
                return naipe;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }


    @Override
    public String toString() {
        return "Naipe{" +
                "simbolo='" + simbolo + '\'' +
                ", forca=" + forca +
                '}';
    }
}
