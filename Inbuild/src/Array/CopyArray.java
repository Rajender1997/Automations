package Array;
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array");
		size=scan.nextInt();
		System.out.println("Enter the data...");
        int a[]=new int[size];
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		int b[]=new int[a.length];
		//copying
		for(int j=0; j<a.length; j++) {
			b[j]=a[j];
		}
		//Printing
		System.out.println("The elements from the new array is:");
		System.out.print("[");
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
			
		}
		System.out.print("]");
		
	}

}
