package arrayrotation;

class RotateArray {
	
	public void rotate(int num[], int k)
	{
		if(k>num.length)
			k=k%num.length;
		
		int result[] = new int[num.length];
		for(i=0;i<k;i++)
		{
			result[i]= num[num.length-k+i];
		}
		
		for(i=k;i)
	}
	

}
