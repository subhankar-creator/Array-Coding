package Array_2;

import java.util.Scanner;

public class P_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][]arr=new int[3][4];
		System.out.println("Enter element");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Border Elements:");
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1 ) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(" "+" ");
				}
					
			}
			System.out.println();
		}
	}

}
