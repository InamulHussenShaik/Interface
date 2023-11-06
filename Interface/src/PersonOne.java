import java.util.Scanner;
public class PersonOne implements Calculator {
    Scanner scan = new Scanner(System.in);
	@Override
	public void sum() {
		System.out.println("Enamul Hussen mplementation");
		System.out.println("Enter two Numbers for Addition");
		int a =scan.nextInt();
		int b =scan.nextInt();
		System.out.println("The Sum is "+(a+b));
	}
	@Override
	public void sub() {
		System.out.println("Enter two Numbers for Subtraction ");
		int a =scan.nextInt();
		int b =scan.nextInt();
		System.out.println("The Subtraction is "+(a-b));

	}

	@Override
	public void mul() {
		System.out.println("Enter two Numbers for Multiplication");
		int a =scan.nextInt();
		int b =scan.nextInt();
		System.out.println("The Multiplication is "+a*b);	
	}

	@Override
	public void div() {
		System.out.println("Enter two Numbers for Division");
		int a =scan.nextInt();
		int b =scan.nextInt();
		try {

			System.out.println("The Division is "+(a/b));
		}
		catch(Exception Operation) 
		{
			System.out.println("Invalid Operation");

		}

	}

}
