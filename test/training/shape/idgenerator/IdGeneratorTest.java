package training.shape.idgenerator;

import by.training.shape.idgenerator.IdGenerator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IdGeneratorTest {

    @Test(description = "Testing ID generator")
    public void iDGeneratorTest() {
        long expected = 1;
        long actual = IdGenerator.nextId();
        assertEquals(expected, actual);
    }
}
