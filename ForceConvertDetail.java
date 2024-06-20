public class ForceConvertDetail {
	public static void main(String[] args) {
		//强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//编译错误：double => int
		int x = (int)(10*3.5+6*1.5);//(int)44.0 ->44
		System.out.println(x);//44
		
		
		char c1 = 100;
		int m = 100;
		//char c2 = m; 错误
		char c3 = (char)m;
		System.out.println(c3);//100对应的字符
		
	}
}