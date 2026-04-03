public class Thesis implements LibraryResource {

    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    public void borrow() {
        System.out.println("Borrowing thesis: " + title);
    }

    public String getTitle() {
        return title;
    }
}
