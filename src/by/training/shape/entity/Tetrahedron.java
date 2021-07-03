package by.training.shape.entity;

import by.training.shape.observer.TetrahedronEvent;
import by.training.shape.observer.TetrahedronObserver;
import by.training.shape.observer.impl.TetrahedronObserverImpl;

import static by.training.shape.idgenerator.IdGenerator.nextId;

public class Tetrahedron extends AbstractShape {
    private long idTetrahedron;
    private double distanceToApex;
    private CustomPoint centerOfTetrahedron;
    private TetrahedronObserver observer = new TetrahedronObserverImpl();

    public Tetrahedron(double distanceToApex, CustomPoint centerOfTetrahedron) {
        idTetrahedron = nextId();
        this.distanceToApex = distanceToApex;
        this.centerOfTetrahedron = centerOfTetrahedron;
        super.setIdAbstractShape(idTetrahedron);
    }

    public long getIdTetrahedron() {
        return idTetrahedron;
    }

    @Override
    public double getDistanceToApex() {
        return distanceToApex;
    }

    public CustomPoint getCenterOfTetrahedron() {
        return centerOfTetrahedron;
    }

    @Override
    public void setDistanceToApex(double distanceToApex) {
        this.distanceToApex = distanceToApex;
        notifyObservers();
    }

    public void setCenterOfTetrahedron(CustomPoint centerOfTetrahedron) {
        this.centerOfTetrahedron = centerOfTetrahedron;
        notifyObservers();
    }

    @Override
    public void attach(TetrahedronObserver tetrahedronObserver) {
        this.observer = tetrahedronObserver;
    }

    @Override
    public void detach() {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        if (observer == null) {
            return;
        }
        TetrahedronEvent event = new TetrahedronEvent(this);
        observer.characteristicsChange(event);
    }

    @Override
    public int hashCode() {
        final var PRIME = 31;
        var result = 1;
        result = PRIME * result + Long.hashCode(idTetrahedron);
        result = PRIME * result + Double.hashCode(distanceToApex);
        result = PRIME * result + centerOfTetrahedron.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Tetrahedron tetrahedron = (Tetrahedron) object;
        if (idTetrahedron != idTetrahedron) {
            return false;
        }
        if (distanceToApex != tetrahedron.distanceToApex) {
            return false;
        }
        return centerOfTetrahedron != null ? this.centerOfTetrahedron.equals(centerOfTetrahedron) : tetrahedron.centerOfTetrahedron == centerOfTetrahedron;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Tetrahedron: id = ").append(idTetrahedron);
        stringBuilder.append(", distance to apex = ").append(distanceToApex);
        stringBuilder.append(", ").append(centerOfTetrahedron.toString());
        stringBuilder.append("]\n");
        return stringBuilder.toString();
    }
}