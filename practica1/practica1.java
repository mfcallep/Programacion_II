
package practica4;
import java.text.DecimalFormat;
public class practica1 {
    private double x;
    private double y;

    public practica1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] coordCartesianas() {
        return new double[]{x, y};
    }

    public double[] coordPolares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x); // atan2 maneja correctamente los signos
        return new double[]{r, theta};
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Punto(x=" + df.format(x) + ", y=" + df.format(y) + ")";
    }

    public static void main(String[] args) {
        practica1 p = new practica1(3, 4);
        System.out.println(p);  // Muestra: Punto(x=3.0, y=4.0)

        double[] cartesianas = p.coordCartesianas();
        System.out.println("Coordenadas Cartesianas: (" + cartesianas[0] + ", " + cartesianas[1] + ")");

        double[] polares = p.coordPolares();
        System.out.println("Coordenadas Polares: (r=" + polares[0] + ", θ=" + polares[1] + ")");
    }
}
