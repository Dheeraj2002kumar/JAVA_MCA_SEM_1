
import java.util.Scanner;

public class Checkgreaternumber{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter number: ");

            int num = scanner.nextInt();

            if (num > 5){
                System.out.println(num + " is greater than 5.");
            } else{
                System.out.println(num + " is less than or equal to 5.");
            }
        }
    }
}

// ------------------------ output -----------------------------
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> javac -d out Checkgreaternumber.java
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> java -cp  out Checkgreaternumber.java
// Enter number: 
// 4
// 4 is less than or equal to 5.
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> 