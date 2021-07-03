package by.training.shape.repository;

import by.training.shape.entity.AbstractShape;

@FunctionalInterface
public interface TetrahedronSpecification {
    boolean specify(AbstractShape abstractShape);
}
