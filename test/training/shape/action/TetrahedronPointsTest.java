package training.shape.action;

import by.training.shape.action.impl.TetrahedronPointsImpl;
import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TetrahedronPointsTest {

    Tetrahedron tetrahedron;
    TetrahedronPointsImpl points;
    List<CustomPoint> expectedList;

    @BeforeClass
    public void initialize() {
        tetrahedron = new Tetrahedron(1, new CustomPoint(0, 0, 0));
        points = new TetrahedronPointsImpl();
        expectedList = new ArrayList<>(){
            {
                add(new CustomPoint(1, 0, 0));
                add(new CustomPoint(0, 1, 0));
                add(new CustomPoint(0, 0, 1));
                add(new CustomPoint(-0.6737265863669388, 0, -0.6737265863669388));
            }
        };
    }

    @Test(description = "Testing method findCoordinatesPointsTest")
    public void findCoordinatesPointsTest() {
        List<CustomPoint> actualList = points.findCoordinatesPoints(tetrahedron);
        assertEquals(actualList, expectedList);
    }

    @AfterClass
    public void tierDown() {
        tetrahedron = null;
        expectedList = null;
    }
}
