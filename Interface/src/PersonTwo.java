import java.util.Scanner;
public class PersonTwo implements Calculator{
	Scanner scan = new Scanner(System.in);

	@Override
	public void sum() {
		System.out.println("Manju Implementation");
		System.out.println("Enter two Numbers for Addition");
		int a =scan.nextInt();
		int b =scan.nextInt();
		if(a==0|| b==0)
		{
			System.out.println("Who is your maths teacher..");
		}
		System.out.println("The sum is "+(a+b));
	}
	@Override
	public void sub() {
		System.out.println("Enter two Numbers for Subtraction");
		int a =scan.nextInt();
		int b =scan.nextInt();
		if(a==0|| b==0)
		{
			System.out.println("Who is your maths teacher..");
		}
		System.out.println("The Subtraction is "+(a-b));

	}

	@Override
	public void mul() {
		System.out.println("Enter two Numbers for Multiplication");
		int a =scan.nextInt();
		int b =scan.nextInt();
		if(a==0|| b==0)
		{
			System.out.println("Who is your maths teacher..");
		}
		System.out.println("The Multiplication is "+(a*b));	
	}

	@Override
	public void div() {
		System.out.println("Enter two Numbers for Division");
		int a =scan.nextInt();
		int b =scan.nextInt();
		if(a==0|| b==0)
		{
			System.out.println("Who is your maths teacher..");
		}
		try {

			System.out.println("The Division is "+(a/b));
		}
		catch(Exception Operation) 
		{
			System.out.println(Operation+" Invalid Operation");

		}

	}

}
