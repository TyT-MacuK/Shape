package by.training.shape.entity;

import java.util.Arrays;
import java.util.List;

import static by.training.shape.idGenerator.IdGenerator.nextId;

public class Tetrahedron extends AbstractShape {
    private long idTetrahedron;
    private CustomPoint firstPoint;
    private CustomPoint secondPoint;
    private CustomPoint thirdPoint;
    private CustomPoint fourthPoint;
    private double sideLength;

    public Tetrahedron(CustomPoint firstPoint, CustomPoint secondPoint, CustomPoint thirdPoint, CustomPoint fourthPoint) {
        idTetrahedron = nextId();
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fourthPoint = fourthPoint;
    }

    public long getId() {
        return idTetrahedron;
    }

    public CustomPoint getFirstPoint() {
        return firstPoint;
    }

    public CustomPoint getSecondPoint() {
        return secondPoint;
    }

    public CustomPoint getThirdPoint() {
        return thirdPoint;
    }

    public CustomPoint getFourthPoint() {
        return fourthPoint;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setFirstPoint(CustomPoint point) {
        this.firstPoint = point;
    }

    public void setSecondPoint(CustomPoint point) {
        this.secondPoint = point;
    }

    public void setThirdPoint(CustomPoint point) {
        this.thirdPoint = point;
    }

    public void setFourthPoint(CustomPoint point) {
        this.fourthPoint = point;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public List<CustomPoint> getAllPoints() {
        return Arrays.asList(firstPoint, secondPoint, thirdPoint, fourthPoint);
    }

    public int hashCode() {
        final var PRIME = 31;
        var result = 1;
        result = PRIME * result + Long.hashCode(idTetrahedron);
        result = PRIME * result + firstPoint.hashCode();
        result = PRIME * result + secondPoint.hashCode();
        result = PRIME * result + thirdPoint.hashCode();
        result = PRIME * result + fourthPoint.hashCode();
        return result;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Tetrahedron tetrahedron = (Tetrahedron) object;
        return idTetrahedron == tetrahedron.idTetrahedron &&
                firstPoint.hashCode() == tetrahedron.firstPoint.hashCode() &&
                secondPoint.hashCode() == tetrahedron.secondPoint.hashCode() &&
                thirdPoint.hashCode() == tetrahedron.thirdPoint.hashCode() &&
                fourthPoint.hashCode() == tetrahedron.fourthPoint.hashCode();
    }

    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("[Tetrahedron: id = ").append(idTetrahedron);
        stringBuilder.append(", first point ").append(firstPoint.toString());
        stringBuilder.append(", second point ").append(secondPoint.toString());
        stringBuilder.append(", third point ").append(thirdPoint.toString());
        stringBuilder.append(", fourth point ").append(fourthPoint.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}