package Array;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array:");
		size=scan.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the elements of an array:" );
		//int a[]= {20,30,10,30,40};
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		
		}*/
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int j=0; j<a.length; j++) {
			sum=sum+a[j];
		}
		System.out.println("sum of an array is:"+sum);
		float average=(float)sum/a.length;
		System.out.println("average of an array is:"+average);
		
	
	}

}
