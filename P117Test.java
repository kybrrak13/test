package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P117Test {
	@Test
	public void test() {
		int result = P117.test(2, 3, 4000, 30, 100);
		assertThat(result, is(2));
	}
}
