class Program {
	public static void main(String[] args) {

		int[] arr = {2, 4, 5, 1, 5};
		int multiply = 1;
		int x = 0;

		for (int i = arr.length - 1; i >= 0; i++) {
			x += arr[i] * multiply;
			multiply *= 10;
		}

		System.out.println(x);
	}
}