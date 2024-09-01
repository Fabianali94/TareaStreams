//Fabiana Barrantes Li
//Tarea streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));


        // Ejercicio 1: Obtener un sublistado con las películas estrenadas en el siglo XXI (a partir del año 2000, inclusive)
        List<Pelicula> peliculaSigloXXI = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .collect(Collectors.toList());

        System.out.println("Películas del siglo XXI:");
        for (Pelicula p : peliculaSigloXXI) {
            System.out.println(p);
        }

        // Ejercicio 2: Mostrar por pantalla, separados por comas, los títulos de las películas de Steven Spielberg
        String titulosSpielberg = peliculas.stream()
                .filter(p -> p.getDirector().equals("Steven Spielberg"))
                .map(p -> p.getTitulo())
                .collect(Collectors.joining(", "));

        System.out.println("\nTítulos de películas realizas por Steven Spielberg:");
        System.out.println(titulosSpielberg);


        //Ejercicio 3: Obtener un sublistado con los nombres de las películas, ordenados alfabéticamente
        List<String> titulosOrdenados = peliculas.stream()
                .map(p -> p.getTitulo())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Películas ordenadas alfabéticamente:");
        for (String titulo : titulosOrdenados) {
            System.out.println(titulo);
        }

    }
}
