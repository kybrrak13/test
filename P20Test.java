package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P20Test {
	@Test
	public void test() {
		double result = P20.test(1, 8, 40);
		assertThat(result, is(0.12));
	}
}
