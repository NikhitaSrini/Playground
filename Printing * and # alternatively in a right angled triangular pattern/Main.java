import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n= in.nextInt();
      for(int row=1;row<=n;row++)
      {
           if(row==1)
           {
             System.out.println("*");   
           }
           if(row==2)
           {
             System.out.println("#*");   
           }
           if(row==3)
           {
             System.out.println("#*#");   
           }
           if(row==4)
           {
             System.out.println("*#*#");   
           }
           if(row==5)
           {
             System.out.println("*#*#*");   
           }
           if(row==6)
           {
             System.out.println("#*#*#*");   
           }
      }
      
    }
}