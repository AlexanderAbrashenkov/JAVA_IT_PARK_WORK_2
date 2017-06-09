class Program {
	public static void main(String[] args) {
		int[] arr = {12, -45, 75, 94, 34, 14};
		int number = 50;
		showLess(arr, number);
	}

	static void showLess(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < number) {
				System.out.print(array[i] + " ");
			}
		}
	}
}