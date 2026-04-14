package week03.lab3;

import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    public ArrayList<Review> reviews;

    public Book() {
    }

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review r) {
        reviews.add(r);
    }

    public double getAverageRating(){
        if (reviews.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return (double) sum / reviews.size();
    }

    public void purchase(User user){
        if (stock > 0) {
            user.getPurchaseMediaList().add(this);
            stock--;
            System.out.println(user.getUserName() + " purchased book: " + getTitle());
        } else {
            System.out.println("Sorry book is out of stock");
        }
    }

    public boolean isBestSeller(){
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity){
        stock += quantity;
        System.out.println(getTitle() + " restocked by " + quantity + " new stock is: " + stock);
    }

    public String getMediaType(){
        return isBestSeller() ? "Bestselling Book" : "Book";
    }

    public String toString(){
        return super.toString() +
                ", Stock: " + stock +
                ", Avg Rating: " + getAverageRating() +
                ", Type: " + getMediaType();
    }
}
