package libros;

public class MainLibros {

    public static void main(String[] args) {
        Libro lib1 = new Libro("Saramago", "Alfaguara", 380);
        System.out.println("Los datos de el libro son: " + lib1.mostrarDatos());
        System.out.println("------------------");
        System.out.println("------------------");

        Libro lib2 = new Ciencia("Fisica", "Einstein", "a", 700);
        System.out.println("Libro 2 Ciencia" + lib2.mostrarDatos());
        System.out.println("------------------");
        System.out.println("------------------");

        Libro lib3 = new Literatura("Narrativa", "Bolanio", "Tusquets", 478);
        System.out.println("Libro3 Literatura" + lib3.mostrarDatos());

    }

}
