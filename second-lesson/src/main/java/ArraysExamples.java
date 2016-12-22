import java.util.List;
import java.util.Scanner;

/**
 * Examples for arrays.
 */
public class ArraysExamples {

  static void fillArray(int[] array, Scanner input) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
    }
  }

  static void printArray(int[] array) {
    System.out.print("[");
    int n = array.length;

    for (int i = 0; i < n; i++) {
      System.out.print(" " + array[i]);
    }
    System.out.println(" ]");
  }

  public static void main(String[] args) {
    int n;
    Scanner input = new Scanner(System.in);
    System.out.print("N = ");
    n = input.nextInt();
    int[] array = new int[n];
    fillArray(array, input);
    printArray(array);
  }
}
