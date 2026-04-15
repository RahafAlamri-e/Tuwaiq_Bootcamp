package week03.day04_Tasks.task1;

public class Book extends Product{
    private String author;
    private final int discount = 15;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscount(){
        double priceAfter = getPrice() - (getPrice() * (discount / 100.0));
        setPrice(priceAfter);
        return priceAfter;
    }


}
