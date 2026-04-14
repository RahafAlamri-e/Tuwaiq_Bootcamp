package week03.lab3;

public class Novel extends Book{
    private String genre;

    public Novel() {
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType(){
        return getAverageRating() >= 4.5 ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Genre: " + genre;
    }
}
