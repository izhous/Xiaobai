/*
 * 演示逻辑运算符的使用
 */
public class LogicOperator01 {
	public static void main(String[] args) {
		//&& 和 & 案例演示
		int age = 50;
		if(age > 20 && age < 90) { //&& 短路与；
			System.out.println("ok100");
			if(age > 20 & age < 90) { //& 逻辑与；
				System.out.println("ok200");
				
				//区别
				//&&短路与：如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高
				//&逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低
				//开发中，我们使用的基本是短路与&&，效率高
				
				int a = 4;
				int b = 9;
				if(a < 1 && ++b < 50) { //a=4>1,if不成立，所以后面的++b条件不再判断；&&短路与
					System.out.println("ok300");
				}
					System.out.println("a=" + a + "b=" + b);//a=4,b=9;
					/*
					 * int a = 4;
					 * int b = 9;
					if(a < 1 & ++b < 50) { //a=4>1,虽然if前项不成立，但是后面的++b条件会继续判断；&逻辑与
						System.out.println("ok300");
					}
						System.out.println("a=" + a + "b=" + b);//a=4,b=10,会执行++b=9+1；
					 */	
			}
			
		}
	}
}