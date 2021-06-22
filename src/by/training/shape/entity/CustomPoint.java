package by.training.shape.entity;

public class CustomPoint {
    private double x;
    private double y;
    private double z;

    public CustomPoint() {
    }

    public CustomPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int hashCode() {
        final double PRIME = 31;
        double result = 1;
        result = PRIME * result + x;
        result = PRIME * result + y;
        result = PRIME * result + z;
        return (int) result;
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
        CustomPoint point = (CustomPoint) object;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    public String toString() {
        var builder = new StringBuilder();
        builder.append("coordinates: x = ").append(x);
        builder.append(", y = ").append(y);
        builder.append(", z = ").append(z);
        return builder.toString();
    }
}
