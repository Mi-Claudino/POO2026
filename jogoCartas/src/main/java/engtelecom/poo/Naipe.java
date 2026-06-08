package engtelecom.poo;

public enum Naipe {

    PAUS("Paus", 4, 'p'),
    OUROS("Ouros", 1, 'o'),
    COPAS("Copas", 3, 'c'),
    ESPADAS("Espadas", 2, 'e');


    public final String simbolo;
    public final int forca;
    public final char inicial;


    Naipe(String simbolo, int forca, char inicial) {
        this.simbolo = simbolo;
        this.forca = forca;
        this.inicial = inicial;
    }

    public static Naipe getByForca(int c) {
        for (Naipe naipe : Naipe.values()) {
            if (naipe.forca == c) {
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
                ", inicial=" + inicial +
                '}';
    }
}