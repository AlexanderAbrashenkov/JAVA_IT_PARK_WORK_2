import java.util.*;

class Program {
	public static void main(String[] args) {

		char[] arr = {'1', '5', '9', '7', '4'};
		int multiply = 1;
		int x = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			int num = arr[i] - '0';
			x += num * multiply;
			multiply *= 10;
		}

		System.out.println(x);
	}
}