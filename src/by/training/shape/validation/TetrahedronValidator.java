package by.training.shape.validation;

import by.training.shape.entity.Tetrahedron;

public class TetrahedronValidator {

    private TetrahedronValidator() { }

    public static boolean checkTetrahedronIsValid(Tetrahedron tetrahedron) {
        boolean result = false;
        if (tetrahedron.getDistanceToApex() > 0) {
            result = true;
        }
        return result;
    }
}
