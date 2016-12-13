import java.util.Scanner;

/**
 * Examples for matrices.
 */
public class MatrixExamples {

  static void fillMatrix(int[][] array, Scanner input) {
    int n = array.length;
    int m = array[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(String.format("A[%d][%d] = ", i, j));
        array[i][j] = input.nextInt();
      }
    }
  }

  static void printMatrix(int[][] array) {
    int n = array.length;
    int m = array[0].length;
    for (int i = 0; i < n; i++) {
      System.out.print("[");
      for (int j = 0; j < m; j++) {
        System.out.print(" " + array[i][j]);
      }
      System.out.println(" ]");
    }
  }

  public static void main(String[] args) {
    int n;
    int m;
    Scanner input = new Scanner(System.in);
    System.out.print("N = ");
    n = input.nextInt();
    System.out.print("M = ");
    m = input.nextInt();
    int[][] matrix = new int[n][m];
    fillMatrix(matrix, input);
    printMatrix(matrix);
  }
}
