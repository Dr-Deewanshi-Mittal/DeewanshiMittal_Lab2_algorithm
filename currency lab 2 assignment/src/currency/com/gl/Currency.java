package currency.com.gl;

public class Currency 
{
  public void countDenomination(int array[],int pay)
  {
	  for(int i=0;i<array.length;i++) {
		  if(array[i]<=pay) {
			 int count=pay/array[i];
			 System.out.println("Denomination "+ array[i]+" to be paid "+ count+ " time");
			 pay=pay%array[i];
			 if(pay==0) {
				 break;
			 }
		  }
	  }
	  if(pay!=0) {
		  System.out.println("Exact payment can not be made");
	  }
  }
}
