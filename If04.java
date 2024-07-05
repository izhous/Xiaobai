import java.util.Scanner;
public class If04 {
	public static void main(String[] args) {
		/*
		 * 输入保国同志的芝麻信用:
		 * 如果:
		 * 信用分为100分时,输出 信用极好;
		 * 信用分为(80,99]时,输出 信用优秀;
		 * 信用分为[60,80]时,输出 信用一般;
		 * 其他情况, 输出 信用 不及格;
		 * 假定信用分数为int
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分:");
		int grade = myScanner.nextInt();
		//因为右4种情况,所以使用多分支
		//先对输入的信用分,进行一个范围的有效判断1-100,否则提示输入错误
		
		if(grade >=1 && grade <= 100) {
		if(grade == 100) {
			System.out.println("信用极好");
		} else if (grade > 80 && grade <= 99) {
		    System.out.println("信用优秀");	
	} else if (grade >= 60 && grade <= 80) {
	System.out.println("信用一般");
	} else {
		System.out.println("信用不及格");
	}
	} else {
		System.out.println("信用分需要在1-100,请重新输入:");
	}
	}}
