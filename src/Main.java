import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Skapa några objekt av Rectangle och Circle
        Rectangle rectangle1 = new Rectangle(5.0, 4.0);
        Rectangle rectangle2 = new Rectangle(3.0, 6.0);
        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle(4.0);

        // Skapa en ArrayList och lägg till objekten
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle1);
        shapeList.add(rectangle2);
        shapeList.add(circle1);
        shapeList.add(circle2);

        // Skapa en komparator för att jämföra objekten baserat på area
        Comparator<Shape> areaComparator = new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                double area1 = shape1.getArea();
                double area2 = shape2.getArea();
                return Double.compare(area1, area2);
            }
        };

        // Använd komparatorn för att sortera objekten baserat på area
        Collections.sort(shapeList, areaComparator);

        // Skriv ut den sorterade listan
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }

        // Skapa ett HashSet för att lagra dina Shape-objekt
        HashSet<Shape> shapeSet = new HashSet<>(shapeList);

        // Skriv ut innehållet i HashSet
        System.out.println("\nInnehåll i HashSet:");
        for (Shape shape : shapeSet) {
            System.out.println(shape);
        }
    }
}
