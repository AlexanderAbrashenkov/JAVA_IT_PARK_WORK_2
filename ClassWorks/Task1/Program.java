import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		int sumToGet = 13768;

		int num5000 = sumToGet / 5000;
		int ostAfter5000 = sumToGet % 5000;

		int num1000 = ostAfter5000 / 1000;
		int ostAfter1000 = ostAfter5000 % 1000;

		int num500 = ostAfter1000 / 500;
		int ostAfter500 = ostAfter1000 % 500;

		int num100 = ostAfter500 / 100;
		int ostAfter100 = ostAfter500 % 100;

		int num50 = ostAfter100 / 50;
		int ostAfter50 = ostAfter100 % 50;

		int num10 = ostAfter50 / 10;
		int ostAfter10 = ostAfter50 % 10;

		int num5 = ostAfter10 / 5;
		int ostAfter5 = ostAfter10 % 5;

		int num2 = ostAfter5 / 2;
		int num1 = ostAfter5 % 2;

		System.out.println("5000 - " + num5000);
		System.out.println("1000 - " + num1000);
		System.out.println("500 - " + num500);
		System.out.println("100 - " + num100);
		System.out.println("50 - " + num500);
		System.out.println("10 - " + num10);
		System.out.println("5 - " + num5);
		System.out.println("2 - " + num2);
		System.out.println("1 - " + num1);

	}
}