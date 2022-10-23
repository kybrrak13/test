package sandbox;

import java.util.Scanner;

/**
 * コンソールから数値3と4を入力し、乗算した結果を返す
 * @author ky
 *
 */
public class P112 {
	static int test() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int h = s.nextInt();
		int sum = n * h;
		s.close();
		return sum;
	}
}
