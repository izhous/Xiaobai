public class ArrayExercise02 {
	public static void main(String[] args) {
		//目标
		//求出一个数组的int[]的最大值{4, -1, 9, 10, 23,119},并得到对应的下标
		//思路分析
		//1.定义一个int数组,int[] arr = {4, -1, 9, 10, 23,119};
		//2.假定max = arr[0] 是 最大值,maxIndex = 0;
		//3.从下标1开始遍历arr,如果max < 当前元素,说明max 不是真正的最大值
		// 当max = 当前元素; maxIndex = 当前元素下标
		//4.当我们遍历这个数组arr后,max就是真正的最大值, maxIndex最大值对应的下标
		
		int[] arr = {4, -1, 9, 10, 23,119};
		int max = arr[0];
		int maxIndex = 0;//假设第一个元素0是最大值
		
		for(int i = 1; i < arr.length; i++) {//从下标1开始遍历arr
			
			if(max < arr[i]) { //如果max < 当前元素,说明max值不是最大值
				max = arr[i];// 所以把当前的值改变为max
				maxIndex = i;
			}
		}
		//当我们遍历这个数组arr后,max就是真正的最大值,maxIndex最大值下标
		System.out.println("max=" + max + "maxIndex=" + maxIndex);
	}
}