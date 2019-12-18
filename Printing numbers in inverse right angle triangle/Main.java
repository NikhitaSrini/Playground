import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
       int ncount=1;
      int nmcount;
      while(n>0)
      {
        nmcount=ncount;
      for(int count=n;count>0;count--)
      {
        System.out.print(count);
      }
      ncount=nmcount-1;
      n--;
        System.out.println(" ");
      }
	}
}