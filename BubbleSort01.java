public class BubbleSort01 { 
	public static void main(String[] args) {
		int[] arr = {24, 84, 33, 47, 13, -1, 20};
		int temp = 0;
		for(int i = 0;i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("\n==第" + (i+1) + "轮==");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t"); 
			}
		}
	}
}