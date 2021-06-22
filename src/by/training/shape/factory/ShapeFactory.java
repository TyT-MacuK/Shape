package by.training.shape.factory;

import by.training.shape.action.impl.TetrahedronActionImpl;
import by.training.shape.entity.AbstractShape;
import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

import static by.training.shape.parser.ParserData.parsDataToPoint;
import static by.training.shape.validation.TetrahedronValidator.checkTetrahedronIsValid;

public class ShapeFactory {

    public static List<AbstractShape> createAbstractShape(List<String> lines) {
        List<CustomPoint> listPoints = parsDataToPoint(lines);
        List<AbstractShape> listAbstractShapes = new ArrayList<>();
        TetrahedronActionImpl action = new TetrahedronActionImpl();
        while (listPoints.size() >= 4) {
            List<Double> sizesLength = action.calculateSizesLength(listPoints);
            if (checkTetrahedronIsValid(sizesLength)) {
                listAbstractShapes.add(new Tetrahedron(listPoints.get(0), listPoints.get(1), listPoints.get(2), listPoints.get(3)));
            }
            listPoints.remove(0);
            listPoints.remove(0);
            listPoints.remove(0);
            listPoints.remove(0);
        }
        return listAbstractShapes;
    }
}
