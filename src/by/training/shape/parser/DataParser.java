package by.training.shape.parser;

import by.training.shape.validation.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DataParser {

    private static final Logger logger = LogManager.getLogger();
    private static final String SPACE_AND_TAB = "\\s+";

    private DataParser() { }

    public static List<double[]> parserDataToParameters(List<String> lines) {
        logger.log(Level.INFO, "method: parserDataToParameters");
        List<double[]> result = new ArrayList<>();
        String[] stringNumbers;
        double[] parameters;

        for(String line : lines) {
            if (DataValidator.checkLineIsValid(line)) {
                stringNumbers = line.split(SPACE_AND_TAB);
                parameters = new double[stringNumbers.length];
                for (int i = 0; i < stringNumbers.length; i++) {
                    parameters[i] = Double.parseDouble(stringNumbers[i]);
                }
                result.add(parameters);
            }
        }
        logger.log(Level.INFO, "data was parsed");
        return result;
    }
}
