package session_5;

import java.util.Scanner;

public class ATMPinCheck {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int PIN = 1111;
            
            int i = 1;
            System.out.println("Enter 4 digit PIN.");
            do{
                
                int userPIN = scanner.nextInt();
                if (userPIN != PIN){
                    System.out.println("Please enter correct PIN!");
                } else{
                    System.out.println("PIN is Correct.");
                    break; 
                }
                if (i == 3 && userPIN != PIN){
                    System.out.println("Try Next Time.");
                }
                i++;
            }
            while(i <= 3);
            

        }
    }
}

/*
 
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_5> javac -d out ATMPinCheck.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_5> java -cp out ATMPinCheck.java
Enter 4 digit PIN.
3322
Please enter correct PIN!
4433
Please enter correct PIN!
1111
PIN is Correct.
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_5> 

 */