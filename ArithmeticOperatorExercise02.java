public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		//需求：
		//假期还有59天放假，问合XX个星期零XX天
		//使用int 变量 days 保存 天数
		//一个星期7天，星期数weeks：days / 7 零XX天 leftDays % 7
		//输出
		int days = 25911;
		int weeks = days / 7;
		int  leftDays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期零" + 
		leftDays + "天");
		
		//1.需求
		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的共识为
		//：5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度
		//
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
		
		}
}
