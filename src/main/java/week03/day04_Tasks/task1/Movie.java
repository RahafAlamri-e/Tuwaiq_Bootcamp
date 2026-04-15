package week03.day04_Tasks.task1;

public class Movie extends Product{
    private String director;
    private final int discount = 10;

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDiscount(){
        double priceAfter = getPrice() - (getPrice() * (discount / 100.0));
        setPrice(priceAfter);
        return priceAfter;
    }


}
