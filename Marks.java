package baitap;

import java.util.Scanner;

public class Marks {
    int marks[][];
    byte markscount;

    public Marks(){
        marks = new int[4][4];
        markscount = 0;
    }

    public void addMarks(){
        Scanner input = new Scanner(System.in);
        if (markscount < marks.length){
            System.out.println("nhap diem thu 1:");
            marks[markscount][0] = input.nextInt();

            System.out.println("nhap diem thu 2:");
            marks[markscount][1] = input.nextInt();

            System.out.println("nhap diem thu 3:");
            marks[markscount][1] = input.nextInt();

            System.out.println("nhap diem thu 4:");
            marks[markscount][3] = input.nextInt();

            markscount++;
        }else{
            System.out.println("xin loi!da qua gioi han");
        }

    }
    void displayMraks(){
        if (markscount > 0){
            System.out.println("\nDiem1 \t\t Diem2 \t\t Diem3 \t\t Diem4");
            System.out.println("----------------------------------------");

            for (int rowIndex = 0;rowIndex < markscount;markscount++){
                System.out.printf("%d\t\t", marks[rowIndex][0]);
                System.out.printf("%d\t\t", marks[rowIndex][1]);
                System.out.printf("%d\t\t", marks[rowIndex][2]);
                System.out.printf("%d\n", marks[rowIndex][3]);
            }
        }else{
            System.out.println("khong co diem de hien thi");
        }
    }
    void searchByName(){
        boolean markFound= false;

        if (markscount>0){
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the mark you want to "+ "search for: ");

            int searchByName = input.nextInt();
            System.out.println("\nDiem1 \t\t Diem2 \t\t Diem3 \t\t Diem4");
            System.out.println("---------------------------");

            for (int rowIndex =0 ; rowIndex < markscount ; rowIndex++){
                if (marks[rowIndex][0]==searchByName){
                    System.out.printf("%d\t\t",marks[rowIndex][0]);
                    System.out.printf("%d\t\t",marks[rowIndex][1]);
                    System.out.printf("%d\t\t",marks[rowIndex][2]);
                    System.out.printf("%d\t\t",marks[rowIndex][3]);
                    markFound = true;
                    break;
                }
            }
            if (!markFound)
                System.out.println("Mark not found");
        }
        else
            System.out.println("No mark to search");

    }
}
