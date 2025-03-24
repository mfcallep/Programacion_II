import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_discriminante(self):
        return self.b ** 2 - 4 * self.a * self.c

    def get_raiz1(self):
        d = self.get_discriminante()
        if d >= 0:
            return (-self.b + math.sqrt(d)) / (2 * self.a)
        return None  # No hay raíz real

    def get_raiz2(self):
        d = self.get_discriminante()
        if d >= 0:
            return (-self.b - math.sqrt(d)) / (2 * self.a)
        return None  # No hay raíz real

def main():
    a, b, c = map(float, input("Ingrese los coeficientes a, b y c: ").split())

    # Verificar si es realmente una ecuación cuadrática
    if a == 0:
        print("No es una ecuación cuadrática. 'a' debe ser distinto de 0.")
        return

    eq = EcuacionCuadratica(a, b, c)
    d = eq.get_discriminante()

    if d > 0:
        print(f"La ecuación tiene dos raíces: {eq.get_raiz1():.5f} y {eq.get_raiz2():.5f}")
    elif d == 0:
        print(f"La ecuación tiene una única raíz: {eq.get_raiz1():.5f}")
    else:
        print("La ecuación no tiene raíces reales.")

if __name__ == "__main__":
    main()
