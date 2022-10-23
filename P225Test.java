package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P225Test {
	@Test
	public void test() {
		new P225();
		int result = P225.test();
		assertThat(result, is(6));
	}
}
