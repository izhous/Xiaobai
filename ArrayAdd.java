public class ArrayAdd {
	public static void main(String[] args) {
		/*
		 * 数组增加元素效果,实现对数组扩容
		 * 1.原始数组使用静态分配 int[] arr = {1, 2, 3}
		 * 2.增加的元素放在最后 arr = {1, 2, 3, 4}
		 * 
 		 */
		//思路分析
		//1.定义初始数组 int[] arr = {1, 2, 3}
		//2.定义一个新的数组, int[] arrNew = new int[arr.length + 1];
		//3.遍历arr数组,依次将arr的元素拷贝到 arrNew数组
		//4.将4赋值给 arrNew[arrNew.length - 1] = 4; 将4赋给arrNew最后一个元素
		//5.让arr 指向arrNew; arr = arrNew; 
		
		int[] arr = {1, 2, 3};
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];//将arr的元素拷贝到 arrNew新数组
		}
		arrNew[arrNew.length - 1] = 4;
		arr = arrNew;
		System.out.println("===arr扩容后元素情况===");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}