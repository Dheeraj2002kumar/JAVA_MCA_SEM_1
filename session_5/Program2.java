package session_5;
// If the loop passes the values ranging from 1 to 5, it prints "No Yatzy". Whenever it passes the value 6, it prints "Yatzy!"

public class Program2 {
    public static void main(String[] args) {
        int i = 1;

        while(i < 7){
            if (i <= 5){
                System.out.println("No Yatzy");
            } else {
                System.out.println("Yatzy!");
            }
            i++;
        }
    }
}


/*
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_5> javac -d out Program2.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_5> java -cp out Program2.java
No Yatzy
No Yatzy
No Yatzy
No Yatzy
No Yatzy
Yatzy!
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_5> 

*/ 