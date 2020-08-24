import java.util.*;

public class ChessColoring {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {

			int num = scanner.nextInt();
			int result = num / 2 + 1;
			System.out.println(result);
		}
	}
}