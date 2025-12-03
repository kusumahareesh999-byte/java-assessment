import java.util.Scanner;

public class MarksClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 95 && marks <= 100) {
            System.out.println("Distinction");
        } 
        else if (marks >= 81 && marks <= 94) {
            System.out.println("Distinction");
        } 
        else if (marks >= 61 && marks <= 80) {
            System.out.println("First Class");
        } 
        else if (marks >= 41 && marks <= 60) {
            System.out.println("Second Class");
        } 
        else if (marks >= 25 && marks <= 40) {
            System.out.println("Pass");
        } 
        else if (marks >= 0 && marks < 25) {
            System.out.println("Fail");
        } 
        else {
            System.out.println("Invalid Marks! Enter between 0–100.");
        }

        sc.close();
    }
}
