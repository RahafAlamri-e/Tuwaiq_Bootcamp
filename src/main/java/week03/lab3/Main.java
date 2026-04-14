package week03.lab3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        // Users
        User user1 = new User("Rahaf", "rahaf@gmail.com");
        User user2 = new User("Sara", "sara@gmail.com");
        store.addUser(user1);
        store.addUser(user2);

        // Books
        Novel novel1 = new Novel("Cinderella", "Author A", "N111", 45, 5, "Drama");
        Novel novel2 = new Novel("Snow White", "Author B", "N222", 40, 10, "Drama");
        AcademicBook academic1 = new AcademicBook("Java Basics", "Author A", "A222", 70, 13, "Programming");
        AcademicBook academic2 = new AcademicBook("Python Basics", "Author B", "A333", 60, 23, "Programming");

        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(academic1);
        store.addMedia(academic2);

        novel1.addReview(new Review("Rahaf", 3, "Not bad novel"));
        novel1.addReview(new Review("Sara", 5, "Very good"));

        novel2.addReview(new Review("Rahaf", 4, "Good novel"));
        novel2.addReview(new Review("Sara", 2, "I don't like it"));

        academic1.addReview(new Review("Rahaf", 5, "Excellent and helpful book"));
        academic1.addReview(new Review("Sara", 4, "Helpful and clear"));

        academic2.addReview(new Review("Rahaf", 4, "Excellent book"));
        academic2.addReview(new Review("Sara", 5, "Very helpful and clear"));

        // Movies
        Movie movie1 = new Movie("Sherlock Holmes", "Holmes", "M333", 30, 148);
        Movie movie2 = new Movie("The Strangers", "Ali", "M444", 35, 169);
        Movie movie3 = new Movie("Breaking Bad", "Saleh", "M555", 33, 150);
        Movie movie4 = new Movie("The Searchers", "Saleh", "M666", 33, 150);

        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);
        store.addMedia(movie4);

        // Music
        Music music1 = new Music("Sky Song", "Writer A", "MU555", 12.0, "Singer 1");
        Music music2 = new Music("Moon Song", "Writer B", "MU666", 8.0, "Singer 2");
        Music music3 = new Music("Dark Song", "Writer A", "MU777", 8.0, "Singer 1");
        Music music4 = new Music("Cute Song", "Writer B", "MU888", 8.0, "Singer 2");

        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(music4);

        // Test the methods
        System.out.println("Purchase / Stock ---------------------------");
        novel1.purchase(user1);
        System.out.println("\n" + user1.getUserName() + " Purchase media List now is: ");
        for (Media media : user1.getPurchaseMediaList()) {
            System.out.println("- " + media.getTitle());
        }

        System.out.println();
        academic1.restock(20);


        System.out.println("\nWatch / Listen ---------------------------");
        movie1.watch(user1);
        movie2.watch(user2);
        movie3.watch(user1);
        music2.listen(user1);

        System.out.println("\n" + user1.getUserName() + " Purchase media List now is: ");
        for (Media media : user1.getPurchaseMediaList()) {
            System.out.println("- " + media.getTitle());
        }
        System.out.println("\n" + user2.getUserName() + " Purchase media List now is: ");
        for (Media media : user2.getPurchaseMediaList()) {
            System.out.println("- " + media.getTitle());
        }

        System.out.println("\n" + user2.getUserName() + " cart ---------------------------");
        user2.addToCart(novel1);
        user2.addToCart(music1);
        user2.removeFromCart(novel1);
        user2.addToCart(novel2);

        System.out.println("\n" + user2.getUserName() + " Shopping Cart Before Checkout:");
        for (Media media : user2.getShoppingCart()) {
            System.out.println("- " + media.getTitle());
        }

        user2.checkout();

        System.out.println("\n" + user2.getUserName() + " Shopping Cart After Checkout:");
        if (user2.getShoppingCart().isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            for (Media media : user2.getShoppingCart()) {
                System.out.println("- " + media.getTitle());
            }
        }

        // Store Users
        System.out.println("\nUsers ---------------------------");
        for (User user : store.displayUsers()) {
            System.out.println(user);
        }

        // Store Media
        System.out.println("\nAll media ---------------------------");
        for (Media media : store.displayMedias()) {
            System.out.println(media);
        }

        // Search Book
        System.out.println("\nSearch book ---------------------------");
        Book foundBook = store.searchBook("Java Basics");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found");
        }

        // Similar Movies
        System.out.println("\nSimilar movies ---------------------------");
        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);
        movieCatalog.add(movie3);

        ArrayList<Movie> similarMovies = movie4.recommendSimilarMovies(movieCatalog);
        if (similarMovies.isEmpty()) {
            System.out.println("No similar movies found");
        } else {
            for (Movie movie : similarMovies) {
                System.out.println(movie);
            }
        }

        // Playlist
        System.out.println("\nPlay list ---------------------------");
        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music4);

        ArrayList<Music> playlist = music3.generatePlaylist(musicCatalog);
        if (playlist.isEmpty()) {
            System.out.println("No playlist generated");
        } else {
            for (Music music : playlist) {
                System.out.println(music);
            }
        }

        // Purchased Media
        System.out.println("\nFinal Purchased Media for " + user1.getUserName() + " ---------------------------");
        if (user1.getPurchaseMediaList().isEmpty()) {
            System.out.println("No purchased media");
        } else {
            for (Media media : user1.getPurchaseMediaList()) {
                System.out.println(media.getTitle() + " - " + media.getMediaType());
            }
        }

        System.out.println("\nFinal Purchased Media for " + user2.getUserName() + " ---------------------------");
        if (user2.getPurchaseMediaList().isEmpty()) {
            System.out.println("No purchased media");
        } else {
            for (Media media : user2.getPurchaseMediaList()) {
                System.out.println(media.getTitle() + " - " + media.getMediaType());
            }
        }
    }
}
