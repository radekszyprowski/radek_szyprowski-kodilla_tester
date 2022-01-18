public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0] = "Blade Runner";
        movies[1] = "Pulp Fiction";
        movies[2] = "Nobody";
        movies[3] = "El Camino";
        movies[4] = "Sara";
        String movie = movies[3];
        System.out.println (movie);
        int numberOfElements = movies.length;
        System.out.println (numberOfElements);
    }
}
