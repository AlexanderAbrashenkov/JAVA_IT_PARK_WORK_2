import java.util.Scanner;

class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int number = scanner.nextInt();
		int i = 2;
		boolean isPrime = true;
		
		while(i * i <= number) {
			if (number % i == 0) {
				System.out.println("Number is not prime");
				isPrime = false;
				break;
			}
			i++;
		}
		
		if (isPrime) {
			System.out.println("Number is prime");
		}
	}
}