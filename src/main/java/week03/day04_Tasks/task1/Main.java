package week03.day04_Tasks.task1;

public class Main {
    public static void main(String[] args) {

        // Book
        Book book = new Book("Java Basics", 120.5, "Author A");
        System.out.println(book.getName() + " it's price before discount is: " + book.getPrice());
        System.out.println(book.getName() + " it's price after discount is: " + book.getDiscount());
        System.out.println(book.getName() + " it's tax is: " + book.calculateTax());
        System.out.println(book.getName() + " it's final price is: " + book.getFinalPrice());
        System.out.println();

        Book book2= new Book();
        book2.setName("Python Basics");
        book2.setPrice(108.7);
        book2.setAuthor("Author B");
        System.out.println(book2.getName() + " it's price before discount is: " + book2.getPrice());
        System.out.println(book2.getName() + " it's price after discount is: " + book2.getDiscount());
        System.out.println(book2.getName() + " it's tax is: " + book2.calculateTax());
        System.out.println(book2.getName() + " it's final price is: " + book2.getFinalPrice());
        System.out.println();


        // Movie
        Movie movie = new Movie("Sherlock Holmes", 100, "Director A");
        System.out.println(movie.getName() + " it's price before discount is: " + movie.getPrice());
        System.out.println(movie.getName() + " it's price after discount is: " + movie.getDiscount());
        System.out.println(movie.getName() + " it's tax is: " + movie.calculateTax());
        System.out.println(movie.getName() + " it's final price is: " + movie.getFinalPrice());
        System.out.println();


        Movie movie2 = new Movie();
        movie2.setName("The Strangers");
        movie2.setPrice(220.8);
        movie2.setDirector("Director B");
        System.out.println(movie2.getName() + " it's price before discount is: " + movie2.getPrice());
        System.out.println(movie2.getName() + " it's price after discount is: " + movie2.getDiscount());
        System.out.println(movie2.getName() + " it's tax is: " + movie2.calculateTax());
        System.out.println(movie2.getName() + " it's final price is: " + movie2.getFinalPrice());
        System.out.println();


        System.out.println(book.getName() + " more expensive than " + movie.getName()+ "? " + book.isMoreExpensiveThan(movie));



    }
}
