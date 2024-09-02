import java.util.Scanner;
public class IT24102407Lab6Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int count = 0;
		int number;
		double sumofsquare = 0.0;
		System.out.println("Enter positive integers (terminate input with -99)");
		while(true)
		{
			System.out.print("Enter a number: ");
			number = input.nextInt();
		
		if(number==-99)
		{
			break;
			
		}
		else if(number<0)
		{
			System.out.println("Please enter a positivr integer or -99 to terminate");
			continue;
		}
		sumofsquare += Math.pow(number, 2);
		count++;
		}
		System.out.println(" ");
		System.out.println("The root Square (RMS) is: "+Math.sqrt(sumofsquare/count));
	}
}