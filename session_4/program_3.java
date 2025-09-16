package session_4;

// 3. Progarm so that user aged between 18 and 60 with a valid ID is allowed entry, but other are denied.

import java.util.Scanner;

public class program_3 {
	public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();

            System.out.println("Enter valid ID: (true / false) ");

            boolean hasId = scanner.nextBoolean();

            if (age >= 18 && age <= 60 && hasId){
                System.out.println("Access granted.");
            } else {
                System.out.println("Access denied.");

            }
        }
    }
}


/*
 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> javac -d out program_3.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> java -cp out program_3.java
Enter the age: 
44
Enter valid ID: (true / false) 
true
Access granted.
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> 
 */