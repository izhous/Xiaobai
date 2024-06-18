public class Plus {
	public static void main(String[] args) {
		System.out.println(100 + 98);
		System.out.println("100" + 98);//当左右两边有一方为字符串，则做拼接运算//10098
		
		System.out.println(100 + 3 + "hello");//103hello
		System.out.println("hello" + 100 + 3);//hello103
		
	}
}