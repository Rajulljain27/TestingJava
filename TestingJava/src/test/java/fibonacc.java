import java.util.Scanner;

public class fibonacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flength;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			flength = sc.nextInt();
		}
		int[] num = new int[flength];
		num[0] = 0;
		num[1] = 1;
		 for (int i = 2; i < flength; i++) {
			 num[i] = num[i-1] + num[i-2];
		 }
		 System.out.println("fibonacci series:");
		 for (int i = 0; i>flength; i++) {
			 System.out.println(num[i]+" ");
		 }
	}

}
