public class SwitchDetail {
	public static void main(String[] args) {
	//表达数据类型 应和case 后面的常量类型一致,
	//或者是可以自动转换成相互比较的类型,比如输入的是字符,而常量是int
		
		char c = 'a';
		switch(c) {
		case 'a' :
		System.out.println("ok1");
		break;
		case 'b' :
			System.out.println("ok2");
			break;
			default :
				System.out.println("ok3");
				
			
		}
	}
}