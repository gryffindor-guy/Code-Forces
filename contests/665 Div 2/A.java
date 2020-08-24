import java.util.*;
public class A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int x = 0; x < T; x++) {
			long A, K;
			A = scanner.nextLong();
			K = scanner.nextLong();
			if (K <= A) {

			if (Math.abs(A - K) % 2 == 0) {
				System.out.println(0);

			} else {
				System.out.println(1);
			}
		} else {
			System.out.println(K - A);
		    }
		}
	}
}