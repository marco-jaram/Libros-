
package libros;

/**
 *
 * @author marco
 */
public class Ciencia extends Libro {
    String nombreDisciplina;

    public Ciencia() {
    }

    public Ciencia(String nombreDisciplina, String autor, String editorial, int numPaginas) {
        super(autor, editorial, numPaginas);
        this.nombreDisciplina = nombreDisciplina;
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

    public void setNombreDisciplina(String nombreDisciplina) {
        this.nombreDisciplina = nombreDisciplina;
    }
    @Override
   public String mostrarDatos(){
    return "\nNombre de la disciplina cientifica: "+ nombreDisciplina+"\nAutor: "+autor+"\nEditorial: "+editorial+"\nNumero de paginas: "+numPaginas;
    }
    
}
