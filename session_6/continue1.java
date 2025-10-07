package session_6;

public class continue1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            if (i == 4){
                continue;
            }
            if (i % 2 != 0){

                System.out.println("Odd number: " + i);
            }
        }
    }
}

/*
 
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out continue1.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out continue1.java
Odd number: 1
Odd number: 3
Odd number: 5
Odd number: 7
Odd number: 9
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 

 */