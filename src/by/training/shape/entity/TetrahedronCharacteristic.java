package by.training.shape.entity;

public class TetrahedronCharacteristic {
    private double sizeLength;
    private double perimeter;
    private double square;
    private double volume;

    public TetrahedronCharacteristic(double sizeLength, double perimeter, double square, double volume) {
        this.sizeLength = sizeLength;
        this.perimeter = perimeter;
        this.square = square;
        this.volume = volume;
    }

    public double getSizeLength() { return sizeLength; }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    public double getVolume() {
        return volume;
    }

    public void setSizeLength(double sizeLength) { this.sizeLength = sizeLength; }

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
        result = PRIME * result + Double.hashCode(sizeLength);
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
        return sizeLength == characteristic.sizeLength &&
                perimeter == characteristic.perimeter &&
                square == characteristic.square &&
                volume == characteristic.volume;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Tetrahedron characteristic: size length = ").append(sizeLength);
        stringBuilder.append(", perimeter = ").append(perimeter);
        stringBuilder.append(", square = ").append(square);
        stringBuilder.append(", volume = ").append(volume);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
