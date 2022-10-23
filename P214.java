package sandbox;

import java.util.Scanner;

/**
 * コンソールから数値を4と2を入力し、除算した結果を返す
 * @author ky
 *
 */
public class P214 {
     static int test() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a - b;
		s.close();
        return sum;
    }
 }

