package Array;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		double[] d=new double[size];
		
		for(int i=0; i<d.length; i++) {
		System.out.println("Enter the value of "+i+" element");
		d[i]=scan.nextDouble();
		}
		System.out.println("The elements entered by the user is:");
		System.out.print("[");
		for(double d1:d) {
			System.out.print(d1+" ");
			
		}
		System.out.print("]");
	}
}
