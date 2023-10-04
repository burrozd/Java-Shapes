import java.util.Objects;

public abstract class Shape implements Comparable<Shape> {

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(Shape otherShape) {
        return Double.compare(this.getArea(), otherShape.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape shape = (Shape) obj;
        return Double.compare(shape.getArea(), getArea()) == 0 &&
                Double.compare(shape.getPerimeter(), getPerimeter()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea(), getPerimeter());
    }

    // Resten av din Shape-klass
}
