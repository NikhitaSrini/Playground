import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      String replac = str1.replace(str1,str2);
      StringBuilder replace = new StringBuilder(replac);
      int len = replace.length();
      for(int i=0;i<len;i++){
        System.out.print(replace.charAt(i));
      if(replace.charAt(i) == ' ')
      {
         System.out.println();
      }
      }
    }
}