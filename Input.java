import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		//演示接受用户的输入;
		//步骤 
		//Scanner 类表示简单文本扫描器,在java.util包
		//创建Scanner对象,new创建一个对象
		//myScanner 就是Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//接受用户输入,使用相关的方法
		System.out.println("小李");
		String name = myScanner.next();
		System.out.println("27");
		int age = myScanner.nextInt();
		System.out.println("2000");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("名字=" + name + "年龄=" + age +
				"薪水=" + sal);
		
		
	}
}