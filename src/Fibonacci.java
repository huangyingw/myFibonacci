public class Fibonacci {
	public static void FibonacciLoop(int n) {
		long f1 = 0;
		long f2 = 1;
		for (int i = 1; i <= n / 2; i++) {
			System.out.print(f1 + "," + f2 + ",");
			f1 = f1 + f2;
			f2 = f1 + f2;
		}
	}

	public static void FibonacciRec(int n) {

	}
}
