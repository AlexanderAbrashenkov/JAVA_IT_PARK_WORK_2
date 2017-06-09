import java.util.*;

class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int[] arr = new int[8];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = num % 2;
			num /= 2;
		}

		System.out.println(Arrays.toString(arr));
	}
}