package week03.lab3;

import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> mediaList;

    public Store() {
        users = new ArrayList<>();
        mediaList = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> displayUsers() {
        return users;
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public ArrayList<Media> displayMedias() {
        return mediaList;
    }

    public Book searchBook(String title) {
        for (Media media : mediaList) {
            try {
                Book book = (Book) media;
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            } catch (ClassCastException e) {
                continue;
            }
        }
        return null;
    }
}
