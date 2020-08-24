import java.util.*;
public class Or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int num = scanner.nextInt();
            for (int i = num; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}