import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		int number = 13;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = scanner.nextInt();
		
		int i = 0;
		
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}