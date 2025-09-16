package session_4;
import java.util.Scanner;
// 4. take a user input and check entered value is 0 to 5 then print entered value otherwase enter valid number.

public class program_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 to 5): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Zero selected.");
                break;
            case 1:
                System.out.println("You selected One.");
                break;
            case 2:
                System.out.println("You selected Two.");
                break;
            case 3:
                System.out.println("You selected Three.");
                break;
            case 4:
                System.out.println("You selected Four.");
                break;
            case 5:
                System.out.println("You selected Five.");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 0 and 5.");
        }
        scanner.close();
    }

}


/*
 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> javac -d out program_4.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> java -cp out program_4.java
Enter a number (0 to 5): 4
You selected Four.
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> 
 */