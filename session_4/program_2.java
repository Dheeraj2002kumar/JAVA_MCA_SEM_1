
// 2. example of nested if program in java that checks a number and prints whether it is positive, negative, or zero  and additionally whether it is even or odd if it is positive.

package session_4;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();

            if (num > 0){
                System.out.println("number is positive.");

                if (num % 2 == 0){
                    System.out.println("Number is Even");
                } else {
                    System.out.println("Number is Odd.");
                }

            } else if (num < 0){
                System.out.println("Number is negative.");
            } else{
                System.out.println("Number is zero.");
            }
        }
    }
}


/*
 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> javac -d out program_2.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> java -cp out program_2.java
Enter the number: 
33
number is positive.
Number is Odd.
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> 

 */