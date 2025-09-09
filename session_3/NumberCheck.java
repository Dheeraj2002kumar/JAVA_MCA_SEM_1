
import java.util.Scanner;

// to find out given number positive, negative or zero with user input

public class NumberCheck {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter a number: ");

            int num = scanner.nextInt();

            if (num > 0){
                System.out.println("Number is positive.");
            } else if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                System.out.println("Number is Zero.");
            }
        }
    }
}


// -------------------------- output ----------------------------

/*

PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> javac -d out NumberCheck.java        
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> java -cp  out NumberCheck.java
Enter a number: 
4
Number is positive.
*/