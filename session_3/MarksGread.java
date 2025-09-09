

// Write a java program that takes the user's marks(0 to 100) as input and prints the grade acording to the following criteria:
/*
* Marks >= 90 --> Grade A
* Marks >= 75 and < 90 --> Grade B
* marks >= 50 and < 75 --> Grade c
* Marks < 50 --> Grade F
* 
*/

import java.util.Scanner;
public class MarksGread {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter marks: ");
            int marks = scanner.nextInt();

            if (marks >= 90){
                System.out.println("Grade A");
            } else if (marks >= 75 && marks < 90){
                System.out.println("Grade B");
            } else if (marks >= 50 && marks < 75){
                System.out.println("Grade C");
            } else{
                System.out.println("Grade F");
            }

        }
    }
}


// --------------------- output --------------------------

/*

PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> javac -d out MarksGread.java  
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> java -cp  out MarksGread.java
Enter marks: 
90
Grade A
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_3> 

*/