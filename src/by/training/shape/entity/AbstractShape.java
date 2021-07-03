package by.training.shape.entity;

import by.training.shape.observer.TetrahedronObservable;

public abstract class AbstractShape implements TetrahedronObservable {
    private long idAbstractShape;
    private double distanceToApex;
    private CustomPoint centerAbstractShape;

    public AbstractShape() {
    }

    public AbstractShape(long idAbstractShape) {
        this.idAbstractShape = idAbstractShape;
    }

    public long getIdAbstractShape() {
        return idAbstractShape;
    }

    public double getDistanceToApex() {
        return distanceToApex;
    }

    public CustomPoint getCenterAbstractShape() {
        return centerAbstractShape;
    }

    public void setIdAbstractShape(long idAbstractShape) {
        this.idAbstractShape = idAbstractShape;
    }

    public void setDistanceToApex(double distanceToApex) {
        this.distanceToApex = distanceToApex;
    }

    public void setCenterAbstractShape(CustomPoint centerAbstractShape) {
        this.centerAbstractShape = centerAbstractShape;
    }

    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + Long.hashCode(idAbstractShape);
        result = PRIME * result + Double.hashCode(distanceToApex);
        result = PRIME * result + centerAbstractShape.hashCode();
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
        AbstractShape shape = (AbstractShape) object;
        if (idAbstractShape != idAbstractShape) {
            return false;
        }
        if (distanceToApex != shape.distanceToApex) {
            return false;
        }
        return centerAbstractShape != null ? this.centerAbstractShape.equals(centerAbstractShape) : this.centerAbstractShape == centerAbstractShape;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ Abstract shape: id = ").append(idAbstractShape);
        stringBuilder.append(", distance to apex = ").append(distanceToApex);
        stringBuilder.append(", ").append(centerAbstractShape.toString());
        stringBuilder.append("]\n");
        return stringBuilder.toString();
    }
}
