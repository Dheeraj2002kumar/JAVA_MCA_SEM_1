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
