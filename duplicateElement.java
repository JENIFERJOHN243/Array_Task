
import java.util.*;
public class Duplicate
{

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
		int i,j;
		ArrayList<Integer>arr=new ArrayList<>();
	        for(i=0;i<n;i++){
	            arr.add(sc.nextInt());
	        }
	        for(i=0;i<arr.size();i++)
	        {
	        for(j=i+1;j<arr.size();j++)
	        { 
	            if((arr.get(i)^arr.get(i+1))==0)
	            {
	                arr.remove(j);
	            }
         	}
         	}
         	System.out.println(arr);
    }
}
