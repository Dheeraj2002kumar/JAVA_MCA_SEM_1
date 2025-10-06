package session_6;

import java.util.Scanner;

public class sumOfNumber {
    public static void main(String[] arg){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the Number that you want to sum: ");
            int userInput = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= userInput; i++){
                sum += i;
            }
            System.out.println("Sum is: " + sum);
        }
    }
}


// output

/*
 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out sumOfNumber.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out sumOfNumber.java
Enter the Number that you want to sum: 
10
Sum is: 55
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 
 */