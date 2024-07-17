public class DoWhileExercise02 {
	public static void main(String[] args) {
		//统计1-200之间能被5整除但是不能被3整除的个数
		//使用do-while输出1-200

		int i = 1;
		int end = 200;
		int a = 5;
		int b = 3;
		int count = 0;
		do { 
			if(i % a ==0 && i % b != 0) {
				System.out.println("i=" + i);
				count++;
			}
				i++;
			}while(i <= end);
			System.out.println("count=" + count);	
			}
	}


