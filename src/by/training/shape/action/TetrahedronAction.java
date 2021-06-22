package by.training.shape.action;

import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;

import java.util.List;

public interface TetrahedronAction {

    List<Double> calculateSizesLength(Tetrahedron tetrahedron);
    List<Double> calculateSizesLength(List<CustomPoint> allPoints);
    double calculatePerimeter(Tetrahedron tetrahedron);
    double calculatePerimeter(double sideLength);
    double calculateSquare(Tetrahedron tetrahedron);
    double calculateSquare(double sideLength);
    double calculateVolume(Tetrahedron tetrahedron);
    double calculateVolume(double sideLength);
}
