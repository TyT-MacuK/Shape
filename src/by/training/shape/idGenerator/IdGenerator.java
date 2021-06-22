package by.training.shape.idGenerator;

public class IdGenerator {
    private static long id = 0;

    public static long nextId() {
        return ++id;
    }
}
