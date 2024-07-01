public class BitOperator02 {
	public static void main(String[] args) {
		//位运算符
		//1.算术右移 >>:低位溢出,符号位不变,并且符号位补溢出的高位
		//举例: int a=1>>2; 00000001 =>00000000 本质1/2/2=0
		int a = 1>>2;
		System.out.println("a=" + a);
		
		//2.算术左移 <<:符号位不变,低位补0
		//举例: int c=1<<2; 00000001 =>00000100 本质1*2*2=4
		//>>> 运算规则:低位溢出,高位补0;
		int c = 1<<2;
		System.out.println("c=" + c);
		
		
	}
}