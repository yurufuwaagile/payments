import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {
    @Test
    public void test() throws Exception {
	assertThat(1 + 1, is(2));
    }
}
