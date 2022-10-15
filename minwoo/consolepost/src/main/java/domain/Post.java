package domain;

public class Post {
    private int id;
    private String title;
    private String author;
    private String body;

    public Post(String title, String author, String body) {
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public void setId(int id) {
        this.id = id;
    }
}
