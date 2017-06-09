import java.util.*;

class Program {
	public static void main(String[] args) {
        int[] array = {3, 12, 53, 64, 2, 1, 5, 2, 5, 2, 32, 52, 21, 1};

        int length = array.length;

        for (int i = 0; i < length; i++) {
            int num = array[i];

            boolean repeat = false;

            for (int k = length - 1; k > i; k--) {
                int numToComp = array[k];

                if (numToComp == num) {
                    shiftToLeft(k, array);
                    length--;
                    repeat = true;
                }
            }

            if (repeat) {
                shiftToLeft(i, array);
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void shiftToLeft(int from, int[] array) {
        for (int i = from; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[array.length - 1] = 0;
        }
    }
}