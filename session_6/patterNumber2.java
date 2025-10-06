package session_6;

public class patterNumber2 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out patterNumber2.java
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out patterNumber2.java
// 1 2 3 
// 4 5 6
// 7 8 9
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 