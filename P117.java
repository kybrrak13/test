package sandbox;

/**
 * 建設費用：A円
 * 人件費毎月：B円
 * ラーメン一杯：C円
 * 出店数：N店
 * 営業月：Mカ月
 * 
 * @author ky
 *
 */
public class P117 {
	static int test(int N, int M, int A, int B, int C) {
        int sum = 0;
        int delete = 0;
        
        for(int i = 1; i<=N; i++){
            int R_i = sc.nextInt(); 
            sum = R_i * C - A - B * M;
            
            if(sum < 0){
               delete ++;
           }
        }
		return sum;
	}

}
