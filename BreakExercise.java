public class BreakExercise {
	public static void main(String[] args) {
		//1-100以内的数求和,求出当和第一次大于20的当前数 for + break
		//思路分析
		//1.循环1-100, 求和 sum
		//2.当 sum > 20 时,记录下当前数,然后break
		//3.在for循环外部 定义变量n
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {//现在i的定义在for循环里,作用范围仅限循环里
			//可以将i定义在for循环外部,
			/*
			 * int i = 1;
			 * for(; i <= 100; i++) 这样就可以把System放在循环{}语句题之外
			 */
			sum += i;
			if(sum > 20) {
				System.out.println("和 >20 时候, 当前数i= " + i);
				break;
			}
				}
		//int i = 1;在for循环外部时,System.out...可以放在这里
	}
}