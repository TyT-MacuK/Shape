package training.shape.action;

import by.training.shape.action.impl.TetrahedronActionImpl;
import by.training.shape.entity.CustomPoint;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TetrahedronActionTest {

    private static final double DELTA = 0.01;
    TetrahedronActionImpl action;
    double distanceToApex;
    double sizeLength;
    List<CustomPoint> pointsNotCrossAxises;
    List<CustomPoint> pointsCrossAxises;

    @BeforeClass
    public void initialize() {
        action = new TetrahedronActionImpl();
        distanceToApex = 1;
        sizeLength = 1;
        pointsNotCrossAxises = new ArrayList<>() {
            {
                add(new CustomPoint(1, 1, 1));
                add(new CustomPoint(10, 10, 10));
                add(new CustomPoint(5.5, 5, 5.5));
                add(new CustomPoint(2.3, 5.6, 9.1));
            }
        };
        pointsCrossAxises = new ArrayList<>() {
            {
                add(new CustomPoint(1, 0, 0));
                add(new CustomPoint(0, 1, 0));
                add(new CustomPoint(0, 0, 1));
                add(new CustomPoint(-0.67, 0, -0.67));

            }
        };
    }

    @Test(description = "Calculate the size length")
    public void calculateSizeLengthTest() {
        double expected = 1.6329931618554523;
        double actual = action.calculateSizeLength(distanceToApex);
        assertEquals(expected, actual, DELTA);
    }

    @Test(description = "Calculate the perimeter")
    public void calculatePerimeter() {
        double expected = 4.0;
        double actual = action.calculatePerimeter(distanceToApex);
        assertEquals(expected, actual, DELTA);
    }

    @Test(description = "Calculate the square")
    public void calculateSquareTest() {
        double expected = 1.7320508075688772;
        double actual = action.calculateSquare(distanceToApex);
        assertEquals(expected, actual, DELTA);
    }

    @Test(description = "Calculate the volume")
    public void calculateVolumeTest() {
        double expected = 0.11785113019775793;
        double actual = action.calculateVolume(distanceToApex);
        assertEquals(expected, actual, DELTA);
    }

    @Test(description = "Calculate volume ratios")
    public void calculateVolumeRatiosTest() {
        double expected = 2.1122;
        double actual = action.calculateVolumeRatios(distanceToApex);
        assertEquals(expected, actual, DELTA);
    }

    @DataProvider
    public Object[][] createData() {
        return new Object[][]{
                {pointsNotCrossAxises, false},
                {pointsCrossAxises, true}
        };
    }

    @Test(description = "Check crossing with x and z", dataProvider = "createData")
    public void checkCrossingWithXAndZTest(List<CustomPoint> listPoints, boolean expected) {
        boolean actual = action.checkCrossingWithXAndZ(listPoints);
        assertEquals(actual, expected);
    }

    @Test(description = "Check crossing with y and z", dataProvider = "createData")
    public void checkCrossingWithYAndZTest(List<CustomPoint> listPoints, boolean expected) {
        boolean actual = action.checkCrossingWithYAndZ(listPoints);
        assertEquals(actual, expected);
    }

    @Test(description = "Check crossing with y and z", dataProvider = "createData")
    public void checkCrossingWithXAndYTest(List<CustomPoint> listPoints, boolean expected) {
        boolean actual = action.checkCrossingWithXAndY(listPoints);
        assertEquals(actual, expected);
    }

    @AfterClass
    public void tierDown() {
        action = null;
        pointsNotCrossAxises = null;
        pointsCrossAxises = null;
    }
}
