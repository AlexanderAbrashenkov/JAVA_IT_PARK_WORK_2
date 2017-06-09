import java.util.*;

class Program {
	public static void main(String[] args) {
		int[] array = {5, 2, 1, 5, 6, 7};

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmp;
		}

		System.out.println(Arrays.toString(array));
	}
}