package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P214Test {
	@Test
	public void test() {
		new P214();
		int result = P214.test();
		assertThat(result, is(2));
	}
}
