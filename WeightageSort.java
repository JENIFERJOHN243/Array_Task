
public class NumberWeightage {
    public static void main(String[] args) {
        int arr[]={49,36,8,10,12};
        int n=arr.length;
        int i=0,j,k,temp,temp1,temp2;
        int res[]=new int[arr.length];
        for(j=0;j<n;j++)
        {
           temp=0;
           int sqrt=(int)Math.sqrt(arr[j]);
           if(arr[j]==sqrt*sqrt)
             {
               temp+=5;
             }
           if(((arr[j]%4)==0)&&((arr[j]%6)==0))
             {
               temp+=4;
             }
           if((arr[j]%2)==0)
             {
               temp+=3;
             }
           res[i]=temp;
           i++;
         }
          for(j=0;j<n;j++) {
        	   for(k=j+1;k<n;k++) {
        		    if(res[j]<res[k]) {
        			     temp1=res[j];
        			     res[j]=res[k];
        			     res[k]=temp1;
        			     temp2=arr[j];
        			     arr[j]=arr[k];
        			     arr[k]=temp2;
        			}
        	 }
        }
          for(j=0;j<n;j++) {
        	   System.out.print("<"+arr[j]+"," + res[j]+">"+" ");
          }
       }
    }
