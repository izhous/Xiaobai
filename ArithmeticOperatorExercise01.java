public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		int i = 1;
		i = i++;//规则使用临时变量：1，temp=i；2，i=i+1；3，i=temp=1；
		System.out.println(i);//1
		
		int j = 1;
		j =++j;//规则使用临时变量：1，j=j+1；2，temp=j；3，j=temp；
		System.out.println(j);//2
		
		int l1 = 10;
		int l2 = 20;
		int l = l1++;//先赋值l=l1；再自增l1=10+1=11；
		System.out.println("l="+l);//l=10；
		System.out.println("l2="+l2);//20；
		
		l = --l2;//先自减l2=20-1=19；再赋值l=19；
		System.out.println("l="+ l);//l=19；
		System.out.println("l2="+ l2);//l2=19；
		
		
		
		
		
		
	}
}