package Model.Book;

public class Book {

    private int id;
    private String title;
    private String author;
    private String releaseYear;



    @Override
    public String toString() {
        return "Book: "
                + "id: " + id
                + ", title: " + title
                + ", author: " + author
                + ", releaseYear: " + releaseYear;
    }

    public Book(int id, String title, String author, String releaseYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}
