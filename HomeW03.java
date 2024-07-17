public class HomeW03 {
	public static void main(String[] args) {
		//输出小写的a-z,以及大写Z-A
		for(char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		for(char c1 = 'Z'; c1 >= 'A'; c1--) {
			System.out.print(c1 + " ");
		}
	}
}