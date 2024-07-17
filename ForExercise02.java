public class ForExercise02 {
	public static void main(String[] args) {
		
		//编写两数之和为5的等式,例如0 + 5 = 5...
		//实际情况范围远远大于5,所以调整等式和的值为变量即可
		int n = 15;
		for(int i = 0; i <=n; i++) {
			System.out.println(i + "+" + (n-i) + "=n");
		}
	}
}