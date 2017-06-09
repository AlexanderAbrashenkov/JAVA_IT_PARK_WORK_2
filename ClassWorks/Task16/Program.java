import java.util.*;

class Program {
	public static void main(String[] args) {
		int index = 10;
		//int num = getFibo(index);
		int num = getFibo2(index, index - 1);
		System.out.println(num);
	}

	private static int getFibo(int index) {
		if (index == 0) return 0;
		if (index == 1) return 1;
		return getFibo(index - 1) + getFibo(index - 2);
	}
	
	private static int getFibo2(int index, int index2) {
		if (index2 == 0)
			return 1;
		int 
	}
}