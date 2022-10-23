package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P112Test {
	@Test
	public void test() {
		new P112();
		int result =P112.test();
		assertThat(result, is(12));
	}
}
