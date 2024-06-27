public class AssignOperator {
	public static void main(String[] args) {
		
		int n1 = 10;
		n1 += 4;//n1 = n1 + 4;
		System.out.println(n1);
		n1 /=3;//n1 = n1 / 3; 用上面的结果14/3;
		System.out.println(n1);//4
		
		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2;//byte,short,int在进行运算时都会提高精度到int
		/*
		 * 所以b += 2 等价于 b=b+2(直接这样输入错误),但是实际输入过程需要进行强制转换 即
		 * b = (byte)(b + 2);
		 */
		b = b++;//同理,也会将精度提高到int类型, 即b = (byte)(b+1); 直接输入b=b+1也是错误的
		int c = b + 2;
		System.out.println("c=" + c);
		
		
	}
}