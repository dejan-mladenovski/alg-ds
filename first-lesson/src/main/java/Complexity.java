import java.util.Random;
import java.util.Scanner;

/**
 * CDemo functions for different complexities.
 */
public class Complexity {

  // constant time
  static int addFirstElements(int[] array) {
    return array[0] + array[1];
  }

  static int addTwoElements(int[] array, int key1, int key2) {
    return array[key1] + array[key2];
  }

  // linear time
  public static void fillArray(int[] array, int n) {
//    for (int i = 0; i < n; i++) {
//      array[i] = i;
//    }

    for (int i = 0, val = (n-1); i < n; i++, val--) {
      array[i] = val;
    }
  }
  static String arrayToString(int[] array, int n) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");

    for (int i = 0; i < n; i++) {
      sb.append(" ");
      sb.append(array[i]);
    }
    sb.append(" ]");

    return sb.toString();
  }

  //quadratic time
  static void sortArray(int[] array, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        if (array[i] > array[j]) {
          int temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
  }

  // logarithmic time
  static int binarySearch(int [] array,int key,int n){
    int low = 0;
    int high = n-1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if      (key < array[mid]) high = mid - 1;
      else if (key > array[mid]) low = mid + 1;
      else return mid;
    }
    return -1;
  }

  // exponential time
  static int fibonacci(int n){
    if(n==1)
      return 1;
    if(n==2)
      return 1;
    return fibonacci(n-1)+fibonacci(n-2);
  }

  public static void main(String[] args) {
    int n;
    Scanner input = new Scanner(System.in);
    System.out.print("N=");
    n = input.nextInt();
    long beforeExecution;
    long afterExecution;
    int[] array = new int[n];

    System.out.println("----------- Fill array -----------");
    beforeExecution = System.nanoTime();
    fillArray(array, n);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);
    System.out.println("ARRAY: ");
    System.out.println(arrayToString(array, n));

    System.out.println("----------- Sort array -----------");
    beforeExecution = System.nanoTime();
    sortArray(array, n);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);
    System.out.println("ARRAY: ");
    System.out.println(arrayToString(array, n));

    System.out.println("----------- Search array -----------");
    beforeExecution = System.nanoTime();
    binarySearch(array, array[3], n);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);
    System.out.println("ARRAY: ");
    System.out.println(arrayToString(array, n));

    System.out.println("----------- Add elements in array -----------");
    beforeExecution = System.nanoTime();
    addFirstElements(array);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);
    System.out.println("ARRAY: ");
    System.out.println(arrayToString(array, n));

    System.out.println("----------- Fibonacci -----------");
    beforeExecution = System.nanoTime();
    fibonacci(n);
    afterExecution = System.nanoTime();
    System.out.println(afterExecution - beforeExecution);

    System.out.println("----------- Program ended -----------");
  }
}
