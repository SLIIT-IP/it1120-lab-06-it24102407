import java.util.Scanner;
public class IT24102407Lab6Q2C
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int i;
		int sum = 0;
		int[] numbers = new int[10];
		
		System.out.println("Please enter 10 numbers: ");
		for(i = 0; i<10; i++)
		{
			System.out.print("Enter number "+(i +1)+": ");
			numbers[i] = input.nextInt();
			sum = sum + numbers[i];
		}
		System.out.println(" ");
		System.out.println("The numbers you entered are:");
		for (int number : numbers)
		{
			System.out.print(number +" ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Sum of the numbers: "+sum);
		double avg = sum/10;
		System.out.println("Average of the numbers: "+avg);
	}
}