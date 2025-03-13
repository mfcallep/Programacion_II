
package practica4;

public class practica4 {

    // Método para calcular el área de un círculo
    public static double calcularArea(String figura, double... dimensiones) {
        if (figura.equals("círculo")) {
            if (dimensiones.length == 1) {
                double radio = dimensiones[0];
                return Math.PI * radio * radio;
            } else {
                throw new IllegalArgumentException("El círculo necesita un solo valor para el radio.");
            }
        }
        return -1;
    }

    // Método para calcular el área de un rectángulo
    public static double calcularArea(String figura, double largo, double ancho) {
        if (figura.equals("rectángulo")) {
            return largo * ancho;
        }
        return -1;
    }

    // Método para calcular el área de un triángulo
    public static double calcularArea2(String figura, double base, double altura) {
        if (figura.equals("triángulo")) {
            return (base * altura) / 2;
        }
        return -1;
    }

    // Método para calcular el área de un trapecio
    public static double calcularArea(String figura, double baseMayor, double baseMenor, double altura) {
        if (figura.equals("trapecio")) {
            return ((baseMayor + baseMenor) * altura) / 2;
        }
        return -1;
    }

    // Método para calcular el área de un pentágono
    public static double calcularArea1(String figura, double apotema, double lado) {
        if (figura.equals("pentágono")) {
            return (5 * lado * apotema) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(calcularArea("círculo", 5));            // Área de un círculo con radio 5
        System.out.println(calcularArea("rectángulo", 4, 6));      // Área de un rectángulo con largo 4 y ancho 6
        System.out.println(calcularArea("triángulo", 4, 5));       // Área de un triángulo con base 4 y altura 5
        System.out.println(calcularArea("trapecio", 6, 4, 3));     // Área de un trapecio con bases 6 y 4, altura 3
        System.out.println(calcularArea("pentágono", 3, 5));       // Área de un pentágono con apotema 3 y lado 5
    }
}



