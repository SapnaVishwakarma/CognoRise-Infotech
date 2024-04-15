import java.util.Scanner;

public class Book {
    public static void main(String[] args) {


        char r;
        do {

            System.out.println("*******Library Management System*******");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a Book");
            System.out.println("Press 4 to print complete issue de" +
                    "tails");
            System.out.println("Press 5 to exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any Number");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Library library1 = new Library();
                    library1.add();
                    break;
                case 2:
                    Library library2 = new Library();
                    library2.issue();
                    break;
                case 3:
                    Library library3 = new Library();
                    library3.ret();
                    break;
                case 4:
                    Library library4 = new Library();
                    library4.detail();
                    break;
                case 5:
                    Library library5 = new Library();
                    library5.exit();
                default:
                    System.out.println("Invalid Number");

            }
            System.out.println("Do You want to select next option Y/N");
            r = scanner.next().charAt(0);   }
            while (r == 'y' || r == 'Y') ;
            if (r == 'n' || r == 'N') {
                Library l = new Library();
                l.exit();
            }

    }
}

class Library{
   static int total_noofbook;
   static String b_name,i_date,return_d,book_Author;
    Scanner scanner =new Scanner(System.in);
    void add(){
        System.out.println("Enter book title and Author  ");
       Scanner scanner =new Scanner(System.in);
        String title =scanner.nextLine();
        String author =scanner.nextLine();
        System.out.println("your details is: "+ title + " Author: "+ author );
    }

    void issue(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Book Name");
         b_name =scanner.nextLine();
        System.out.println("Book_Author");
         book_Author = scanner.nextLine();
        System.out.println("issue date");
         i_date = scanner.nextLine();
        System.out.println("Total number of book Issued");
         total_noofbook = scanner.nextInt();
        System.out.println("Return book date");
         return_d = scanner.nextLine();
    }
    String getid(){
        return book_Author;
    }
    void ret(){
        System.out.println("Enter Student_name and book_Author");
        String name =scanner.nextLine();
        String bookAuthor =scanner.nextLine();
        if(book_Author == bookAuthor){
            System.out.println("Total Details");
            System.out.println("Book Name::" + Library.b_name );
            System.out.println("Book Author::"+ Library.book_Author);
            System.out.println("Issue date::"+Library.i_date);
            System.out.println("Total number of book Issue "+Library.total_noofbook);
            System.out.println("Book Return date"+Library.return_d);
        }
        else{
            System.out.println("Wrong ID.Please enter correct id");
        }
    }
    void detail(){
        System.out.println("Book Name::" + Library.b_name );
        System.out.println("Book id::"+ Library.book_Author);
        System.out.println("Issue date::"+Library.i_date);
        System.out.println("Total number of book Issue "+Library.total_noofbook);
        System.out.println("Book Return date "+Library.return_d);
    }
    void exit(){
        System.exit(0);
    }
}

