package hello;
import java.util.Scanner;

public class calc {
	public static void main(String args[])
	{
		float a,b,res;
		char choice,ch='\0';
		
		Scanner sc=new Scanner(System.in);
		while(ch!=5)
		{
			System.out.println("1.Addition\n");
			System.out.println("2.subtraction\n");
			System.out.println("3.Multliplication\n");
			System.out.println("4.Divide\n");
			choice=sc.next().charAt(0);
			switch(choice)
			{
			case '1':System.out.println("enter 2 nos.");
			      a=sc.nextFloat();
			      b=sc.nextFloat();
			      res=a+b;
			      System.out.println("result=" +res);
			      break;
			case '2':System.out.println("enter 2 nos.");
		      a=sc.nextFloat();
		      b=sc.nextFloat();
		      res=a-b;
		      System.out.println("result=" +res);
		      break;
			case '3':System.out.println("enter 2 nos.");
		      a=sc.nextFloat();
		      b=sc.nextFloat();
		      res=a*b;
		      System.out.println("result=" +res);
		      break;
			case '4':System.out.println("enter 2 nos.");
		      a=sc.nextFloat();
		      b=sc.nextFloat();
		      res=a/b;
		      System.out.println("result=" +res);
		      break;
			case '5':System.exit(0);
			break;
			default:System.out.println("wrong choice");
			break;
			      
			}
		}
	}

}
