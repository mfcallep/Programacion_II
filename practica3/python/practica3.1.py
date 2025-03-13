class Cola:
    def __init__(self, n):
        self.n = n 
        self.arreglo = [0] * n  
        self.inicio = 0  
        self.fin = -1  
        self.elementos = 0  

    def insert(self, e):
        if self.isFull():
            print("La cola está llena, no se puede agregar más elementos.")
        else:
            self.fin = (self.fin + 1) % self.n  
            self.arreglo[self.fin] = e
            self.elementos += 1

    def remove(self):
        if self.isEmpty():
            print("La cola está vacía, no se puede remover elementos.")
            return None
        else:
            elemento = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n  
            self.elementos -= 1
            return elemento

    def peek(self):
        if self.isEmpty():
            print("La cola está vacía.")
            return None
        return self.arreglo[self.inicio]

    def isEmpty(self):
        return self.elementos == 0

    def isFull(self):
        return self.elementos == self.n

    def size(self):
        return self.elementos

# Prueba de la Cola
cola = Cola(5)
cola.insert(10)
cola.insert(20)
print("Elemento en el frente:", cola.peek())  
print("Elemento removido:", cola.remove())  
print("Tamaño actual de la cola:", cola.size())  
