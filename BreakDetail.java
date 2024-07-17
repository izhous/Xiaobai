public class BreakDetail {
	public static void main(String[] args) {
		
		label1:
			for(int j = 0; j < 4; j++) { //外层for
				label2:
					for(int i = 0; i < 10; i++) { //内层for
						if(i ==2) {
							break  ;//等价 break label2,没有标注就是就近原则,break label1 
						}
						System.out.println("i=" + i);
					}
			}
	}
}