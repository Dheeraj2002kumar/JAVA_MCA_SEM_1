package session_6;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { 
                return false;
            }
        }
        return true; 
    }
}

/*

PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out primeNumber.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out primeNumber.java
Enter a number: 55
55 is not a prime number.
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 

 */