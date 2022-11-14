package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P112Test {
	@Test
	public void test() {
		int result =P112.test(5,6);
		assertThat(result, is(30));
	}
}
