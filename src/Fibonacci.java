public class Fibonacci {
	public static int FibonacciLoop(int n) {
		int f1 = 0;
		int f2 = 1;
		for (int i = 1; i <= n / 2; i++) {
			f1 = f1 + f2;
			f2 = f1 + f2;
		}
		return f1;
	}

	public static int FibonacciRec(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return FibonacciRec(n - 1) + FibonacciRec(n - 2);
	}
}
