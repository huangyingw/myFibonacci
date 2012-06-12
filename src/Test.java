public class Test {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(10);
		System.out.println(fib.FibonacciLoop(10));
		System.out.println(fib.FibonacciRec(10));
		System.out.println(fib.FibonacciRecMemorized(10));
	}
}
