package by.training.shape.comparator;

import by.training.shape.entity.AbstractShape;
import by.training.shape.entity.Warehouse;
import by.training.shape.exception.CustomShapeException;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum TetrahedronComparator {
    ID,
    DISTANCE_TO_APEX,
    CENTER_SHAPE,
    SIZE_LENGTH,
    PERIMETER,
    SQUARE,
    VOLUME;

    private static final Logger logger = LogManager.getLogger();

    public Comparator<AbstractShape> getComparator() throws CustomShapeException {
        return switch (this) {
            case ID -> Comparator.comparingLong(AbstractShape::getIdAbstractShape);
            case DISTANCE_TO_APEX -> Comparator.comparingDouble((ToDoubleFunction<AbstractShape>) shape -> shape.getDistanceToApex());
            case CENTER_SHAPE -> Comparator.comparingDouble((ToDoubleFunction<AbstractShape>) shape -> shape.getCenterAbstractShape().getX())
                    .thenComparing(shape -> shape.getCenterAbstractShape().getY()).thenComparing(shape -> shape.getCenterAbstractShape().getZ());
            case SIZE_LENGTH -> Comparator.comparingDouble((ToDoubleFunction<AbstractShape>) shape ->
                    Warehouse.getInstance().getCharacteristic(shape.getIdAbstractShape()).getSizeLength());
            case PERIMETER -> Comparator.comparingDouble((ToDoubleFunction<AbstractShape>) shape ->
                    Warehouse.getInstance().getCharacteristic(shape.getIdAbstractShape()).getPerimeter());
            case SQUARE -> Comparator.comparingDouble((ToDoubleFunction<AbstractShape>) shape ->
                    Warehouse.getInstance().getCharacteristic(shape.getIdAbstractShape()).getSquare());
            case VOLUME -> Comparator.comparingDouble((ToDoubleFunction<AbstractShape>) shape ->
                    Warehouse.getInstance().getCharacteristic(shape.getIdAbstractShape()).getVolume());
            default -> {
                logger.log(Level.ERROR, "Unknown parameter in method getComparator");
                throw new CustomShapeException("Comparator exception");
            }
        };
    }
}
