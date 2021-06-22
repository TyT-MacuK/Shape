package by.training.shape.parser;


import by.training.shape.entity.CustomPoint;

import java.util.ArrayList;
import java.util.List;

import static by.training.shape.validation.DataValidator.checkLineIsValid;

public class ParserData {

    public static List<CustomPoint> parsDataToPoint(List<String> lines) {
        List<CustomPoint> result = new ArrayList<>();
        String[] stringNumbers;

        for(String line : lines) {
            if (checkLineIsValid(line)) {
                stringNumbers = line.split(" ");
                CustomPoint point = new CustomPoint();
                point.setX(Double.parseDouble(stringNumbers[0]));
                point.setY(Double.parseDouble(stringNumbers[1]));
                point.setZ(Double.parseDouble(stringNumbers[2]));
                result.add(point);
            }
        }
        return result;
    }
}
