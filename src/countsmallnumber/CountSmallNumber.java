package countsmallnumber;

import java.util.Scanner;

public class CountSmallNumber {
	
	public static int[] countSmallNumber(int array[],int size){
		
		int resarray[] = new int[size];
		for(int i=0;i<size;i++) {
			int count = 0;
			for(int j = i+1;j<size;j++) {
				if(array[i]>array[j]) {
					count++;
				}
			}
			resarray[i] =  count;
		}
		return resarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int[] result = countSmallNumber(array,n);
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
