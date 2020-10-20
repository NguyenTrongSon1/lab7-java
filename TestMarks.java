package baitap;

import java.util.Scanner;

public class TestMarks {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        Marks objMark = new Marks();

        do{
            System.out.println("\n Welcome to E-Repository" +" Seclect the operaton you want perform :") ;
            System.out.println("***********************************");
            System.out.println("1.Add mark");
            System.out.println("2.Search By Name Subject");
            System.out.println("3.Display all");
            System.out.println("4.Exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    objMark.addMarks();
                    break;
                case 2 :
                    objMark.searchByName();
                    break;
                case 3:
                    objMark.displayMraks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice !=4);
    }
}
