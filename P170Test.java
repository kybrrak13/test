package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P170Test {
	@Test
	public void test() {
		P170 p = new P170(2,3);
		int result = p.test();
		assertThat(result, is(6));
	}
}
