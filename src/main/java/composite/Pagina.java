package composite;

public class Pagina implements LibroComponent {

    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina: " + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
