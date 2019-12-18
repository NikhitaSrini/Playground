import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
       int ncount=1;
      int nmcount;
      int num=0;
      while(n>0)
      {
        nmcount=ncount;
      for(int count=n-1;count>0;count--)
      {
        System.out.print(" ");
      }
      while(ncount>0)
      {
        num++;
        System.out.print(num+" ");
        ncount--;
      }
      ncount=nmcount+1;
      n--;
        System.out.println(" ");
      }
    }    
}