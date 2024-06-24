//演示关系运算符的使用
public class RelationalOperator  {
	public static void main(String[] args) {
		int a = 9;
		int b = 8;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a < b);
		System.out.println(a == b);//a等于b
		System.out.println(a != b);//a不等于b
		boolean flag = a > b;
		System.out.println("flag=" + flag);
		
	}
}