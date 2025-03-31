package Vector;

public class Vector {
    private double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public Vector multiply(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    public double dot(Vector other) {
        return this.x * other.x + this.y * other.y;
    }

    public double magnitude() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public boolean isPerpendicular(Vector other) {
        return this.dot(other) == 0;
    }

    public boolean isParallel(Vector other) {
        return this.x * other.y == this.y * other.x;
    }

    public Vector projectionOn(Vector other) {
        double factor = this.dot(other) / other.dot(other);
        return other.multiply(factor);
    }

    public Vector componentIn(Vector other) {
        double factor = this.dot(other) / other.magnitude();
        Vector unitVector = new Vector(other.x / other.magnitude(), other.y / other.magnitude());
        return unitVector.multiply(factor);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(6, 8);

        System.out.println("Suma: " + v1.add(v2));
        System.out.println("Resta: " + v1.subtract(v2));
        System.out.println("Escalar * vector: " + v1.multiply(2));
        System.out.println("Producto punto: " + v1.dot(v2));
        System.out.println("¿Perpendiculares? " + v1.isPerpendicular(v2));
        System.out.println("¿Paralelos? " + v1.isParallel(v2));
        System.out.println("Proyección de v1 sobre v2: " + v1.projectionOn(v2));
        System.out.println("Componente de v1 en la dirección de v2: " + v1.componentIn(v2));
    }
}

