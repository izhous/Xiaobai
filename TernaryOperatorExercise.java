public class TernaryOperatorExercise {
	public static void main(String[] args) {
		//案例:实现三个数的最大值
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		//思路:分步计算 
		//1.先得到 n1 和 n2中的最大数,保存到max1
		//2.然后再求出max1 和 n3中的最大数,保存到 max2;
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数=" + max2);
		 
		//使用一条语句实现,
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大数=" + max);
		
		int abcclass = 10;
		int n = 40;
		int N = 50;
		System.out.println("n=" + n);
		System.out.println("N=" + N);
	
		
		
		
	}
}