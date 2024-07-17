public class While01 {
	public static void main(String[] arga) {
		//输出10句 你好,韩顺平教育
		int i = 1;
		while( i <= 10) {
			System.out.println("你好,韩顺平教育" + 1);
			i++;
		}
		//打印40-200之间的所有偶数,使用while
		int j = 40;
		while (j <= 200) {
			if (j % 2 == 0) {
				System.out.println("j=" + j);
		}
			j++;//注意自增,
		}
	}
}