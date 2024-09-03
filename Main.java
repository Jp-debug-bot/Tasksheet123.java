public class Main {
    public static void main(String[] args) {
        // Creating three Book objects with different values
        Book book1 = new Book("1984", "George Orwell", 1949, 9.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99);

        // Printing out the details of each book using toString()
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
