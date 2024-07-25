public class ArrayDetail {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,60};
		double[] arr2 = {1.1, 2, 3, 60.6};
		
		//数组中的元素可以是任何数据类型,包括基本数据类型和引用类型,但是不可以混合使用
		String[] arr3 = {"北京","jack","milan"};
		//数组创建后,如果没有赋值,有默认值
		//int short byte long 都是0
		//float double 都是0.0  char \u0000,
		//boolean false,   String null
		short[] arr4 = new short[3];
		System.out.println("===数组arr4=====");
		for(int i = 0; i < arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		//数组的下标最小值是0,最大值是长度length-1,
		int [] arr = new int[5];
		System.out.println(arr[3]);
	}
}