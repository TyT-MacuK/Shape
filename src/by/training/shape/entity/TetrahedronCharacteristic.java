package by.training.shape.entity;

public class TetrahedronCharacteristic {
    private long id;
    private double perimeter;
    private double square;
    private double volume;

    public TetrahedronCharacteristic(long id, double perimeter, double square, double volume) {
        this.id = id;
        this.perimeter = perimeter;
        this.square = square;
        this.volume = volume;
    }

    public long getId() {
        return id;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    public double getVolume() {
        return volume;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + Long.hashCode(id);
        result = PRIME * result + Double.hashCode(perimeter);
        result = PRIME * result + Double.hashCode(square);
        result = PRIME * result + Double.hashCode(volume);
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
        TetrahedronCharacteristic characteristic = (TetrahedronCharacteristic) object;
        return id == characteristic.id &&
                perimeter == characteristic.perimeter &&
                square == characteristic.square &&
                volume == characteristic.volume;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Tetrahedron characteristic: id = ").append(id);
        stringBuilder.append(", perimeter = ").append(perimeter);
        stringBuilder.append(", square = ").append(square);
        stringBuilder.append(", volume = ").append(volume);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
