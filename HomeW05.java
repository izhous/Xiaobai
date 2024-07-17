public class HomeW05 {
	public static void main(String[] args) {
		//求 (1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+100)的结果
		//思路分析
		//一共100项
		//每一项的数字在逐渐增加
		int sum = 0;
		for(int i = 1;i <= 100; i++) {
			for(int j = 1;j <= i; j++) {
				sum +=j;
			}
		}
		System.out.println("sum=" + sum);
		}
}