public class Array01 {
	public static void main(String[] args) {
		//统计6只小鸡的总体重,并求出平均体重
		//六只小鸡的体重分别是3kg,5kg,1kg,3.4kg,2kg,50kg
		//思路分析
		//定义6个变量 double
		/*
		 * double hen1 = 3;
				double hen2 = 5;
				double hen3 = 1;
				double hen4 = 3.4;
				double hen5 = 2;
				double hen6 = 50;
		
				double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
				double avgWeight = totalWeight / 6 ;
			   
				System.out.println("总体重=" + totalWeight + "平均体重=" + avgWeight);
		 */
		 //用数组来解决这类问题
		//先定义一个数组
		//double[] 表示是double类型的数组, 是一组数据
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		//通过hens[下标] 来访问数组的元素
		//下标是从0开始编号的,比如第一个元素就是hens[0],第二个元素就是hens[1],以此类推
		System.out.println("===使用数组解决问题===");
		//通过使用 数组名.length 得到数组的大小/长度
		System.out.println("数组的长度=" + hens.length);
		double totalWeight = 0;
		//for( int i = 0; i < 6; i++) {
		for( int i = 0; i < hens.length; i++) {
			
			System.out.println("第X个元素的值=" + hens[i]);
			totalWeight += hens[i];	 
		}
		System.out.println("总体重=" + totalWeight + "平均体重=" + totalWeight / hens.length);
		
	}
}