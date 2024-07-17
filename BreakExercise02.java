import java.util.Scanner;
public class BreakExercise02 {
	public static void main(String[] args) {
		//目标
		//实现登录验证,有三次机会,如果用户名为“丁真” ,密码“666”提示登录成功,
		//否则提示还有几次机会,请使用for + break完成
		//思路分析
		//1.创建Scanner对象接收用户输入
		//2.定义 String name ; String passwd;保存用户名和密码
		//3.最多循环3次,如果满足条件提前退出
		//4.定义一般变量 int chance 记录还有几次登录机会
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;//登录一次少一次
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			//比较输入的名字和密码是否正确
			//补充说明字符串 的比较受用方法 equals :将输入的信息与指定的信息比较
			//String name = "林黛玉“;
			//System.out.println(name.equals("林黛玉“));
			//或者System.out.println("林黛玉“.equals(name)); 上下两个都可以使用
			if("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("恭喜你,登录成功~");
				break;//只要登录成功就退出
			}
			//登录的机会就减少一次
			chance--;
			System.out.println("你还有" + chance + "次登录机会");
		}
			
		
	}
}