package session_6;

public class nestedFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i);

            for(int j = 1; j <= 3; j++){
                System.out.println("Inter: " + j);
            }
        }
    }
}

/*
 
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out nestedFor.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out nestedFor.java
Outer: 1
Inter: 1
Inter: 2
Inter: 3
Outer: 2
Inter: 1
Inter: 2
Inter: 3
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 

 */