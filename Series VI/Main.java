import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int i=1;i<=num;i++)
        if(i%2==0)
          System.out.print(((i*i)-2)+" ");
      else
        System.out.print(((i*i)-1)+" ");
	}
}