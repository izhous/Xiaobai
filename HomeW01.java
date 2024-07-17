public class HomeW01 {
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;//累计通过的路口数
		while(true) {
			if(money > 50000) {
				//money = money - money*0.05;
				money *= 0.95;
				count++;
			}else if(money >= 1000) { //money >= 1000 && money <= 50000 
				//可以不用加小于等于 50000,
				money -= 1000;
				count++;
			}else { //此时money < 1000,无法通过
				break;//不够1000元,直接终止
			}
		}
		System.out.println(money + "可以通过" + count + "个路口..");
	}
}