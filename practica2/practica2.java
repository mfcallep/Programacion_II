package practica4;

import java.awt.*;
import javax.swing.*;

class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "Punto(x=" + x + ", y=" + y + ")";
    }
}

class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea(" + p1 + ", " + p2 + ")";
    }

    public void dibujaLinea(Graphics g) {
        g.drawLine((int) p1.getX() * 50, (int) p1.getY() * 50, (int) p2.getX() * 50, (int) p2.getY() * 50);
    }
}

class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo(Centro=" + centro + ", Radio=" + radio + ")";
    }

    public void dibujaCirculo(Graphics g) {
        int d = (int) (radio * 2 * 50);
        g.drawOval((int) (centro.getX() * 50 - d / 2), (int) (centro.getY() * 50 - d / 2), d, d);
    }
}

public class practica2 extends JPanel {
    private Linea linea;
    private Circulo circulo;

    public practica2(Linea linea, Circulo circulo) {
        this.linea = linea;
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.dibujaLinea(g);
        circulo.dibujaCirculo(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujar Línea y Círculo");
        Linea linea = new Linea(new Punto(1, 2), new Punto(4, 6));
        Circulo circulo = new Circulo(new Punto(3, 3), 2);
        
        System.out.println(linea);
        System.out.println(circulo);

        practica2 dibujo = new practica2(linea, circulo);
        frame.add(dibujo);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


