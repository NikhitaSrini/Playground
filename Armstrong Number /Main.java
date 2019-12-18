import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int t=n;
      int check=n;
      int count=0;
      int k;
      int pro=1;
      int sum=0;
      while(n>0)
      {
        n=n/10;
        count++;
      }
     while(t>0)
     {
       k=t%10;
       for(int num=1;num<=count;num++)
       {
         pro=pro*k;
       }
       sum=sum+pro;
        t=t/10;
       pro=1;
     }
      if(sum==check)
      {
        System.out.println("Armstrong Number"); 
      }
      else
      {
      System.out.println("Not a Armstrong Number");
      }
	}
}