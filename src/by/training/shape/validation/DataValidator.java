package by.training.shape.validation;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;

public class DataValidator {

    private DataValidator() { }

    private static final Logger logger = LogManager.getLogger();
    private static final String ONLY_NUMBERS = "^(\\d+\\.?\\d*?\\s)(-?\\d+\\.?\\d*?\\s){2}(-?\\d+(\\.?\\d*))$";

    public static boolean checkLineIsValid(String line) {
        logger.log(Level.INFO, "method: checkLineIsValid");
        return line.matches(ONLY_NUMBERS);
    }
}
