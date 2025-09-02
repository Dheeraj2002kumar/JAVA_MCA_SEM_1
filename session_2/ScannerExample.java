package session_2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // create a scanner object for console input
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // read a line for text

            System.out.println("Enter your age: ");
            int age = scanner.nextInt(); // read an integer

            System.out.println("Hello, " + name + "! "+ age + " years old");

        }
    }
}

// ----------------------- output --------------------------------------
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_2> javac -d out ScannerExample.java     
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_2> java -cp out session_2.ScannerExample
// Enter your name: 
// Dheeraj 
// Enter your age: 
// 23
// Hello, Dheeraj ! 23 years old
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_2> 