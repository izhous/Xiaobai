import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		/*
		 *案例:Switch01.java
		 *请编写一个程序,该程序可以接受一个字符,比如a,b,c,d,e
		 *a表示星期一,b表示星期二...
		 *根据用户的输入信息显示相应的信息,要求使用switch语句完成
		 */
		//思路分析
		//1.接受一个字符,创建Scanner对象
		//2.使用switch来完成匹配,并输出对应的信息
		//3.
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-g)");
		char c1 = myScanner.next().charAt(0);//在java中只要有值返回就是一个表达式
		
		switch(c1) {
		case 'a' :
			System.out.println("今天星期一,猴子穿新衣");
			break;
		case 'b' :
			System.out.println("今天星期二,猴子当小二");
			break;
		case 'c' :
			System.out.println("今天星期三,猴子爬雪山");
			break;
		case 'd' :
			System.out.println("今天星期四,猴子偷桃子");
			break;
		case 'e' :
			System.out.println("今天星期五,猴子打老虎");
			break;
		case 'f' :
			System.out.println("今天星期六,猴子逛街喽");
			break;
		case 'g' :
			System.out.println("今天星期日,猴子坐院子");
			break;
			default:
				System.out.println("你输入的字符不正确,没有匹配的");
			}
		
		System.out.println("退出了switch,继续执行程序");
	}
}