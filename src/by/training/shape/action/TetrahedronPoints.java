package by.training.shape.action;

import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;

import java.util.List;

public interface TetrahedronPoints {
    List<CustomPoint> findCoordinatesPoints(Tetrahedron tetrahedron);
}
