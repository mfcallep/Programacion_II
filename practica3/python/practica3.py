class Pila:
    def __init__(self, n):
        self.n = n 
        self.arreglo = [0] * n 
        self.top = -1 

    def push(self, e):
        if self.isFull():
            print("La pila está llena, no se puede agregar más elementos.")
        else:
            self.top += 1
            self.arreglo[self.top] = e

    def pop(self):
        if self.isEmpty():
            print("La pila está vacía, no se puede sacar elementos.")
            return None
        else:
            elemento = self.arreglo[self.top]
            self.top -= 1
            return elemento

    def peek(self):
        if self.isEmpty():
            print("La pila está vacía.")
            return None
        return self.arreglo[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1

# Prueba de la Pila
pila = Pila(5)
pila.push(10)
pila.push(20)
print("Elemento en la cima:", pila.peek())   
print("Elemento sacado:", pila.pop())  
print("La pila está vacía?", pila.isEmpty()) 
