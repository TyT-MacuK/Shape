package by.training.shape.repository;

import by.training.shape.entity.AbstractShape;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TetrahedronRepository {

    private List<AbstractShape> repository = new ArrayList<>();

    public boolean add(AbstractShape shape) {
        return repository.add(shape);
    }

    public boolean addAll(List<AbstractShape> shapes) {
        return repository.addAll(shapes);
    }

    public int size() {
        return repository.size();
    }

    public void clear() {
        repository.clear();
    }

    public AbstractShape get(int index) {
        return repository.get(index);
    }

    public boolean contains(AbstractShape shape) {
        return repository.contains(shape);
    }

    public int indexOf(AbstractShape shape) {
        return repository.indexOf(shape);
    }

    public AbstractShape remove(int index) {
        return repository.remove(index);
    }

    public boolean remove(AbstractShape shape) {
        return repository.remove(shape);
    }

    public AbstractShape set(int index, AbstractShape shape) {
        return repository.set(index, shape);
    }

    public List<AbstractShape> query(TetrahedronSpecification specification) {
        List<AbstractShape> result = new ArrayList<>();
        for (AbstractShape shape : repository) {
            if (specification.specify(shape)){
                result.add(shape);
            }
        }
        return result;
    }

    public List<AbstractShape> queryStream(TetrahedronSpecification specification) {
        List<AbstractShape> result = repository.stream().filter(specification::specify).collect(Collectors.toList());
        return result;
    }

    public List<AbstractShape> sort(Comparator<? super AbstractShape> comparator) {
        List<AbstractShape> result = new ArrayList<>(repository);
        result.sort(comparator);
        return result;
    }

    public int hashCode() {
        return repository.hashCode();
    }

    public boolean equals(Object object) {
        return repository.equals(object);
    }

    public String toString() {
        return repository.toString();
    }
}
