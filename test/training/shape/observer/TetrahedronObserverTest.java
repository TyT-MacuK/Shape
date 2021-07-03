package training.shape.observer;

import by.training.shape.entity.CustomPoint;
import by.training.shape.entity.Tetrahedron;
import by.training.shape.entity.TetrahedronCharacteristic;
import by.training.shape.entity.Warehouse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TetrahedronObserverTest {
    TetrahedronCharacteristic expectedCharacteristic;
    Tetrahedron tetrahedron;
    TetrahedronCharacteristic actualCharacteristic;

    @BeforeClass
    public void initialize() {
        expectedCharacteristic = new TetrahedronCharacteristic(3.2659863237109046, 13.063945294843618, 18.475208614068027, 4.105601914237341);
        tetrahedron = new Tetrahedron(1, new CustomPoint(0, 0, 0));
    }

    @Test
    public void tetrahedronObserverTest() {
        tetrahedron.setDistanceToApex(2);
        actualCharacteristic = Warehouse.getInstance().getCharacteristic(tetrahedron.getIdTetrahedron());
        assertEquals(actualCharacteristic, expectedCharacteristic);
    }

    @AfterClass
    public void tierDown() {
        TetrahedronCharacteristic expectedCharacteristic = null;
        Tetrahedron tetrahedron = null;
        TetrahedronCharacteristic actualCharacteristic = null;
    }
}
