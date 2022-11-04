package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class P112Test {
	@Test
	public void test() {
		P112 p = new P112(5 , 6);
		int result =p.test();
		assertThat(result, is(30));
	}
}
