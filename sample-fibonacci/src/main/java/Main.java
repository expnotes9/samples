import com.example.fibonacci.FibNumSimple;

public class Main {

	// http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
	public static void main(String[] args) {
		int n = 100;
		for (int i = 0; i < n; i++) {
			System.out.println(String.format("%25d: %25d", i, FibNumSimple.fib(i)));	// 30後半まで
		}
	}

}
