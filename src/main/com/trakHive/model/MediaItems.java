package main.com.trakHive.model;

public class MediaItems {
    private int releaseYear;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int rating;
    private int id;
    private String name;
    private String genre;
    private String status;

    public MediaItems(int releaseYear, int rating, int id, String name, String genre, String status) {
        this.name = name;
        this.genre = genre;
        this.status = status;
    }
}
