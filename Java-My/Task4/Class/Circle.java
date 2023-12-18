package Class;

public class Circle {
private double radius;

public Circle(double radius) {
    this.radius = radius;
}

public double getRadius() {
    return this.radius;
}

public void setRadius(double radius) {
    this.radius = radius;
}

public double getArea() {
    return Math.PI * Math.pow(this.radius, 2.0);
}

public double getCircumference() {
    return 6.283185307179586 * this.radius;
}
}
