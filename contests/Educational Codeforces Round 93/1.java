import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int T = scanner.nextInt();
      for (int i = 0; i < T; i++) {

          int size = scanner.nextInt();
          int[] arr = new int[size];
          for (int j = 0; j < size; j++) {
              arr[j] = scanner.nextInt();

          }
          int sum = arr[0] + arr[1];
          if (sum <= arr[size - 1]) {
              System.out.println(1 + " " + 2 + " " + size);
          } else {
              System.out.println(-1);
          }
      }

  }
}