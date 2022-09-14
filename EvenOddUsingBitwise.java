import java.util.Scanner;

public class EvenOddUsingBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Even or Odd Using Bitwise AND");
		if((n&1)!=1) {
			System.out.println(n+" is an Even number");
		}else {
			System.out.println(n+" is an Odd number");
		}
		System.out.println("Even or Odd Using Bitwise OR");
		if((n|1)!=n) {
			System.out.println(n+" is an Even number");
		}else {
			System.out.println(n+" is an Odd number");
		}
		System.out.println("Even or Odd Using Bitwise XOR");
		if((n^1)==(n+1)) {
			System.out.println(n+" is an Even number");
		}else {
			System.out.println(n+" is an Odd number");
		}

	}

}
