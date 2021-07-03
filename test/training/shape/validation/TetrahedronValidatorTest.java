package training.shape.validation;

import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;
import by.training.shape.validation.TetrahedronValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TetrahedronValidatorTest {

    @DataProvider
    public Object[][] createData() {
        return new Object[][] {
                {new Tetrahedron(0, new CustomPoint(0, 0, 0)), false},
                {new Tetrahedron(1, new CustomPoint(1, 2, 3)), true},
                {new Tetrahedron(-1.3, new CustomPoint(2, 2, 2)), false},
                {new Tetrahedron(4.33, new CustomPoint(5.96, 7, -6)), true},
        };
    }

    @Test(description = "Testing tetrahedron validator", dataProvider = "createData")
    public void tetrahedronValidatorTest(Tetrahedron tetrahedron, boolean expected) {
        boolean actual = TetrahedronValidator.checkTetrahedronIsValid(tetrahedron);
        assertEquals(actual, expected);
    }
}
