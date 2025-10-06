package session_6;

/*
1 2 3 
2 4 6
3 6 9
*/ 
public class patterFor1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(i* j + " ");
                
            }
            System.out.println();
        }
    }
}


// output

/*
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out patterFor1.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out patterFor1.java
1 2 3 
2 4 6
3 6 9
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> 
*/