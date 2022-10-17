package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class Paiza225Test {
	@Test
	public void test() {
		new Paiza225();
		int result = Paiza225.test2();
		assertThat(result, is(6));
	}
}
