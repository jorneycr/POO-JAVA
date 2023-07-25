package products_interface;

public class Library {
    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Hi Book");
        System.out.println(book.getName());
    }
}
