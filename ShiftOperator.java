import java.util.Scanner;

public class ShiftOperator {

		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter a +ve integer");
		        int a=sc.nextInt();
		        System.out.println("Enter a -ve integer");
		        int b=sc.nextInt();
		        System.out.println(a<<2);
		        System.out.println(a>>2);
		        System.out.println(b>>2);
		        System.out.println(b>>>2);

	}

}
