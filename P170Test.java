package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P170Test {
	@Test
	public void test() {
		new P170();
		int result = P170.test();
		assertThat(result, is(6));
	}
	
}
