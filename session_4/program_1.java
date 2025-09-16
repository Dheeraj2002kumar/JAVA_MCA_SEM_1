package session_4;

public class program_1 {
    public static void main(String[] args) {
        
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18){
            System.out.println("Old enough to vote.");
            if (isCitizen){
                System.out.println("And you are citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        }
        else {
            System.out.println("Not old enough to vote.");
        }
    }
}


/*
 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> javac -d out program_1.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> java -cp out program_1.java
Old enough to vote.
And you are citizen, so you can vote!
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_4> 
 */