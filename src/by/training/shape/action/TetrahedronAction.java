package by.training.shape.action;

import by.training.shape.entity.CustomPoint;

import java.util.List;

public interface TetrahedronAction {
    double calculateSizeLength(double distanceToApex);
    double calculatePerimeter(double sideLength);
    double calculateSquare(double sideLength);
    double calculateVolume(double sideLength);
    double calculateVolumeRatios(double distanceToApex);
    boolean checkCrossingWithXAndZ(List<CustomPoint> tetrahedronPoints);
    boolean checkCrossingWithYAndZ(List<CustomPoint> tetrahedronPoints);
    boolean checkCrossingWithXAndY(List<CustomPoint> tetrahedronPoints);
}
