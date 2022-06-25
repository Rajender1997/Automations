package Array;
import java.util.Scanner;

public class MinNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int[] array=new int[size];
		System.out.println("enter the elements of the array");
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int min=array[0];
		for(int i=0; i<array.length; i++) {
			if(min>array[i]) {
				min=array[i];
				
			}
		}
		System.out.println("The minimum element of an array is:"+min);
	}

}
