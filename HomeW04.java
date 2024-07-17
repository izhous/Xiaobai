public class HomeW04 {
	public static void main(String[] args) {
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			//判断是奇数还是偶数,做不同的处理
			if( i % 2 != 0) {//分母为奇数
				sum += 1.0/i;//分子精度0.1
			} else {//分母为偶数 i % 2 == 0
				sum -= 1.0/i;//分子精度0.1
			}
		}
		System.out.println("sum=" + sum);
	}
}