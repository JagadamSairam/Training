import java.util.Scanner;
public class CountOnes {
	public static void main(String[] args) {
		int oneCount = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the start limit: ");
		int start = Integer.parseInt(in.nextLine());
		System.out.print("Enter the end limit: ");
		int end = Integer.parseInt(in.nextLine());
		for(int i=start;i<=end;i++) {
			oneCount = oneCount + countOneinNum(i);
		}
		System.out.println("The number of 1s are: "+oneCount);
	}
	public static int countOneinNum(int num) {
		int count = 0;
		int temp=num;
		while(num!=0) {
			if((num%10) == 1) {
				//System.out.println(temp);
				count++;
			}
			num = num/10;
		}
		return count;
	}
}