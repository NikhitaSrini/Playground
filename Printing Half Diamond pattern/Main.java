import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
       int ncount=1;
      int nmcount;
      while(n>0)
      {
        nmcount=ncount;
      for(int count=n-1;count>0;count--)
      {
        System.out.print(" ");
      }
      while(ncount>0)
      {
        System.out.print("*");
        ncount--;
      }
      ncount=nmcount+2;
      n--;
        System.out.println(" ");
      }
	}
}