public class HomeW0 {
	public static void main(String[] args) {
		int n = 188;
		int n1 = n / 100;//n1百位的数
		int n2 = n % 100 / 10;//n2十位的数
		int n3 = n % 10; //n3个位的数
		if(n1*n1*n1 + n2*n2*n2 + n3*n3*n3 == n) {
			System.out.println(n + "是水仙花数");
		} else {
			System.out.println(n + "不是水仙花数");
		}
	}
}