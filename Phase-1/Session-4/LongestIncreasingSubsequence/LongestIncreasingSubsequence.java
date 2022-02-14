package longestIncreasingSubsequence;

public class LongestIncreasingSubsequence {
	
	public static int lis(int arr[])
	{
	int i,j;
	int lis_value=0;
	int a[] = new int[arr.length];
	for(i=0;i<arr.length;i++)
	{
		a[i]=1;
	}
	for(i=1; i<arr.length;i++)
	{
		for(j=0;j<i;j++)
		{
			if(arr[i]>arr[j] && a[i] <a[j]+1)
			{
				a[i]=a[j]+1;
			}
		}
	}
	 System.out.print("The Longest Increasing Subsequence is : ");
	for(i=0; i<arr.length;i++)
	{
		if(lis_value<a[i])
			{	System.out.print(" "+arr[i]);
				lis_value=a[i];
			}
	}
	return lis_value;
	
	}
	public static void main(String args[])
	{
		int arr[]= {1,3,5,6,3,5,8,9,3};
		System.out.println("\n\nand its length is : "+ lis(arr));
	}

}

