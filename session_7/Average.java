package session_7;

public class Average {
        public static void main(String[] args) {
        int[] ages={34,54,332,45,24,546};
        float sum=0;
        float avg;

        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
            
        }
        avg = sum/ages.length;
        System.out.println("Average "+avg);

        
        }
}


/*
 
output 

PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_7> javac -d out Average.java        
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_7> java -cp out Average.java        
Average 172.5
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_7> 

 */