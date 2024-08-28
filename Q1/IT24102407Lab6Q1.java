import java.util.Scanner;
public class IT24102407Lab6Q1
{
 public static void main(String[]args)
   {
    Scanner input =new Scanner(System.in);
	
	System.out.print("Enter a num:");
	int num = input.nextInt();
	float noSq =num*num;
	float noSqRoot = (float)Math.sqrt(num);
	
	System.out.println("The square of"+ num + " is : "+ noSq);
	System.out.println("The square of"+ num + " is "+ noSqRoot);
	}
	}