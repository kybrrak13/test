package sandbox;
import java.util.Scanner;


/**
 * コンソールから数値を2を入力し、乗算した結果を返す
 * @author ky
 *
 */
public class P220 {
	static int test() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = n * 25 * 24;
		s.close();
		return sum;
	}
}
