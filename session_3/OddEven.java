// write a program to take user input and check number is Odd or Even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the number: ");

            int num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println(num + " is a Even number.");
            } else{
                System.out.println(num + " is a Odd number.");
            }

        }
    }
}
