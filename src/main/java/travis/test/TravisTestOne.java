package travis.test;

import java.util.logging.Logger;

public class TravisTestOne {

    Logger logger = Logger.getLogger(TravisTestOne.class.getName());

    public String runLogger() {

        final String msg = "Run travis-test-one LOGGER !!!";

        logger.severe(msg);

        return msg;
    }
}
