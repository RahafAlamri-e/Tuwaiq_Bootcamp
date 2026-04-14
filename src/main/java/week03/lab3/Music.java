package week03.lab3;

import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music() {

    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user) {
        user.getPurchaseMediaList().add(this);
        System.out.println(user.getUserName() + " listened to music: " + getTitle());
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {
        ArrayList<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (!music.getTitle().equals(getTitle()) && music.getArtist().equalsIgnoreCase(getArtist())) {
                playlist.add(music);
            }
        }
        return playlist;
    }

    public String getMediaType(){
        return getPrice() >= 10 ? "Premium Music" : "Music";
    }

    public String toString(){
        return "Title: " + getTitle() +
                ", Artist: " + artist +
                ", Writer: " + getAuteur() +
                ", Price: " + getPrice() +
                ", Type: " + getMediaType();
    }
}
