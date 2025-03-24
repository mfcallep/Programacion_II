import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_discriminante(self):
        return self.b**2 - 4*self.a*self.c

    def get_raiz1(self):
        d = self.get_discriminante()
        if d >= 0:
            return (-self.b + math.sqrt(d)) / (2*self.a)
        return None

    def get_raiz2(self):
        d = self.get_discriminante()
        if d >= 0:
            return (-self.b - math.sqrt(d)) / (2*self.a)
        return None

a = float(input("Ingrese a: "))
b = float(input("Ingrese b: "))
c = float(input("Ingrese c: "))

ecuacion = EcuacionCuadratica(a, b, c)
d = ecuacion.get_discriminante()

if d > 0:
    print(f"La ecuación tiene dos raíces {ecuacion.get_raiz1():.5f} y {ecuacion.get_raiz2():.5f}")
elif d == 0:
    print(f"La ecuación tiene una raíz {ecuacion.get_raiz1():.5f}")
else:
    print("La ecuación no tiene raíces reales")
