import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner inp=new Scanner(System.in);
    int number=inp.nextInt(); 
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

