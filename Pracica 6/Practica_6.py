import math

class Vector:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def __add__(self, other):
        return Vector(self.x + other.x, self.y + other.y)
    
    def __sub__(self, other):
        return Vector(self.x - other.x, self.y - other.y)
    
    def __mul__(self, scalar):
        if isinstance(scalar, (int, float)):
            return Vector(self.x * scalar, self.y * scalar)
        raise ValueError("Multiplicación solo permitida con escalares.")
    
    def dot(self, other):
        return self.x * other.x + self.y * other.y
    
    def magnitude(self):
        return math.sqrt(self.x ** 2 + self.y ** 2)
    
    def is_perpendicular(self, other):
        return self.dot(other) == 0
    
    def is_parallel(self, other):
        return self.x * other.y == self.y * other.x
    
    def projection_on(self, other):
        factor = self.dot(other) / other.dot(other)
        return other * factor
    
    def component_in(self, other):
        factor = self.dot(other) / other.magnitude()
        unit_vector = Vector(other.x / other.magnitude(), other.y / other.magnitude())
        return unit_vector * factor
    
    def __str__(self):
        return f"({self.x}, {self.y})"

# Ejemplo de uso
v1 = Vector(3, 4)
v2 = Vector(6, 8)

print("Suma:", v1 + v2)
print("Resta:", v1 - v2)
print("Escalar * vector:", v1 * 2)
print("Producto punto:", v1.dot(v2))
print("¿Perpendiculares?", v1.is_perpendicular(v2))
print("¿Paralelos?", v1.is_parallel(v2))
print("Proyección de v1 sobre v2:", v1.projection_on(v2))
print("Componente de v1 en la dirección de v2:", v1.component_in(v2))
