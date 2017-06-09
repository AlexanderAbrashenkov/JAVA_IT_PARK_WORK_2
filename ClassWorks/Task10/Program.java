import java.util.*;

class Program {
	public static void main(String[] args) {
		int[] array = new int[1000];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		int[] count = new int[10];

		for (int i = 0; i < array.length - 1; i++) {
			count[array[i]]++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(i + ": " + count[i]);
		}
	}
}