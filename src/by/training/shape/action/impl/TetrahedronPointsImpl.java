package by.training.shape.action.impl;

import by.training.shape.action.TetrahedronPoints;
import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronPointsImpl implements TetrahedronPoints {
    private static final double TWO = 2;
    private static final double TREE = 3;

    @Override
    public List<CustomPoint> findCoordinatesPoints(Tetrahedron tetrahedron) {
        TetrahedronActionImpl action = new TetrahedronActionImpl();

        double distanceToApex = tetrahedron.getDistanceToApex();
        double sizeLength = action.calculateSizeLength(distanceToApex);
        CustomPoint centerOfTetrahedron = tetrahedron.getCenterOfTetrahedron();

        CustomPoint firstPoint = findFirstPoint(distanceToApex, centerOfTetrahedron);
        CustomPoint secondPoint = findSecondPoint(distanceToApex, centerOfTetrahedron);
        CustomPoint thirdPoint = findThirdPoint(distanceToApex, centerOfTetrahedron);
        CustomPoint fourthPoint = findForthPoint(distanceToApex, sizeLength, centerOfTetrahedron);

        List<CustomPoint> result = new ArrayList<>();
        result.add(firstPoint);
        result.add(secondPoint);
        result.add(thirdPoint);
        result.add(fourthPoint);

        return result;
    }

    private CustomPoint findFirstPoint(double distanceToApex, CustomPoint centerOfTetrahedron) {
        double x = centerOfTetrahedron.getX() + distanceToApex;
        double y = centerOfTetrahedron.getY();
        double z = centerOfTetrahedron.getZ();
        return new CustomPoint(x, y, z);
    }

    private CustomPoint findSecondPoint(double distanceToApex, CustomPoint centerOfTetrahedron) {
        double x = centerOfTetrahedron.getX();
        double y = centerOfTetrahedron.getY() + distanceToApex;
        double z = centerOfTetrahedron.getZ();
        return new CustomPoint(x, y, z);
    }

    private CustomPoint findThirdPoint(double distanceToApex, CustomPoint centerOfTetrahedron) {
        double x = centerOfTetrahedron.getX();
        double y = centerOfTetrahedron.getY();
        double z = centerOfTetrahedron.getZ() + distanceToApex;
        return new CustomPoint(x, y, z);
    }

    private CustomPoint findForthPoint(double distanceToApex, double sizeLength, CustomPoint centerOfTetrahedron) {
        double x = Math.sqrt(Math.pow(sizeLength, TWO) / TWO) + distanceToApex - (Math.sqrt(TREE) * sizeLength);
        double y = centerOfTetrahedron.getY();
        double z = x;
        return new CustomPoint(x, y, z);
    }
}
