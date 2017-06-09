import java.util.*;

class Program {
	public static void main(String[] args) {
		int[] array = {5, 2, 1, 5, 6, 7};

		Scanner scanner = new Scanner(System.in);

		int index = scanner.nextInt();

		for (int i = index; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}

		array[array.length - 1] = 0;

		System.out.println(Arrays.toString(array));
	}
}