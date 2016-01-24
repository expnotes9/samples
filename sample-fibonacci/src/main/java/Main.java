import com.example.fibonacci.FibNumDp;
import com.example.fibonacci.FibNumMm;
import com.example.fibonacci.FibNumSimple;

public class Main {

	public static void main(String[] args) {
		// http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
		for (int i = 0; i <= 30; i++) {
			System.out.println(String.format("%20d: %20d", i, FibNumSimple.fib(i)));
			System.out.println(String.format("%20d: %20d", i, FibNumDp.fib1(i)));
			System.out.println(String.format("%20d: %20d", i, FibNumDp.fib2(i)));
			System.out.println(String.format("%20d: %20d", i, FibNumMm.fib(i)));
		}
		System.out.println("----------");
		for (int i = 0; i <= 300; i++) {
			System.out.println(String.format("%20d: %20d", i, FibNumDp.fib1(i)));
			System.out.println(String.format("%20d: %20d", i, FibNumDp.fib2(i)));
			System.out.println(String.format("%20d: %20d", i, FibNumMm.fib(i)));
		}
		System.out.println("----------");

		//現実的な時間で終わらない例
		//System.out.println(String.format("%20d: %20d", 50, FibNumSimple.fib(50)));

		//再帰呼び出しがStackOverflowErrorを起こす例
		//System.out.println(String.format("%20d: %20d", 10000, FibNumDp.fib1(10000)));
		//トップダウンだと起きない
		System.out.println(String.format("%20d: %20d", 10000, FibNumDp.fib2(10000)));
		System.out.println("----------");

		for (long i = 1; i != 0; i <<= 1) {
			System.out.println(String.format("%20d: %20d", i - 1, FibNumMm.fib(i - 1)));
		}
	}

}
