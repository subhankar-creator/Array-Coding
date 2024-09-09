package Array_2;

import java.util.Scanner;

public class P_6 {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		int [][] arr=new int[sc.nextInt()][sc.nextInt()];
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j]=sc.nextInt();
			}
		}

	}

}
