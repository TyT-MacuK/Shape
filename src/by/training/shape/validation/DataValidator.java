package by.training.shape.validation;

public class DataValidator {

    private static final String ONLY_NUMBERS = "^(-?\\d+.?\\d*?\\s){2}(-?\\d+(.?\\d*))$";

    public static boolean checkLineIsValid(String line) {
        return line.matches(ONLY_NUMBERS);
    }
}
