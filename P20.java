package sandbox;

/**
 * 生鮮食品を m[kg] 仕入れ、m[kg] のうち p[%] を売った後、
 * 売れ残った量のうち q[%] が売った場合、m[kg] 仕入れた分の何kg 売れ残ったかを乗算した結果を返す
 * @author ky
 */
public class P20 {
	static double test(double m, double p, double q) {
        double a = (m * 10 - m / 10 * p) * 1/10;
        double b = (a * 10 - a / 10 * q) * 1/10;
        return b;
    }
 }

