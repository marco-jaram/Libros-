
package libros;


public class Libro {
    String autor;
    String editorial;
    int numPaginas;

    public Libro() {
    }

    public Libro(String autor, String editorial, int numPaginas) {
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String mostrarDatos(){
    return "\nAutor: "+autor+"\nEditorial: "+editorial+"\nNumero de paginas: "+numPaginas;
    }
    
    
}
