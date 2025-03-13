import math

class Area:
    @staticmethod
    def calcular(radio=None, base=None, altura=None, base_mayor=None, base_menor=None, lados=None, apotema=None):
        """Calcula el área de distintas figuras geométricas."""
        
        if radio is not None and base is None and altura is None:
            
            return math.pi * radio ** 2
        
        elif base is not None and altura is not None and base_mayor is None and base_menor is None:
            
            return (base * altura) / 2 if lados is not None and lados == 3 else base * altura

        elif base_mayor is not None and base_menor is not None and altura is not None:
            
            return ((base_mayor + base_menor) * altura) / 2
        
        elif lados is not None and apotema is not None and base is not None:
            
            return (lados * base * apotema) / 2

        else:
            return "Parámetros inválidos"

# Pruebas
print("Área del círculo:", Area.calcular(radio=5))  # 78.54
print("Área del rectángulo:", Area.calcular(base=4, altura=6))  # 24
print("Área del triángulo:", Area.calcular(base=4, altura=6, lados=3))  # 12
print("Área del trapecio:", Area.calcular(base_mayor=6, base_menor=4, altura=5))  # 25
print("Área del pentágono:", Area.calcular(base=5, apotema=3.5, lados=5))  # 43.75

