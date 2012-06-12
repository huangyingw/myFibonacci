public class Test {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(30);
		fib.resetCount();
		System.out.println(fib.FibonacciLoop(30));
		System.out.println(fib.getCount());

		fib.resetCount();
		System.out.println(fib.FibonacciRec(30));
		System.out.println(fib.getCount());

		fib.resetCount();
		System.out.println(fib.FibonacciRecMemorized(30));
		System.out.println(fib.getCount());
	}
}
