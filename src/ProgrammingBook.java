public class ProgrammingBook extends Book {
    public String language;
    private String framework;

    public ProgrammingBook(String bookCode, String name, int price, String language, String framework) {
        super(bookCode, name, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "\nProgrammingBook{"+super.toString() +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
