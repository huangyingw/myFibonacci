public class Test {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(30);
		// System.out.println(fib.FibonacciOne(30));
		// System.out.println(fib.getCount());
		// System.out.println(fib.FibonacciOne(1));
		// System.out.println(fib.FibonacciOne(2));
		// System.out.println(fib.FibonacciOne(3));
		// System.out.println(fib.FibonacciOne(4));
		fib.globalV = 0;
		System.out.println(fib.FibonacciOne(5));

		fib.globalV = 0;
		System.out.println(fib.FibonacciOne(6));

		fib.globalV = 0;
		System.out.println(fib.FibonacciOne(7));
	}
}
