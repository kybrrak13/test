package sandbox;

/**
 * 乗算した結果を返す
 * @author ky
 *
 */
public class P170 {
	private int N;
	private int M;
	
	P170(int a, int b){
		N = a;
		M = b;
	}
	
	public int test() {
		int sum = N * M;
		return sum;
	}
}
