import java.util.*;
public class FixYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int count = 0;
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int[][] belt = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                String s = scanner.next();
                for (int j = 0; j < cols; j++) {
                    belt[i][j] = s.charAt(j);
                }
            }

            for (int i = 0; i < rows - 1; i++) {
                if (belt[i][cols - 1] != 'D') {
                    count++;
                }
            }
            for (int j = 0; j < cols - 1; j++) {
                if (belt[rows - 1][j] != 'R') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}