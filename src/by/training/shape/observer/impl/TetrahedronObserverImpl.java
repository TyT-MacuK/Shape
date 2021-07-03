package by.training.shape.observer.impl;

import by.training.shape.action.impl.TetrahedronActionImpl;
import by.training.shape.entity.AbstractShape;
import by.training.shape.entity.TetrahedronCharacteristic;
import by.training.shape.entity.Warehouse;
import by.training.shape.observer.TetrahedronEvent;
import by.training.shape.observer.TetrahedronObserver;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;

public class TetrahedronObserverImpl implements TetrahedronObserver {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void characteristicsChange(TetrahedronEvent tetrahedronEvent) {
        Warehouse warehouse = Warehouse.getInstance();
        TetrahedronActionImpl tetrahedronAction = new TetrahedronActionImpl();
        AbstractShape tetrahedron = tetrahedronEvent.getSource();

        double sizeLength = tetrahedronAction.calculateSizeLength(tetrahedron.getDistanceToApex());
        double perimeter = tetrahedronAction.calculatePerimeter(sizeLength);
        double square = tetrahedronAction.calculateSquare(sizeLength);
        double volume = tetrahedronAction.calculateVolume(sizeLength);

        warehouse.put(tetrahedron.getIdAbstractShape(), new TetrahedronCharacteristic(sizeLength, perimeter, square, volume));
        logger.log(Level.INFO, "characteristics of the tetrahedron was updated");
    }
}
