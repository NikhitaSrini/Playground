import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int pro=1;
      for(int num=1;num<=n;num++)
      {
        pro=pro*num;
      }
      System.out.println(pro); 
	}
}