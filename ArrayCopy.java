public class ArrayCopy {
	public static void main(String[] args) {
		//将 int[] arr1 = {10, 20, 30};拷贝到arr2数组,
	    //要求数据空间是独立的
		int[] arr1 = {10, 20, 30};
		
		//创建一个新的数组arr2, 开辟新的数据空间
		//大小 arr1.length;
		int[] arr2 = new int[arr1.length];
		
		//遍历arr1,把每个元素拷贝到arr2对应的元素位置
		for(int i = 0;i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//修改arr2
		arr2[0] = 100;
		//输出arr1
		System.out.println("===arr1的元素===");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10, 20, 30  arr1的元素不发生变化
		}
		System.out.println("===arr2的元素====");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);//100, 20, 30  arr2的元素发生变化
		}
		
	}
}