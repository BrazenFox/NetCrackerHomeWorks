package com.mycompany.horstmann.InheritanceAndReflection;

import com.mycompany.horstmann.InheritanceAndReflection.Point;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint[" +
                "label='" + label + '\'' + ", " + super.toString() +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LabeledPoint)) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(getLabel(), that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLabel());
    }
}
