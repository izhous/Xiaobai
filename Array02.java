import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		//数组的下标从0开始
		//目标
		//循环输入5个成绩,保存到double数组,并输出
		
		//步骤
		double[] scores = new double[5];
		//double scores[];
		//scores = new double[5];
		//接受的时候需要需要创建Scanner
		
		Scanner myScanner = new Scanner(System.in);
		for( int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		//输出
		System.out.println("==数组的元素/值的情况如下:===");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第" + (i+1) + "个元素的值=" + scores[i]);
			
		}
	}
}