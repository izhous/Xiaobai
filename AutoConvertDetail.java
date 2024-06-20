public class AutoConvertDetail {
	public static void main(String[] args) {
		//有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，再进行计算
		int n1 = 10;
		//float d1 = n1 + 1.1; //错误，1.1是double类型，大容量数据，而float是小容量，因此无法放入使用
		double d1 = n1 + 1.1;
		//float d1 = n1 + 1.1F;//正确，1.1F是float类型，
		//当我们把精度大的数据类型赋值给精度小的数据类型时
		//就会报错，反之就会进行自动类型转换
		//byte 1个字节，范围-128～127；short 2个字节；int整型，4个字节；long长整型，8个字节
		//（byte,short)和char之间不会相互自动转换
		
		
		//细节：byte，short，char 他们三者可以计算，在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//错误，b2 + s1 => int
		int s2 = b2 + s1;//正确
	
		//byte b4 = b2 + b3;//错误，b2 + b3 =>int
		int b4 = b2 + b3;
		
		//细节：boolean 不参与转换
		 boolean pass = true;
		// int num100 = pass;//错误，boolean 不参与类型的自动转换
		 
		 byte b5 = 1;
		 short s3 = 100;
		 int num200 = 1;
		 double num300 = 1.1;
		 
		 double num500 = b5 + s3 + num200 + num300;
		 
		 
	}
}