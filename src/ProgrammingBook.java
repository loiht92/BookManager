import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        return "\nProgrammingBook{" + super.toString() +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        ProgrammingBook book = new ProgrammingBook("abc", "tu duy lap trinh",200, "java", "hvd");
//        ProgrammingBook book1 = new ProgrammingBook("aabd", "lap trinh java",250, "java", "hvtrd");


        ArrayList<Book> books = new ArrayList<>();
//        books.add(book);
//        books.add(book1);
//        write("/Users/holoi/IdeaProjects/BookArrayList/text.txt",books);
        read(books);
        System.out.println(books.get(0).getName());


    }

//    public ProgrammingBook[] creat(){
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so luong book");
//        n = Integer.parseInt(sc.nextLine());
//        ProgrammingBook [] book = new ProgrammingBook[n];
//        for (int i = 0 ; i < n ; i++){
//            System.out.println("Nhap ma sach");
//            String code = sc.nextLine();
//            System.out.println("Nhap ten sach");
//            String name = sc.nextLine();
//            System.out.println("Nhap gia sach");
//            int price = Integer.parseInt(sc.nextLine());
//            System.out.println("Nhap language");
//            String language = sc.nextLine();
//            System.out.println("Nhap framework");
//            String framework = sc.nextLine();
//            book[i] = new ProgrammingBook(code, name,price,language,framework);
//        }
//        return book;
    //}
    public static void write(String FilePath, List<Book> books) {
       try {

           FileWriter file = new FileWriter(FilePath);
           BufferedWriter buffer = new BufferedWriter(file);
           for (int i = 0; i< books.size(); i++){
               buffer.write(books.get(i).getBookCode() + "," + books.get(i).getName() + "," + books.get(i).getPrice() + "\n");
           }
           buffer.flush();
           buffer.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
    public static void read(ArrayList<Book> list) {
        try {
            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufferedReader.readLine()) != null)
            {
                String[] obj = line.split(",");
                list.add(new Book(obj[0],obj[1],Integer.parseInt(obj[2])));

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void show(ProgrammingBook[] book) {
        try {
            for (int i = 0; i < book.length; i++) {
                System.out.println(i + "Ma sach" + book[i].getBookCode() + "Ten sach" + book[i].getName() + "Gia sach" + book[i].getPrice() + "Ngon ngu" + book[i].getLanguage() + "framework" + book[i].getLanguage());
            }
        } catch (NullPointerException e) {
            System.out.println("File trong");
        }
    }
}
