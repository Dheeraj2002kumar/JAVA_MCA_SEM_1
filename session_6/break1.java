package session_6;

public class break1 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            if (i == 5){
                System.out.println("Breaking loop at i = "+ i);
                break;
            }
            System.out.println(i);
        }
    }
}


//output

// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> java -cp out break1.java
// 1
// 2
// 3
// 4
// Breaking loop at i = 5
// PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_6> javac -d out continue1.java