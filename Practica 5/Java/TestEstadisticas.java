import java.util.Scanner;

class Estadisticas {
    private double[] datos;

    public Estadisticas(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (  double numero : datos) {
            suma += numero;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double promedio,sumaCuadrados;
        promedio = promedio();
        sumaCuadrados = 0;
        for (double num : datos) {
            sumaCuadrados += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }
}

public class TestEstadisticas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("INGRESA LOS NUMEROS \n");
            numeros[i] = leer.nextDouble();
        }

        Estadisticas est = new Estadisticas(numeros);
        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviación estándar es %.5f\n", est.desviacion());
    }
}
