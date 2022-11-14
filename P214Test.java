package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P214Test {
	@Test
	public void test() {
		int result = P214.test(10,5);
		assertThat(result, is(5));
	}
}
