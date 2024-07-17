public class Return01 {
	public static void main(String[] arga) {
		for(int i = 1;i <= 5;i++) {
			if(i == 3) {
				System.out.println("韩顺平教育" + i);
				return;//当return用在方法时,表示跳出方法,用在main时,表示退出main程序
				//continue;
				//break;//break 终止for循环
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on..");
	}
}