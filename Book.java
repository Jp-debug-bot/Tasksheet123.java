public class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // toString method to print out the details of the book
    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Year Published=" + yearPublished +
                ", Price=$" + price +
                '}';
    }
}
