public class HomeW02 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				count++;
				System.out.print(i + "\t");
				//判断,每隔5个,就输出一个换行
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}