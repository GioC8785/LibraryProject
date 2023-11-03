import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static String[] books = new String[5];

    static {
        books[0] = "12 Rules of Life";
        books[1] = "Hunger Games";
        books[2] = "Brothers Karamazov";
        books[3] = "Idiot";
        books[4] = "Crime and Punishment";
    }

    public static boolean[] availability = new boolean[5];

    static {
        availability[0] = true;
        availability[1] = false;
        availability[2] = true;
        availability[3] = true;
        availability[4] = false;
    }

    public static String[] members = new String[5];

    static {
        members[0] = "John Perkins";
        members[1] = "Yash Patel";
        members[2] = "Giorgi Chumburidze";
        members[3] = "Alex Brown";
        members[4] = "John Doe";
    }

    public static void main(String[] args) {
        System.out.println("Hello, Please Enter Your Name");

            if (members.equals(sc.next())) {
                System.out.println("Welcome");
            }
        System.out.println("Books in Library");
        System.out.println("-----------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
            // put any of the book names from the array list, in the following methods.
            System.out.println("------------------------------------------------------------------");
            displayAvailableBooks(); // displays books available
            System.out.println("-------------------------------------------------------------");
            borrowBook("12 Rules of Life"); // Takes the book out and updates availability
            System.out.println("--------------------------------------------------------------");
            displayAvailableBooks(); // displays the books again, but this time, without book given --- updates to not available
            System.out.println("--------------------------------------------------------------");
            borrowBook("12 Rules of Life"); // not available, so will say not available
            System.out.println("--------------------------------------------------------------");
            returnBook("12 Rules of Life"); // returns and changes availability to TRUE
            System.out.println("--------------------------------------------------------------");
            borrowBook("12 Rules of Life"); // lets the book be borrowed
    }

    public static void displayAvailableBooks() {
        System.out.println("Books Available Are The Following");
        System.out.println("---------------------------------");

        for (int i = 0; i < availability.length; i++) {
            if (availability[i] == true) {
                System.out.println(books[i]);
            }
        }

    }

    public static void borrowBook(String bookName) {

        for (int i = 0; i < books.length; i++) {
            if (bookName.equals(books[i])) {
                if (availability[i] == true) {
                    System.out.println("Book is in library and is available");
                    availability[i] = false;
                    break;
                } else if (availability[i] == false) {
                    System.out.println("Book is in library, but not available");
                    break;
                }
            }
        }
    }


    public static void returnBook(String returnBook) {
        for (int i = 0; i < books.length; i++) {
            if (returnBook.equals(books[i])) {
                if (availability[i] == false) {
                    availability[i] = true;
                    System.out.println("Thanks for returning");
                }
            }

        }
    }

}