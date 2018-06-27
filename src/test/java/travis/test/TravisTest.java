package travis.test;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

public class TravisTest {
    @Test
    public void shouldRunLogger() throws Exception {
        TravisTestOne travis = new TravisTestOne();

        assertTrue(travis.runLogger().equals("Run travis-test-one LOGGER !!!"));

    }


}
