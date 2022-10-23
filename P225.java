package sandbox;

import java.util.Scanner;

/**
 * コンソールから数値2を入力し、乗算した結果を返す
 * @author ky
 *
 */
public class P225 {
	static int test() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int sum = N * 3;
		s.close();
		return sum;
	}

}
