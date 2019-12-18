import java.util.Scanner;
class Main{
	    // Type your code here
  public static int square(int n)
  { 
          int sum=0;
          for(int i=1;i<=n;i++)
          {
            sum=sum+i;
          }
    return sum;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int product = square(n);
      System.out.print(product);
	} 

	
}