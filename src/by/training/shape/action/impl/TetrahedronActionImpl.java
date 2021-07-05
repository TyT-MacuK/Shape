package by.training.shape.action.impl;

import by.training.shape.action.TetrahedronAction;
import by.training.shape.entity.CustomPoint;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class TetrahedronActionImpl implements TetrahedronAction {

    private static final Logger logger = LogManager.getLogger();
    private static final double TWO = 2;
    private static final double THREE = 3;
    private static final double NUMBERS_OF_SIDES = 4;
    private static final double SIX = 6;
    private static final double TWELVE = 12;

    @Override
    public double calculateSizeLength(double distanceToApex) {
        logger.log(Level.INFO, "Method: calculateSizesLength");
        double result = distanceToApex / (Math.sqrt(SIX) / NUMBERS_OF_SIDES);
        logger.log(Level.INFO, "size length = {}", result);
        return result;
    }

    @Override
    public double calculatePerimeter(double sideLength) {
        logger.log(Level.INFO, "Method: calculatePerimeter");
        double result = sideLength * NUMBERS_OF_SIDES;
        logger.log(Level.INFO, "perimeter = {} ", result);
        return result;
    }

    @Override
    public double calculateSquare(double sideLength) {
        logger.log(Level.INFO, "Method: calculateSquare");
        double result = Math.pow(sideLength, TWO) * Math.sqrt(THREE);
        logger.log(Level.INFO, "side length = {}", result);
        return result;
    }

    @Override
    public double calculateVolume(double sideLength) {
        logger.log(Level.INFO, "Method: calculateVolume");
        double result = Math.pow(sideLength, THREE) * Math.sqrt(TWO) / TWELVE;
        logger.log(Level.INFO, "volume = {}", result);
        return result;
    }

    @Override
    public double calculateVolumeRatios(double distanceToApex) {
        logger.log(Level.INFO, "Method: calculateVolumeRatios");
        double bigSize = calculateSizeLength(distanceToApex);
        double smallSize = distanceToApex / Math.sqrt(TWO / THREE);
        double semiPerimeter = Math.sqrt(smallSize * THREE / TWO);
        double smallSquare = Math.sqrt(semiPerimeter * (semiPerimeter - smallSize) * THREE);
        double result = calculateVolume(bigSize) / (smallSquare / THREE);
        logger.log(Level.INFO, "volume ratios = {}", result);
        return result;
    }

    @Override
    public boolean checkCrossingWithXAndZ(List<CustomPoint> tetrahedronPoints) {
        logger.log(Level.INFO, "Method: checkCrossingWithXAndZ");
        boolean result = true;
        int countPositivePoints = 0;
        int countNegativePoints = 0;
        for (CustomPoint point : tetrahedronPoints) {
            if (point.getY() > 0) {
                countPositivePoints++;
            } else if (point.getY() < 0) {
                countNegativePoints++;
            }
        }
        if (countPositivePoints == tetrahedronPoints.size() || countNegativePoints == tetrahedronPoints.size()) {
            result = false;
        }
        logger.log(Level.INFO, "Tetrahedron crossing the x and z axis - {}", result);
        return result;
    }

    @Override
    public boolean checkCrossingWithYAndZ(List<CustomPoint> tetrahedronPoints) {
        logger.log(Level.INFO, "Method: checkCrossingWithYAndZ");
        boolean result = true;
        int countPositivePoints = 0;
        int countNegativePoints = 0;
        for (CustomPoint point : tetrahedronPoints) {
            if (point.getY() > 0) {
                countPositivePoints++;
            } else if (point.getX() < 0) {
                countNegativePoints++;
            }
        }
        if (countPositivePoints == tetrahedronPoints.size() || countNegativePoints == tetrahedronPoints.size()) {
            result = false;
        }
        logger.log(Level.INFO, "Tetrahedron crossing the y and z axis - {}", result);
        return result;
    }

    @Override
    public boolean checkCrossingWithXAndY(List<CustomPoint> tetrahedronPoints) {
        logger.log(Level.INFO, "Method: checkCrossingWithXAndY");
        boolean result = true;
        int countPositivePoints = 0;
        int countNegativePoints = 0;
        for (CustomPoint point : tetrahedronPoints) {
            if (point.getY() > 0) {
                countPositivePoints++;
            } else if (point.getZ() < 0) {
                countNegativePoints++;
            }
        }
        if (countPositivePoints == tetrahedronPoints.size() || countNegativePoints == tetrahedronPoints.size()) {
            result = false;
        }
        logger.log(Level.INFO, "Tetrahedron crossing the x and y axis - {}", result);
        return result;
    }
}
