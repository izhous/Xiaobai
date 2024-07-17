import java.util.Scanner;
public class MulForExercise01 {
	public static void main(String[] args) {
		//统计三个班的成绩情况,每个班有5名同学
		//求出各个班的平均分和所有班的平均分
		//统计三个班及格人数,每个班5名同学
		
		//创建Scanner对象 
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;
		for(int i = 1; i <=3; i++) { //i表示班级,j表示学生
			double sum = 0;//一个班级的总分
			for(int j = 1; j <= 5; j++) {
				System.out.println("请数第1个班的第" + j + "个学生的成绩");
				double score = myScanner.nextDouble();
				//当有一个学生成绩 >=60, passNum++ 及格
				if(score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("成绩为" + score);
		}
		System.out.println("sum=" + sum + "平均分=" + (sum / 5));		
		totalScore += sum;
			}
		System.out.println("三个班的总分=" + totalScore + "平均分=" + totalScore / 15);
		System.out.println("及格人数=" + passNum);
	}
}