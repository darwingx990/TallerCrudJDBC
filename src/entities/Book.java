package entities;

public class Book extends Authors{
    private int id;
    private int idAuthor;
    private String title;
    private String publicationDate;
    private int price;

    public Book() {
    }

    public Book(int id, String name, String nacionality, int id1, int idAuthor, String title, String publicationDate, int price) {
        super(id, name, nacionality);
        this.id = id1;
        this.idAuthor = idAuthor;
        this.title = title;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", idAuthor=" + idAuthor +
                ", title='" + title + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", price=" + price +
                '}';
    }
}
