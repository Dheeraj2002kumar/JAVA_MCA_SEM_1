package session_7;

public class FindSmallestEle {
        public static void main(String[] args) {
        int[] number={12,34,12,45,21,55};
        int num=number[0];

        for(int i=1; i<number.length;i++){
            if(number[i]<num){
                num=number[i];

            }
        }
        System.out.println("small number is in array:" +num);
    }
}


/*
 Output 

 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_7> javac -d out FindSmallestEle.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_7> java -cp out FindSmallestEle.java
small number is in array:12
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_7> 


PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac6>  & 'C:\Program Files\Java\jdk-21\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\nbehe\AppData\Roaming\Code\User\workspaceStorage\498596cb4579c23595c74b822f1a0851\redhat.java\jdt_ws\java_prac6_4f5d69fd\bin' 'smaller' 
small number is in array:12

 */