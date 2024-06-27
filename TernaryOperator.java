public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		//三元运算符使用:
		//a>b,为真,则输出a++; a>b,为假,则输出b--;
		int result = a > b ? a++ : b-- ;
		System.out.println("result=" + result);//先赋值,后+1,所以结果为99;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}
}