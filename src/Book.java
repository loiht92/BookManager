public class Book {
    public String bookCode;
    public String name;
    public int price;



    public Book(String bookCode, String name, int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "\nbookCode:" + bookCode + '\t' +
                ", name:" + name + '\t' +
                ", price:" + price ;
    }
}
