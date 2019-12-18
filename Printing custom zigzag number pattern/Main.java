import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=1;
      int c=0;
      int n1=n;
      while(n>0)
      {
        if(c==0 )
        {for(int i=1;i<n1;i++)
      {
         System.out.print(count);
      }
      System.out.print(count+1);
      System.out.println();
      n--;
       c=1;
         count++;
        }
      else if(c==1)
      {
      System.out.print(count+1);
      for(int j=1;j<n1;j++)
      {
         System.out.print(count);
      }
        System.out.println();
        n--;
        c=0;
        count++;
      }
    }
	}
}