import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=0;i<n;i++)
      {
        System.out.print("*");
      }
      System.out.println();
      for(int i=n-2;i>0;i--)
      {
         System.out.print("*");
         for(int j=n-2;j>0;j--)
         {
           System.out.print(" ");
         }
        System.out.print("*");
        System.out.println();
      }
            for(int k=0;k<n;k++)
      {
        System.out.print("*");
      }
	}
}