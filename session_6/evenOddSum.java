package session_6;

public class evenOddSum {
    public static void main(String[] args) {
        int start = 20;
        int end = 50;
        int EvenSum = 0;
        int OddSum = 0;

        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                System.out.println("Even number: " + i);
                EvenSum += i;
            } else{
                System.out.println("Odd Number: "+ i);
                OddSum += i;
            }
        }
        System.out.println("Sum of Even number "+ EvenSum);
        System.out.println("Sum of Odd number: "+ OddSum);
    }
}
