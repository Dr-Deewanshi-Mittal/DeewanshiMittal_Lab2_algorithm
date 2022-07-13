package driver.com.gl;

import java.util.Arrays;
import java.util.Scanner;

import currency.com.gl.Currency;
import sorting.com.gl.MergeSort;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
				
		System.out.println("how many currency denomination you have?");
		int size=sc.nextInt();
		int[] array=new int[size];
		//taking all the currency denominations and storing it in array
		for(int i=0;i<size;i++) 
		{
			System.out.println("type the currency denomination "+ (i+1));
			array[i]=sc.nextInt();
		}
		//sorting the array in decreasing order
		//creating object of MergeSort class
		MergeSort ms= new MergeSort();
	     ms.sort(array);
	     System.out.println("Denomination in descending order are "+ Arrays.toString(array));
	     
	     System.out.println("How much do you want to pay?");
	     int pay=sc.nextInt();
	     //creating object of currency class
	     Currency cs=new Currency();
	    cs.countDenomination(array, pay);
	
sc.close();
}
}

