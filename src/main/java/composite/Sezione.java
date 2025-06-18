package composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroComponent {

    private String titolo;
    private List<LibroComponent> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(LibroComponent elemento) {
        elementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComponent el : elementi) {
            el.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale = 0;
        for (LibroComponent el : elementi) {
            totale += el.getNumeroPagine();
        }
        return totale;
    }
}
