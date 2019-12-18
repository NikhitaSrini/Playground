import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
            Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int pro=1;
      int k;
      int t=n;
      int sum=0;
      while(n>0)
      {
       k=n%10; 
      for(int num=1;num<=k;num++)
      {
        pro=pro*num;
      }
        sum=sum+pro;
        pro=1;
        n=n/10;
      }
      if(sum==t)
      {
      System.out.println("Yes");
      }
      else
      {
       System.out.println("No");
      }
	}
}