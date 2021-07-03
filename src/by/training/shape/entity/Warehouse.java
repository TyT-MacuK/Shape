package by.training.shape.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private static final Logger logger = LogManager.getLogger();
    private static Warehouse instance;
    private Map<Long, TetrahedronCharacteristic> characteristics = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
            logger.log(Level.INFO, "warehouse was created");
        }
        return instance;
    }

    public void put(long id, TetrahedronCharacteristic characteristic) {
        characteristics.put(id, characteristic);
        logger.log(Level.INFO, "method: put");
    }

    public void remove(long id) {
        characteristics.remove(id);
        logger.log(Level.INFO, "method: remove");
    }

    public TetrahedronCharacteristic getCharacteristic(long id) {
        logger.log(Level.INFO, "method: get");
        return characteristics.get(id);
    }

    public Map<Long, TetrahedronCharacteristic> getMapCharacteristics() {
        logger.log(Level.INFO, "method: getMapCharacteristics");
        return Map.copyOf(characteristics);
    }
}
