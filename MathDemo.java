public class MathDemo {

	private static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	private static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	private static int sum (int[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
	}

	private static float mean(int[] args) {
		return (float) sum(args) / args.length;
	}

	private static int factorial(int n) {
		if (n == 1) return 1;
		return n * factorial(n - 1);
	}

}