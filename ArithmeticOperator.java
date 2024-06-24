/*
 * 演示算术运算符的使用
 */
public class ArithmeticOperator {
	public static void main(String[] args) {
		// 除号的使用/
		System.out.println(10 / 4);//从数学来看是2.5，java中是2
		System.out.println(10.0 / 4);//java 是2.5
		double d = 10 / 4;//java中的10 / 4 = 2，double 浮点型的结果是2.0
		System.out.println(d);
		
		// % 取模，也叫取余
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		
		// ++的使用
		//
		int i = 10;
		i++;//自增 等价于 i = i + 1; => i = 11
		++i;//自增 等价于 i= i + 1; => i = 12
		System.out.println("i=" + i); //12
		
		/*
		 * 作为表达式使用
		 * 前++ ：++i先自增后赋值
		 * 后++ ：i++先赋值后自增
		 */
		 int j = 8;
		 int k = ++j;
		 System.out.println("k=" + k + '\n'+"j=" + j);
		 //++j等价于 先j = j + 1；k = j；
		 
		 int l = 8;
		 int m = l++;
		 System.out.println("m=" + m + '\t' + "l=" + l);
		 //l++等价于 先赋值m = l；l自增 l=l + 1；//m = 8；l = 9；
		 
		
		
	}
}