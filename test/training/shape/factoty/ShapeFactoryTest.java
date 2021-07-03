package training.shape.factoty;

import by.training.shape.entity.AbstractShape;
import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;
import by.training.shape.exception.CustomShapeException;
import by.training.shape.factory.ShapeFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ShapeFactoryTest {
    AbstractShape expectedShape;
    List<double[]> data;
    List<AbstractShape> expectedList;

    @BeforeClass
    public void initialize() {
        expectedShape = new Tetrahedron(1, new CustomPoint(0, 0, 0));
        data = new ArrayList<>() {
            {
                add(new double[] {1, 0, 0, 0});
            }
        };

        expectedList = new ArrayList<>() {
            {
                add(new Tetrahedron(1, new CustomPoint(0, 0, 0)));
            }
        };
    }

    @Test(description = "Testing first constructor of factory")
    public void firstConstructorOfFactoryTest() throws CustomShapeException {
        List<AbstractShape> actual = ShapeFactory.createListShapes(data);
        assertEquals(expectedList, actual);
    }

    @Test(description = "Testing second constructor of factory")
    public void secondConstructorOfFactoryTest() throws CustomShapeException {
        AbstractShape actual = ShapeFactory.createShape(1, 0, 0, 0);
        assertEquals(expectedShape, actual);
    }

    @Test(description = "Testing third constructor of factory")
    public void thirdConstructorOfFactoryTest() throws CustomShapeException {
        AbstractShape actual = ShapeFactory.createShape(1, new CustomPoint(0, 0, 0));
        assertEquals(expectedShape, actual);
    }

    @AfterClass
    public void tierDown() {
        expectedShape = null;
        data = null;
        expectedList = null;
    }
}
