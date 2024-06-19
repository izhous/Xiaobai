public class CharDetail {
	public static void main(String[] args) {
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		//要输出对应的数字，可以(int)字符
		char c1 = 97;
		System.out.println(c1);
		
		char c2 = 'a';//想要输出a对应的数字
		System.out.println((int)c2);
		char c3 = '李';
		System.out.println((int)c3);
		char c4 = 26446;
		System.out.println(c4);
		//char类型是可以运算的，相当于整数，因为它都对应有unicode码
		System.out.println('a' + 10);//97 + 10 = 107
		char c5 = 'b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);
	}
}