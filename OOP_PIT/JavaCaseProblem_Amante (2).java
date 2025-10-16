import java.util.Scanner;

public class JavaCaseProblem_Amante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Name: Airen Amante");
        System.out.println("ID Number: 2024303249");
        System.out.println("--------------------------");

        System.out.print("Enter Grade (0 - 100): ");
        double grade = input.nextDouble();

       
        String result;

        if (grade >= 90 && grade <= 100) {
            result = "A - Excellent";
        } else if (grade >= 80) {
            result = "B - Very Good";
        } else if (grade >= 70) {
            result= "C - Good";
        } else if (grade >= 60) {
            result = "D - Fair";
        } else if (grade >= 0) {
            result= "F - Failed";
        } else {
            result = "Invalid grade entered!";
        }

        System.out.println("\n--------------------------");
        System.out.println("Result: " + result);
        System.out.println("--------------------------");
 
        input.close();
    }
}

