public class ArrayReverse {
	public static void main(String[] args) {
		
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66};
		//数组交换
		//1.把arr[0] 和 arr[5] 进行交换 {66, 22, 33, 44, 55, 11}
		//2.把arr[1] 和 arr[4] 进行交换 {66, 55, 33, 44, 22, 11}
		//3.把arr[2] 和 arr[3] 进行交换 {66, 55, 44, 33, 22, 11}
		//4.交换的次数 3次 = arr.length / 2
		//5.每次交换时,对应的下标是 arr[i] 和 arr[arr.length - (1+i)]
		//代码
		
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < arr.length / 2; i++) {
			temp = arr[len - (1 + i)];
			arr[len - (i + 1)] = arr[i];
			arr[i] = temp;

		}
		System.out.println("===翻转后的数组===");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}