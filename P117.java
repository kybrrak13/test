package sandbox;

/**
 * N 店のラーメン店を出店し、M ヶ月間営業したときの、それぞれの店舗のラーメンの販売数が与えられるので、
 * 不採算な店として閉店することになるのは何店舗か計算するプログラム
 * 建設費用：A円
 * 人件費毎月：B円
 * ラーメン一杯：C円
 * 出店数：N店
 * 営業月：Mカ月
 * 販売数：D杯
 * @author ky
 *
 */
public class P117 {
	static int test(int n, int m, int a, int b, int c) {
        int sum = 0;
        int delete = 0;
        int d = 0;

        for(int i = 1; i<=n; i++){
            d = d * 10;
            sum = d * c - a - b * m;

            if(sum < 0){
               delete ++;
           }
        }
		return delete;
	}

}
