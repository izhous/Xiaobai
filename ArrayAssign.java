public class ArrayAssign {
	public static void main(String[] args) {
		//基本数据类型赋值,赋值方式为值拷贝
		//n2的变化不会影响到n1值
		int n1 = 10;
		int n2 = n1;
		
		n2 = 80;
		System.out.println("n1=" + n1);//10,n1不受n2的影响
		System.out.println("n2=" + n2);//80
		//数组在默认情况下是引用传递,赋的值是地址,赋值方式为引用传递
		//是一个地址,arr2的变化会影响arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//把arr1赋值给arr2
		arr2[0] = 10;//将arr2的第一个元素的值变为10,则arr1的第一元素的值也会变化
		
		System.out.println("===arr1的元素===");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);  //arr1的第一个元素的值也会变为10;
		}
	}
}