import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        
        System.out.println("Enter the value to search for: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    System.out.println("Value found at: (" + row + ", " + col + ")");
                    found = true;
                    break; // Stop searching once the value is found
                }
            }
            if (found) break; // Exit the outer loop as well
        }
        
        if (!found) {
            System.out.println("Value not found in the matrix.");
        }
        
        scanner.close();
    }
}
