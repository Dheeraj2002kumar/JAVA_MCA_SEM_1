package session_8;

import java.util.Scanner;

public class TwoDArrayInputDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input size of the array
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int col = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++){
                System.out.println();
            }
            
        }

    }
}
