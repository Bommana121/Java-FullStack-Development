package array;

import java.util.Scanner;

/*public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//store elements in matrix
		int a[][] = new int[3][3];
		System.out.println("Enter the elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The elements in the array are :\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
}
*/
public class MultiDimensionalArray {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//lets store elements in matrix
		int array[][]= {{1,2,4},{3,4,5},{9,7,4}};
		
		
//		for(int row=0;row<3;row++)
//		{
//			for(int col=0;col<3;col++)
//			{
//				System.out.println("Enter Element");
//				array[row][col]=sc.nextInt();
//			}
//		}
		
		System.out.println("Let's Print elements");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			
			System.out.println();
		}
	}
}
© 2022 GitHub, Inc.
Terms
Privacy
Security