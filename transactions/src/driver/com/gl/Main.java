package driver.com.gl;

import java.util.Scanner;

import transactions.com.gl.Transactions;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Transactions tcs= new Transactions();
		
		System.out.println("enter the size of transaction array");
		int no_of_transactions=sc.nextInt();
		int[]transactionsArray= new int[no_of_transactions];
		
		for(int i=0;i<no_of_transactions;i++)
		{
			System.out.println("enter the value of "+(i+1)+" transaction");
			transactionsArray[i]=sc.nextInt();
		}
		
		System.out.println("enter the total no.of targets that needs to be achieved");
		int totalTarget=sc.nextInt();
		
		for(int i=0;i<totalTarget;i++) 
		{
		System.out.println("enter the target value  "+(i+1));
		int targetValue=sc.nextInt();
		int target=tcs.isTargetArchieved(transactionsArray,targetValue);
		if(target==-1) {
			System.out.println("target not achieved");
		}
		else {
			System.out.println("target achieved after "+ target+" transactions");
		}
		
		}
		sc.close();

	}

}
