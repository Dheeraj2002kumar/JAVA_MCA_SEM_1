
import java.util.Scanner;


public class SimpleCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter two number: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int add = num1 + num2;
            int sub = num1 - num2;
            int mul = num1 * num2;
            float div = num1 / num2;
            float modulo = num1 % num2;

            System.out.println("Addition of num1 + num2 = "+ add);
            System.out.println("Subtraction of num1 + num2 = " + sub);
            System.out.println("Multiplication of num1 + num2 = " + mul);
            System.out.println("Division of num1 + num2 = " + div);
            System.out.println("Reminder of num1 + num2 = " + modulo);
        }
    }
}



// -------------------- output ---------------------------------

// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> javac -d out SimpleCalculator.java 
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> java -cp out SimpleCalculator.java
// Enter two number: 
// 5
// 6
// Addition of num1 + num2 = 11
// Subtraction of num1 + num2 = -1
// Multiplication of num1 + num2 = 30
// Division of num1 + num2 = 0.0
// Reminder of num1 + num2 = 5.0
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> 