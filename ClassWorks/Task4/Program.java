import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		int number = 13;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int a = scanner.nextInt();
		
		if (a > number) {
			System.out.println("less");
		} else if (a < number) {
			System.out.println("greater");
		} else {
			System.out.println("you are right!");
		}
		
		System.out.print("Enter number: ");
		a = scanner.nextInt();
		
		if (a > number) {
			System.out.println("less");
		} else if (a < number) {
			System.out.println("greater");
		} else {
			System.out.println("you are right!");
		}
		
		System.out.print("Enter number: ");
		a = scanner.nextInt();
		
		if (a > number) {
			System.out.println("less");
		} else if (a < number) {
			System.out.println("greater");
		} else {
			System.out.println("you are right!");
		}
	}
}