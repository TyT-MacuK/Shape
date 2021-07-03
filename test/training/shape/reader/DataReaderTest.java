package training.shape.reader;

import by.training.shape.exception.CustomShapeException;
import by.training.shape.reader.DataReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataReaderTest {

    DataReader reader;

    @BeforeClass
    public void initialize() {
        reader = new DataReader();
    }

    @Test(description = "Testing reader with right path")
    public void positiveReaderTest() throws CustomShapeException {
        reader.readDataFromFile("test\\resources\\data.txt");
    }

    @Test(description = "Testing reader with wrong path", expectedExceptions = CustomShapeException.class)
    public void negativeReaderTest() throws CustomShapeException {
        reader.readDataFromFile("data");
    }

    @Test(description = "Testing reader with null", expectedExceptions = CustomShapeException.class)
    public void nullReaderTest() throws CustomShapeException {
        reader.readDataFromFile(null);
    }

    @AfterClass
    public void tierDown() {
        reader = null;
    }
}
