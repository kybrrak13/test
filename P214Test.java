package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P214Test {
	@Test
	public void test() {
		P214 p = new P214(10,5);
		int result = p.test();
		assertThat(result, is(5));
	}
}
