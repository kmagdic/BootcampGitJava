package circle;

public class Circle {
    public double radius = 5;  // ovo je varijabla klase sa 'default' vrijednost


    public double calcSurfaceArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // izvođenje
    public static void main(String[] args) {
        Circle c1 = new Circle(); // c1 je objekt
        c1.setRadius(8);
        System.out.println(c1.calcSurfaceArea());

        Circle c2 = new Circle(); // c2 je objekt
        c2.setRadius(12);
        System.out.println(c2.calcSurfaceArea());
    }
}