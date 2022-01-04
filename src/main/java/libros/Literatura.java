
package libros;

/**
 *
 * @author marco
 */
public class Literatura  extends Libro {
    String genero;

    public Literatura() {
    }

    public Literatura(String genero) {
        this.genero = genero;
    }

    public Literatura(String genero, String autor, String editorial, int numPaginas) {
        super(autor, editorial, numPaginas);
        this.genero = genero;
    }

  

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
   public String mostrarDatos(){
    return "\nGenero: "+ genero+"\nAutor: "+autor+"\nEditorial: "+editorial+"\nNumero de paginas: "+numPaginas;
    }
    
}
