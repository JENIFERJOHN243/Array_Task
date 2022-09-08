public class Grandchild {
public static void main(String[] args) {
  String[][] arr= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
  int count=0;
    for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
	  if((arr[i][j]=="ronaldo")&&(j==1)) {
	    for(int m=0;m<arr.length;m++) {
	       for(int n=0;n<arr[m].length;n++) {
	          if((arr[m][n]==arr[i][j-1])&&(n==1)) {
		      count++;
		}
	     }
	  }
        }
      }
    }
System.out.println(count);
}
}

