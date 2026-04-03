public class Book implements LibraryResource {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void borrow() {
        System.out.println("Borrowing book: " + title);
    }

    public String getTitle() {
        return title;
    }
}
