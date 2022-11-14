package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P170Test {
	@Test
	public void test() {
		int result = P170.test(2,3);
		assertThat(result, is(6));
	}
}
