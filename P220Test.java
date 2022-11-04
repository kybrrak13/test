package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P220Test {
	@Test
	public void test() {
		P220 p = new P220(2);
		int result = p.test();
		assertThat(result,is(1200));
	}
}
