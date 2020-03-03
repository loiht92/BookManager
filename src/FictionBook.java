public class FictionBook extends Book {
    private String category;


    public FictionBook(String bookCode, String name, int price, String category) {
        super(bookCode, name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nFictionBook{"+ super.toString() +
                "category='" + category + '\'' +
                '}';
    }
}
