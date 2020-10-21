package baitap;

import java.util.Scanner;

public class BookRepositoryTest {
    Book[] books;
    byte bookCount;

    public BookRepositoryTest() {
        bookCount = 0;
    }

    //addbook
    public void addBook() {
        Scanner input = new Scanner(System.in);
        if (bookCount < books.length) {
            books[bookCount] = new Book();

            System.out.println("Enter the name of books");
            books[bookCount].name = input.nextLine();
            System.out.println("Enter author name");
            books[bookCount].authorName = input.nextLine();
            System.out.println("Enter book price");
            books[bookCount].isbn = input.nextInt();
            System.out.println("Enter ISBN of the book");
            books[bookCount].price = input.nextFloat();
            System.out.println("Enter year of publication");
            books[bookCount].yearPublished = input.nextShort();

            bookCount++;

        } else {
            System.out.println("sorry!unable to add  book.\n");
        }
    }

    //header
    public void displayHeader() {
        System.out.format("%1$-10s %2$-25s %3$-25s %4$-10s %5$-10s", "ISBN", "Book Name", "Author Name", "price($)", "year of" + "publication");
    }

    //displayBook
    public void displayBook() {
        if (bookCount > 0) {
            displayHeader();
            System.out.println("---------------------------------------------------------------------------------");

            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                System.out.printf("%d\t", books[rowIndex].isbn);
                System.out.printf("%d\t\t\t", books[rowIndex].name);
                System.out.printf("%d\t\t\t\t", books[rowIndex].authorName);
                System.out.printf("%d\t\t", books[rowIndex].price);
                System.out.printf("%d\n", books[rowIndex].yearPublished);
            }
        }
    }

    //search
    public void searchByBookName() {
        Scanner input = new Scanner(System.in);
        String bookName = "";
        boolean bookFound = false;
        if (bookCount > 0) {
            System.out.println("Enter a book name to search for");
            bookName = input.nextLine();
            displayHeader();
            System.out.println("---------------------------------------------------------------------------------");
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                if (books[rowIndex].name.indexOf(bookName) != -1) {
                    System.out.printf("%d\t", books[rowIndex].isbn);
                    System.out.printf("%d\t\t\t", books[rowIndex].name);
                    System.out.printf("%d\t\t\t\t", books[rowIndex].authorName);
                    System.out.printf("%d\t\t", books[rowIndex].price);
                    System.out.printf("%d\n", books[rowIndex].yearPublished);
                }
                bookFound = true;
            }
        }
        if (!bookFound) {
            System.out.println("book not found");
        }else {
            System.out.println("No book to search");
        }
    }



    public static void main(String[] args) {
        byte numberOfBooks = Byte.parseByte(args[0]);
        BookRepositoryTest ojbRepository = new BookRepositoryTest();
        ojbRepository.books = new Book[numberOfBooks];

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWelcome to E-Repository.\n" + "Select the operation you want to perform:");
            System.out.println("******************************************");
            System.out.println("1. Add book to the repository");
            System.out.println("2. Search book by book name");
            System.out.println("3. Display book .");
            System.out.println("4. Exit");
            System.out.println("*****************************************\n");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    ojbRepository.addBook();
                    break;
                case 2:
                    ojbRepository.searchByBookName();
                    break;
                case 3:
                    ojbRepository.displayBook();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("not a valid choice");
            }
        }while (choice != 4);

    }
}
