
package libros;

/**
 *
 * @author marco
 */
public class Biografia extends Libro{
    String personaje;

    public Biografia() {
    }

    public Biografia(String personaje, String autor, String editorial, int numPaginas) {
        super(autor, editorial, numPaginas);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    
    
}
