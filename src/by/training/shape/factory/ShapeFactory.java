package by.training.shape.factory;

import by.training.shape.entity.AbstractShape;
import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;
import by.training.shape.exception.CustomShapeException;
import by.training.shape.validation.TetrahedronValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    private static final Logger logger = LogManager.getLogger();

    private ShapeFactory() {
    }

    public static List<AbstractShape> createListShapes(List<double[]> parameters) {
        List<AbstractShape> listOfTetrahedron = new ArrayList<>();
        for (double[] tetrahedronParameter : parameters) {
            double distanceToApex = tetrahedronParameter[0];
            if (distanceToApex > 0) {
                CustomPoint centerOfTetrahedron = new CustomPoint(tetrahedronParameter[1], tetrahedronParameter[2], tetrahedronParameter[3]);
                AbstractShape tetrahedron = new Tetrahedron(distanceToApex, centerOfTetrahedron);
                listOfTetrahedron.add(tetrahedron);
            }
        }
        logger.log(Level.INFO, "list of tetrahedrons was created. Size = {}", listOfTetrahedron.size());
        return listOfTetrahedron;
    }

    public static AbstractShape createShape(double distanceToApex, CustomPoint centerOfTetrahedron) throws CustomShapeException {
        AbstractShape tetrahedron = new Tetrahedron(distanceToApex, centerOfTetrahedron);
        if (!TetrahedronValidator.checkTetrahedronIsValid((Tetrahedron) tetrahedron)) {
            logger.log(Level.ERROR, "distance to apex is not correct");
            throw new CustomShapeException("distance to apex must be > 0");
        }
        logger.log(Level.INFO, "tetrahedron was created: {}", tetrahedron);
        return tetrahedron;
    }

    public static AbstractShape createShape(double distanceToApex, double coordinatesCenterPointX, double coordinatesCenterPointY, double coordinatesCenterPointZ) throws CustomShapeException {
        CustomPoint centerOfTetrahedron = new CustomPoint(coordinatesCenterPointX, coordinatesCenterPointY, coordinatesCenterPointZ);
        AbstractShape tetrahedron = new Tetrahedron(distanceToApex, centerOfTetrahedron);
        if (!TetrahedronValidator.checkTetrahedronIsValid((Tetrahedron) tetrahedron)) {
            logger.log(Level.ERROR, "distance to apex is not correct");
            throw new CustomShapeException("distance to apex must be > 0");
        }
        logger.log(Level.INFO, "tetrahedron was created: {}", tetrahedron);
        return tetrahedron;
    }
}
