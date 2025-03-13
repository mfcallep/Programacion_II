import math
import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Punto(x={self.x}, y={self.y})"

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea({self.p1}, {self.p2})"

    def dibujaLinea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'bo-')
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.title("Dibujo de Línea")
        plt.grid()
        plt.show()

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo(Centro={self.centro}, Radio={self.radio})"

    def dibujaCirculo(self):
        fig, ax = plt.subplots()
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, fill=False, edgecolor='r')
        ax.add_patch(circulo)
        ax.set_xlim(self.centro.x - self.radio - 1, self.centro.x + self.radio + 1)
        ax.set_ylim(self.centro.y - self.radio - 1, self.centro.y + self.radio + 1)
        ax.set_aspect('equal')
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.title("Dibujo de Círculo")
        plt.grid()
        plt.show()


p1 = Punto(1, 2)
p2 = Punto(4, 6)
linea = Linea(p1, p2)
circulo = Circulo(Punto(3, 3), 2)

print(linea)  # Muestra la línea
linea.dibujaLinea()  # Dibuja la línea
print(circulo)  # Muestra el círculo
circulo.dibujaCirculo()  # Dibuja el círculo
