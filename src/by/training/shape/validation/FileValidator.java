package by.training.shape.validation;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileValidator {

    public static boolean fileValidation(String path) {
        boolean result = false;
        if (path != null || Files.exists(Path.of(path)) || Files.isDirectory(Path.of(path))) {
            result = true;
        }
        return result;
    }
}
