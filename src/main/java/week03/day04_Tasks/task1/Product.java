package week03.day04_Tasks.task1;

public abstract class Product {
    private String name;
    private double price;
    final int tax = 15;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTax(){
        return tax;
    }

    public abstract double getDiscount();

    //extra methods
    public double calculateTax() {
        return price * (tax / 100.0);
    }

    public double getFinalPrice() {
        return price + calculateTax();
    }

    public boolean isMoreExpensiveThan(Product other) {
        return this.price > other.price;
    }
}
