package by.training.shape.action.impl;

import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronActionImpl implements by.training.shape.action.TetrahedronAction {

    private static final int TWO = 2;
    private static final int NUMBERS_OF_SIDES = 4;
    private static final int THREE = 3;
    private static final int TWELVE = 12;

    @Override
    public List<Double> calculateSizesLength(Tetrahedron tetrahedron) {
        List<Double> sizes = new ArrayList<>();

        double xA = tetrahedron.getFirstPoint().getX();
        double yA = tetrahedron.getFirstPoint().getY();
        double zA = tetrahedron.getFirstPoint().getZ();

        double xB = tetrahedron.getSecondPoint().getX();
        double yB = tetrahedron.getSecondPoint().getY();
        double zB = tetrahedron.getSecondPoint().getZ();

        double xC = tetrahedron.getThirdPoint().getX();
        double yC = tetrahedron.getThirdPoint().getY();
        double zC = tetrahedron.getThirdPoint().getZ();

        double xD = tetrahedron.getFourthPoint().getX();
        double yD = tetrahedron.getFourthPoint().getY();
        double zD = tetrahedron.getFourthPoint().getZ();

        double sizeAB = findSizeLength(xA, yA, zA, xB, yB, zB);
        double sizeAC = findSizeLength(xA, yA, zA, xC, yC, zC);
        double sizeAD = findSizeLength(xA, yA, zA, xD, yD, zD);
        double sizeBC = findSizeLength(xB, yB, zB, xC, yC, zC);
        double sizeBD = findSizeLength(xB, yB, zB, xD, yD, zD);
        double sizeCD = findSizeLength(xC, yC, zC, xD, yD, zD);

        sizes.add(sizeAB);
        sizes.add(sizeAC);
        sizes.add(sizeAD);
        sizes.add(sizeBC);
        sizes.add(sizeBD);
        sizes.add(sizeCD);
        return sizes;

    }

    @Override
    public List<Double> calculateSizesLength(List<CustomPoint> allPoints) {
        List<Double> sizes = new ArrayList<>();

        double xA = allPoints.get(0).getX();
        double yA = allPoints.get(0).getY();
        double zA = allPoints.get(0).getZ();

        double xB = allPoints.get(1).getX();
        double yB = allPoints.get(1).getY();
        double zB = allPoints.get(1).getZ();

        double xC = allPoints.get(2).getX();
        double yC = allPoints.get(2).getY();
        double zC = allPoints.get(2).getZ();

        double xD = allPoints.get(3).getX();
        double yD = allPoints.get(3).getY();
        double zD = allPoints.get(3).getZ();

        double sizeAB = findSizeLength(xA, yA, zA, xB, yB, zB);
        double sizeAC = findSizeLength(xA, yA, zA, xC, yC, zC);
        double sizeAD = findSizeLength(xA, yA, zA, xD, yD, zD);
        double sizeBC = findSizeLength(xB, yB, zB, xC, yC, zC);
        double sizeBD = findSizeLength(xB, yB, zB, xD, yD, zD);
        double sizeCD = findSizeLength(xC, yC, zC, xD, yD, zD);

        sizes.add(sizeAB);
        sizes.add(sizeAC);
        sizes.add(sizeAD);
        sizes.add(sizeBC);
        sizes.add(sizeBD);
        sizes.add(sizeCD);
        return sizes;
    }

    private double findSizeLength(double xA, double yA, double zA, double xB, double yB, double zB) {
        return Math.sqrt(Math.pow((xB - xA), TWO) + Math.pow((yB - yA), TWO) +
                Math.pow((zB - zA), TWO));
    }

    @Override
    public double calculatePerimeter(Tetrahedron tetrahedron) {
        return tetrahedron.getSideLength() * NUMBERS_OF_SIDES;
    }

    @Override
    public double calculatePerimeter(double sideLength) {
        return sideLength * NUMBERS_OF_SIDES;
    }

    @Override
    public double calculateSquare(Tetrahedron tetrahedron) {
        return Math.pow(tetrahedron.getSideLength(), TWO) * Math.sqrt(THREE);
    }

    @Override
    public double calculateSquare(double sideLength) {
        return Math.pow(sideLength, TWO) * Math.sqrt(THREE);
    }

    @Override
    public double calculateVolume(Tetrahedron tetrahedron) {
        return Math.pow(tetrahedron.getSideLength(), THREE) * Math.sqrt(TWO) / TWELVE;
    }

    @Override
    public double calculateVolume(double sideLength) {
        return Math.pow(sideLength, THREE) * Math.sqrt(TWO) / TWELVE;
    }
}
