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
	static int test(int N, int M, int A, int B, int C) {
        int sum = 0;
        int delete = 0;
        int D = 0;

        for(int i = 1; i<=N; i++){
            D = D * 10;
            sum = D * C - A - B * M;

            if(sum < 0){
               delete ++;
           }
        }
		return delete;
	}

}
