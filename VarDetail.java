public class VarDetail {
	public static void main(String[] args) {
		//变量必须先声明，后使用，即有顺序
		int a = 50;
		System.out.println(a);	
		//该区域的数值可以在同一类型范围内不断的变化
		//a = "jack"; 是错误的
		a = 99;
		System.out.println(a);
		/*
		 * 变量在同一个作用域内不能重名
		int a = 77; 不可以复制重名
		System.out.println(a);
		*/
	}
}
class Pig {
	public static void main(String[] args) {
		//只有一个公共类，但是可以有多个其他类，所以在其他类中变量可以重名使用
		int a = 666;
		System.out.println(a);
		
	}
}