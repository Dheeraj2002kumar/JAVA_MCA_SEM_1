package session_6;

public class evenNum {
    public static void main(String[] arg){
        for (int i = 50; i <= 60; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}


// output
/*
 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1> cd .\session_6\
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out evenNum.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out evenNum.java
50
52
54
56
58
60
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 
 */