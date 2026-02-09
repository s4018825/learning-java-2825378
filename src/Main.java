import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double studentGPA = 1.1;
        String studentFirstName = "Tommy";
        String studentLastName = "Tran";
        System.out.println(studentFirstName + 
            " " + studentLastName + " has a GPA of " + studentGPA + ".");

        System.out.println("What do you want to update it to?");

        Scanner scnr = new Scanner(System.in);
        studentGPA = scnr.nextDouble();

        System.out.println(studentFirstName + " " + 
        studentLastName + " now has a GPA of " + studentGPA + ".");
    }
}
