import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution to the task.
 */
public class TaskSolution {

  static void fillArrayWithRandomNumbers(int[] array, Scanner input) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      System.out.print(i + " = ");
      array[i] = input.nextInt();
    }
  }

  static void printArray(int[] array) {
    StringBuilder sb = new StringBuilder();
    int n = array.length;

    sb.append("[");
    for (int i = 0; i < n; i++) {
      sb.append(" " + array[i]);
    }
    sb.append(" ]");
    System.out.println(sb.toString());
  }

  static int firstEquilibriumSolution(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int sumLeft = 0;
      int sumRight = 0;

      for (int j = 0; j < i; j++) {
        sumLeft += array[j];
      }
      for (int j = i + 1; j < n; j++) {
        sumRight += array[j];
      }

      if (sumLeft == sumRight) {
        return i;
      }
    }
    return -1;
  }

  static int secondEquilibriumSolution(int[] array) {
    int n = array.length;
    int totalSum = 0;
    int sumLeft = 0;
    //sum of all elements
    for (int i = 0; i < n; i++) {
      totalSum += array[i];
    }

    for (int i = 0; i < n; i++) {

      int sumRight = totalSum - sumLeft - array[i];
      if (sumLeft == sumRight) {
        return i;
      }

      sumLeft += array[i];
    }

    return -1;
  }

  static int advancedSolution(int[] array) {

    int n = array.length;
    for (int i = 0; i < n; i++) {
      int sumLeft = Arrays.stream(Arrays.copyOfRange(array, 0, i)).sum();
      int sumRight = Arrays.stream(Arrays.copyOfRange(array, i + 1, n)).sum();

      if (sumLeft == sumRight) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long beforeExecution;
    long afterExecution;

    System.out.print("N = ");
    int n = input.nextInt();
//    int[] array = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
    int[] array = new int[n];
    fillArrayWithRandomNumbers(array, input);
    printArray(array);

    System.out.println("| ----------- First solution ------------- | ");
    beforeExecution = System.nanoTime();
    int result = firstEquilibriumSolution(array);
    System.out.println("P=" + result);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);

    System.out.println("| ----------- Second solution ------------- | ");
    beforeExecution = System.nanoTime();
    result = secondEquilibriumSolution(array);
    System.out.println("P=" + result);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);

    System.out.println("| ----------- Advanced solution ------------- | ");
    beforeExecution = System.nanoTime();
    result = advancedSolution(array);
    System.out.println("P=" + result);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);

    System.out.println("| ----------- END ------------- | ");
  }
}
