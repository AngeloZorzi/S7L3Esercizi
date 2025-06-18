package composite;

public class Main {
    public static void main(String[] args) {
        Pagina p1 = new Pagina("Introduzione");
        Pagina p2 = new Pagina("Capitolo 1 - Teoria");
        Pagina p3 = new Pagina("Capitolo 2 - Pratica");

        Sezione sezione1 = new Sezione("Capitolo 1");
        sezione1.aggiungiElemento(p2);

        Sezione sezione2 = new Sezione("Capitolo 2");
        sezione2.aggiungiElemento(p3);

        Sezione sezionePrincipale = new Sezione("Parte 1");
        sezionePrincipale.aggiungiElemento(sezione1);
        sezionePrincipale.aggiungiElemento(sezione2);

        Libro libro = new Libro("Design Patterns in Java", 29.90);
        libro.aggiungiAutore("Gamma");
        libro.aggiungiAutore("Helm");
        libro.aggiungiContenuto(p1);
        libro.aggiungiContenuto(sezionePrincipale);

        libro.stampa();
        System.out.println("Pagine totali: " + libro.getNumeroPagine());
    }
}
