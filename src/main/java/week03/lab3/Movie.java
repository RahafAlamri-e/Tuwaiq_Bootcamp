package week03.lab3;

import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public Movie() {

    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.getPurchaseMediaList().add(this);
        System.out.println(user.getUserName() + " watched movie: " + getTitle());
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (!movie.getTitle().equals(getTitle()) && movie.getAuteur().equalsIgnoreCase(getAuteur())) {
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }
    public String getMediaType(){
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    public String toString(){
        return "Title: " + getTitle() +
                ", Director: " + getAuteur() +
                ", Duration: " + duration +
                ", Price: " + getPrice() +
                ", Type: " + getMediaType();
    }
}
