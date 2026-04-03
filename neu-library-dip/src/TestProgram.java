public class TestProgram {

    public static void main(String[] args) {

        Student student = new Student("Angela");

        LibraryResource book = new Book("Introduction to Programming");
        LibraryResource journal = new Journal("AI Research Journal");
        LibraryResource thesis = new Thesis("Machine Learning Thesis");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
    }
}
