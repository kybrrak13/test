package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P225Test {
	@Test
	public void test() {
		P225 p = new P225(2);
		int result = p.test();
		assertThat(result, is(6));
	}
}
