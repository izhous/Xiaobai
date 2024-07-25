public class ArrayExercise01 {
	public static void main(String[] args) {
		/*
		 * 创建一个char类型的26个元素的数组,分别放置'A' - 'Z'.
		 * 使用for循环访问所有元素并打印出来
		 * 提示:char类型数据运算‘A’ + 1 -> 'B' 
		 */
		//思路分析
		//1.定义一个数组 char[] chars = new char[26]
		//2.因为‘A’ + 1 = ‘B’ 类型,所以使用for 循环来赋值
		
		char[] chars = new char[26];
		for( int i = 0; i < chars.length; i++) {
		//chars 是 char[] 是数组
		//chars[i] 是数组中的一个数据,因此是char数据类型
		chars[i] = (char)('A' + i); //'A' + i 是int,需要强制转换
		}
		//循环输出
		System.out.println("===chars数组===");
		for( int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}