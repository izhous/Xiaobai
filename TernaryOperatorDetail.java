public class TernaryOperatorDetail {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		//int c = a > b ? (int)1.1 : (int)3.4;
		// 用强转也可以
		System.out.println("c=" + c);
		float d = a < b ? 1.1F : 2.2F;
		System.out.println("d=" + d);
	}
}