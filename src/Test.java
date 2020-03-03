import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Book book1 = new ProgrammingBook("01", "Think java", 320, "Java", "");
        Book book2 = new ProgrammingBook("02", "Khong theo loi mon", 500, "Viet Nam", "");
        Book book3 = new ProgrammingBook("03", "Effective java", 400, "Java", "");
        Book book4 = new ProgrammingBook("04", "Java performance", 350, "Java", "");
        Book book5 = new ProgrammingBook("05", "Nghe thuat cua tu duy", 450, "Viet Nam", "");

        Book book6 = new FictionBook("06", "Tham tu lung danh Conan", 150, "Truyen trinh tham");
        Book book7 = new FictionBook("07", "Boss tro thanh chong", 200, "Truyen ngon tinh");
        Book book8 = new FictionBook("08", "Suc manh cua tu duy ", 220, "Tam li hoc");
        Book book9 = new FictionBook("09", "Suc manh than ki", 300, "Tam li hoc");
        Book book10 = new FictionBook("10", "Lich su Chau Au", 250, "Lich su");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

//        System.out.println(books.toString());
//        System.out.println(books.size());


        System.out.println("Tong gia 10 cuon sach la:" + totalPrice(books));

        System.out.println("So luong cuon sach co ten java:" + numberOfBook(books));

        System.out.println("Mang sau khi sap xep chon" + selectionSort(books));
        System.out.println("Mang sau khi sap xep chen" + insertionSort(books));
        System.out.println("Mang sau khi sap xep noi bot" + bubbleSort(books));

        System.out.println("Gia cua cuon sach co ten Think java" +binarySearch(books, 0, books.size()-1, "Think java"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cuon sach can tim");
        String name = sc.nextLine();
        for (Book book : books){
            if (book.getName().equals(name)){
                System.out.println("Gia cua cuon" +book.getName() + "la" +book.getPrice());
            }
        }
        // listBook.add(0, book1.price );


    }


    public static int totalPrice(ArrayList<Book> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getPrice();
        }
        return sum;
    }

    public static int numberOfBook(ArrayList<Book> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof ProgrammingBook) {
                if (((ProgrammingBook) list.get(i)).language.toLowerCase().equals("java")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<Book> selectionSort(ArrayList<Book> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Book currentMin = list.get(i);
            int currentIndex = list.indexOf(list.get(i));

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.getPrice() > list.get(j).getPrice()) {
                    currentMin = list.get(j);
                    currentIndex = list.indexOf(list.get(j));
                }
            }
            if (currentIndex != i) {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
        return list;
    }

    public static ArrayList<Book> insertionSort(ArrayList<Book> list) {
        for (int i = 1; i < list.size(); i++) {
            Book currentElement = list.get(i);
            int k;
            for (k = i - 1; k >= 0 && list.get(k).getPrice() > currentElement.getPrice(); k--) {
                list.set(k + 1, list.get(k));
            }
            list.set(k + 1, currentElement);
        }
        return list;
    }

    public static ArrayList<Book> bubbleSort(ArrayList<Book> list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.size() - k; i++) {
                if (list.get(i).getPrice() > list.get(i + 1).getPrice()) {
                    Book temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                    needNextPass = true;
                }
            }
        }
        return list;
    }

    public static int binarySearch(ArrayList<Book> list, int low, int high, String name) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            int result = name.compareTo(list.get(mid).getName());
            if (result == 0) {
                return list.get(mid).getPrice();
            }else
            if (result > 0) {
                return binarySearch(list, mid + 1, high, name);
            } else {
                return binarySearch(list, low, mid - 1, name);
            }
        }
        return -1;
    }

}

























