public class Fibonacci {
	public int FibonacciLoop(int n) {
		int f1 = 0;
		int f2 = 1;
		for (int i = 1; i <= n / 2; i++) {
			f1 = f1 + f2;
			f2 = f1 + f2;
			count++;
		}
		return f1;
	}

	public int FibonacciRec(int n) {
		count++;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			return FibonacciRec(n - 1) + FibonacciRec(n - 2);
		}
	}

	public int[] data;
	private int size;
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Fibonacci(int size) {
		super();
		this.size = size;
		data = new int[size + 1];
		for (int i = 0; i < size; i++) {
			data[i] = 0;
		}
	}

	public int FibonacciRecMemorized(int n) {
		count++;
		if (data[n] > 0) {
			return data[n];
		}
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			data[n] = FibonacciRecMemorized(n - 1)
					+ FibonacciRecMemorized(n - 2);
		}
		return data[n];
	}

	int globalV = 0;

	public int FibonacciOne(int n) {
		count++;
		int toReturn;
		int pre;
		if (n == 1)
			return 1;
		else {
			pre = FibonacciOne(n - 1);
			toReturn = pre + globalV;
			globalV = pre;
			return toReturn;
		}
	}

	public void resetCount() {
		// TODO Auto-generated method stub
		setCount(0);
	}
}
