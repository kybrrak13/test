package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class Paiza214Test {
	@Test
	public void test() {
		new Paiza214();
		int result = Paiza214.test();
		assertThat(result, is(2));
	}
}
