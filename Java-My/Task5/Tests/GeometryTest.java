
public class GeometryTest {
  public GeometryTest() {

    Circle circle = new Circle(5.4, "black", true);
    System.out.println(circle);

    Rectangle rectangle = new Rectangle(5.4, 4.5);
    System.out.println("Rect area: " + rectangle.GetArea());
    System.out.println(rectangle);

    Square square = new Square(13, "white", false);
    square.SetSide(25);
    System.out.println(square);
  }

}
