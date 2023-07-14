package prefixsum;

import java.util.Scanner;

public class Prefixsum{
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int arrsize=scanner.nextInt();
		int arr[]=new int[arrsize];
		arr[0]=scanner.nextInt();
		for(int i=1;i<arrsize;i++) {
			arr[i]=scanner.nextInt();
			arr[i]=arr[i-1]+arr[i];
	}
		for(int i=0;i<arrsize;i++) {
			System.out.print(arr[i]+" ");
	}
		
}
}