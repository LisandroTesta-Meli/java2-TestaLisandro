public class Libro {
    String titulo ;
    int isbn ;
    String autor;
    boolean disponible;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(String titulo, int isbn, String autor,boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro() {
    }

    public Libro(Libro l){
        titulo = l.titulo;
        isbn = l.isbn;
        autor = l.autor;
    }

    public void prestamo(){
        disponible = false;
    }

    public void devolucion(){
        disponible = true;
    }

    @Override
    public String toString() {
        String estado  = (disponible) ?" Disponible" : " Prestado";
        return titulo+", " + Integer.toString(isbn)+", " + autor+", " + estado;
    }

}
