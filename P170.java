package sandbox;

import java.util.Scanner;

/**
 * コンソールから数値を2と3を入力し、乗算した結果を返す
 * @author ky
 *
 */
public class P170 {
	static int test() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int sum = N * M;
		s.close();
		return sum;
	}
}
