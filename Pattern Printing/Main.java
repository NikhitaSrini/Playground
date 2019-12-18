import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc= new Scanner(System.in);
      int row= sc.nextInt();
      int column = sc.nextInt();
      for(int i=0;i<column;i++)
      {
       for(int k=i;k>0;k--)
       {
       System.out.print(column+k-i);
       }
       for(int j=i;j<row;j++)
       {
       System.out.print(row-i);
       }
        System.out.println();
      }
    }
}