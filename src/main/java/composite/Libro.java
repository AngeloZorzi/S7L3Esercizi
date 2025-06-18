package composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements LibroComponent {

    private String titolo;
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    private List<LibroComponent> contenuto = new ArrayList<>();

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiContenuto(LibroComponent elemento) {
        contenuto.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Contenuto:");
        for (LibroComponent el : contenuto) {
            el.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale = 0;
        for (LibroComponent el : contenuto) {
            totale += el.getNumeroPagine();
        }
        return totale;
    }
}
