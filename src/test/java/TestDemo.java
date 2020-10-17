import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class TestDemo {

    @Test
    void TestDemo() {
        assertThat(1, is(equalTo(1)));
    }
}
