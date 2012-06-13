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

	int globalV = 0;

	public int FibonacciOne(int n) {
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
}
