package by.training.shape.reader;

import static by.training.shape.validation.FileValidator.fileValidation;

import by.training.shape.exception.CustomShapeException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {
    private static final Logger logger = LogManager.getLogger();

    public List<String> readDataFromFile(String path) throws CustomShapeException {
        List<String> lines = new ArrayList<>();
        if (!fileValidation(path)) {
            logger.log(Level.ERROR, "File in path: {} is not exist or empty", path);
            throw new CustomShapeException("File exception. Path: " + path + " is not exist or empty");
        }
        try (Stream<String> lineStream = Files.newBufferedReader(Path.of(path)).lines()) {
            lines = lineStream.collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, "Exception in method: Files.newBufferedReader(Paths.get(path)).lines()");
            throw new CustomShapeException("IOException");
        }
        return lines;
    }
}
