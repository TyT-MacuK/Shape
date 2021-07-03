package by.training.shape.idgenerator;

public class IdGenerator {
    private static long id = 0;

    private IdGenerator() {
    }

    public static long nextId() {
        return ++id;
    }
}
