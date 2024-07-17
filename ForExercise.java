public class ForExercise {
	public static void main(String[] args) {
		//思路分析
		//打印1-100之间所有是9的倍数的整数,统计个数和总数
		//1.完成输出1-100的值
		//2.在输出的过程中,进行过滤,只输出9的倍数 i % 9 ==0
		//3.统计个数,定义一个变量 int count = 0;当条件满足时 count++;
		//4.总和,定义一个变量 int sum = o;当条件满足时累计sum += i;
		//1-100数值比较局限,为了适应更广泛的需求,调整区间变量
		//同时倍数也可以改为变量
		//为了适应更好的需求,
		int count = 0;//统计9的倍数的变量 
		int sum = 0;//总和
		int start = 10;
		int end = 200;
		int t = 5;
		for(int i = start; i <= end; i++) {
			if(i % t ==0) { //取余
				System.out.println("i" + i);
				count++;
				sum += i;//累计
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}