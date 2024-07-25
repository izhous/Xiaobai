public class ArrayReverse02 { 
	public static void main(String[] args) {
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66};
		//使用逆序赋值的方式
		//1.先创建一个新的数组, arr2 大小arr.length
		//2.逆序遍历 arr,将每个元素拷贝到 arr2的元素中
		
		
		int[] arr2 = new int [arr.length];
		for(int i = arr.length - 1; i >= 0; i--) {
			arr2[arr.length - 1 - i] = arr[i];
			
		}
		arr = arr2;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}