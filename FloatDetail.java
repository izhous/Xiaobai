public class FloatDetail {
	public static void main(String[] args) {
		//java的浮点型常量默认值为double型，声明float型常量，须后加'f'或'F'
		//float num1 = 1.1;错误  //double是8个字节；而float是4个字节，且默认是double
		float num2 = 1.1F; //正确
		double num3 = 1.1; //正确
		double num4 = 1.1F; //正确;
		double num5 = 0.123;//正确
		double num6 = .123; //正确
		System.out.println(num5);
		//科学计数法形式：5.12e2[表示5.12*10的2次方]；5.12E-2[表示5.12/10的2次方]
		System.out.println(5.12e2); //512.0
		System.out.println(5.12E-2); //0.0512
		double num7 = 2.1234567851;
		float num8 = 2.1234567851F;
		System.out.println(num7);//2.1234567851
		System.out.println(num8);//2.1234567 输出结果精确度不同
		//浮点数使用陷阱：2.7和8.1/3的比较
		double num9 = 2.7;
		double num10 = 8.1 / 3;
		System.out.println(num9);//2.7
		System.out.println(num10);//2.6999999999999997
		
		
	}
}