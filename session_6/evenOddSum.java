package session_6;

public class evenOddSum {
    public static void main(String[] args) {
        int start = 45;
        int end = 50;
        int EvenSum = 0;
        int OddSum = 0;

        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                System.out.println("Even number: " + i);
                EvenSum += i;
            } else{
                System.out.println("Odd Number: "+ i);
                OddSum += i;
            }
        }
        System.out.println("Sum of Even number "+ EvenSum);
        System.out.println("Sum of Odd number: "+ OddSum);
    }
}


/*
 
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out evenOddSum.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out evenOddSum.java
Odd Number: 45
Even number: 46
Odd Number: 47
Even number: 48
Odd Number: 49
Even number: 50
Sum of Even number 144
Sum of Odd number: 141
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 

 */