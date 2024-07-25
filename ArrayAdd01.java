import java.util.Scanner;
public class ArrayAdd01 { 
	public static void main(String[] args) {
		//创建一个Scanner可以接受用户输入
		//因为用户什么时候退出,不确定 使用 do-while + break来控制
		
		Scanner myScanner = new Scanner(System.in);
		
		int[] arr = {1, 2, 3};
		
		do {
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];//将arr的元素拷贝到 arrNew新数组
			}
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
			System.out.println("===arr扩容后元素情况===");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			//问用户是否继续添加
			System.out.println("是否继续添加 y/n");
			char key = myScanner.next().charAt(0);
			if( key == 'n') {
				break;//如果输入n,就结束
			}
	}while(true);
		System.out.println("你退出了添加..");
	}
}