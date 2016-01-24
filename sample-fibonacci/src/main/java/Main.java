import com.example.fibonacci.FibNumDp;
import com.example.fibonacci.FibNumMm;
import com.example.fibonacci.FibNumSimple;

public class Main {

	// http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println(String.format("%25d: %25d", i, FibNumSimple.fib(i)));	// 30後半まで
		}
		for (int i = 0; i < 300; i++) {
			System.out.println(String.format("%25d: %25d", i, FibNumDp.fib(i)));
		}
		for (long i = 1; i != 0; i++) {
			System.out.println(String.format("%25d: %25d", i - 1, FibNumMm.fib(i - 1)));
		}
	}

}
