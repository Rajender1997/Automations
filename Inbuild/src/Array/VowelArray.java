package Array;
import java.util.Scanner;

public class VowelArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the size of the array");
		//int size=scan.nextInt();
		//char[] charArray=new char[size];
		//System.out.println("Enter the elements an array");
		char charArray[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'};
		//for(int i=0; i<charArray.length; i++) {
		//	charArray[i]=scan.next().charAt(0){
			int count=0;
			for(int i=0; i<charArray.length; i++) {
				if((charArray[i]>='a'&&charArray[i]<='z')||(charArray[i]>='A'&&charArray[i]<='Z')) {
					switch(charArray[i]) {
					case 'a':
					case 'A':
					case 'e':
					case 'E':
					case 'i':
					case 'I':
					case 'o':
					case 'O':
					case 'u':
					case 'U':
						count++;
					}
				}
			}
			System.out.println("The number of vowels are:"+count);
		}
	}
	


