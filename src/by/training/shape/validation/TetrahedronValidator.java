package by.training.shape.validation;

import java.util.List;

public class TetrahedronValidator {

    public static boolean checkTetrahedronIsValid(List<Double> sizesLength) {
        return equalsSizes(sizesLength) == true && sizesLength.get(0) != 0;
    }

    private static boolean equalsSizes(List<Double> sizesLength) {
        boolean result = false;
        if (sizesLength.get(0) == sizesLength.get(1) && sizesLength.get(1) == sizesLength.get(2) &&
                sizesLength.get(2) == sizesLength.get(3)) {
            result = true;
        }
        return result;
    }
}
