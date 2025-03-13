package practica4;

public class practica4 {
    
    public static double calcular(double radio) {
        return Math.PI * radio * radio;
    }

  
    public static double calcular(double base, double altura) {
        return base * altura;
    }

   
    public static double calcular(double base, double altura, boolean esTriangulo) {
        return esTriangulo ? (base * altura) / 2 : base * altura;
    }

   
    public static double calcular(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

   
    public static double calcular(double lado, double apotema, int lados) {
        return (lados * lado * apotema) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Área del círculo: " + calcular(5));  // 78.54
        System.out.println("Área del rectángulo: " + calcular(4, 6));  // 24
        System.out.println("Área del triángulo: " + calcular(4, 6, true));  // 12
        System.out.println("Área del trapecio: " + calcular(6, 4, 5));  // 25
        System.out.println("Área del pentágono: " + calcular(5, 3.5, 5));  // 43.75
    }
}
