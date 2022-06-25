package Array;
import java.util.Scanner;

public class MaxNum {
	public static void main(String[] args) {
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=scan.nextInt();
		int[] array=new int[size];
		System.out.println("Enter elements an array:");
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}*/
		int array[]= {1,4,5,8,9};
		int max=array[0];
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("The maximum element of an array is:"+max);
	
	}

}
