import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.math.Foo;

public class MyApp2 {

	private final static Logger logger = LoggerFactory.getLogger(MyApp2.class);

	public static void main(String[] args) {
		logger.info("Entering application.");

		System.out.println(Foo.add(100, 123));
		System.out.println(Foo.add(1<<30, 1<<30));	// throws IllegalStateException.

		logger.info("Exiting application.");
	}
}
