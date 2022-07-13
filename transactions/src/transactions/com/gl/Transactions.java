package transactions.com.gl;

public class Transactions {
	
	public int isTargetArchieved(int[]array,int targetValue) {
		int status=-1;
		long sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			if(sum>=targetValue) 
			{	
				status=i+1;
				break;
			}		
	}
		return status;

}
}
