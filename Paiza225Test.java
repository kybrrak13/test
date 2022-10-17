package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

/**
 * コンソールから数値を2回入力し、蒸散した結果を返す
 * @author ky
 *
 */
public class Paiza225Test {
	@Test
	public void test() {
		new Paiza225();
		int result = Paiza225.test2();
		assertThat(result, is(6));
	}
}
