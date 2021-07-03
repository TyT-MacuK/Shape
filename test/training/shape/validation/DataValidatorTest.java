package training.shape.validation;

import by.training.shape.validation.DataValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataValidatorTest {

    @DataProvider
    public Object[][] createData() {
        return new Object[][] {
                {"1.2 -2 7.3 5", true},
                {"1.2 3 4d 5", false},
                {"-4 3.4, 8, 1", false},
                {"4 3!2 5 6", false}
        };
    }

    @Test(description = "Testing data validator with different options", dataProvider = "createData")
    public void dataValidatorTest(String data, boolean expected) {
        boolean actual = DataValidator.checkLineIsValid(data);
        assertEquals(actual, expected);
    }
}
