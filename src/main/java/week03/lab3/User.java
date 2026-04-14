package week03.lab3;

import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;

    public User() {
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.purchaseMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }


    public void addToCart(Media media){
        shoppingCart.add(media);
        System.out.println(media.getTitle() + " added to cart.");
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
        System.out.println(media.getTitle() + " removed from cart.");
    }

    public void checkout() {
        ArrayList<Media> purchasedItems = new ArrayList<>();

        for (Media media : shoppingCart) {
            try {
                Book book = (Book) media;

                if (book.getStock() > 0) {
                    purchaseMediaList.add(book);
                    book.setStock(book.getStock() - 1);
                    purchasedItems.add(book);
                } else {
                    System.out.println(book.getTitle() + " is out of stock.");
                }

            } catch (ClassCastException e) {
                purchaseMediaList.add(media);
                purchasedItems.add(media);
            }
        }

        shoppingCart.removeAll(purchasedItems);
        System.out.println(userName + " completed checkout.");
    }

    public String toString() {
        return "User{" +
                "username='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
