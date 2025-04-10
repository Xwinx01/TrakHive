package main.com.trakHive.model;
public class Movie {
    public Movie(String title, String director, int year, String genre, String status, String review) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.status = status;
        this.review = review;
    }

    private String title;
    private String director;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    private int year;
    private String genre;
    private String status; // e.g. watched / want to watch
    private String review;

    // Constructor
    // Getters and setters
    // toString() for display
}
