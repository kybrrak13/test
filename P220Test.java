package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P220Test {
	@Test
	public void test() {
		new P220();
		int result = P220.test();
		assertThat(result,is(1200));
	}
}
