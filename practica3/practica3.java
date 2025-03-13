package practica4;

public class practica3 {
    private long[] arreglo;
    private int top;
    private int n;

    public practica3(int n) {
        this.n = n;
        this.arreglo = new long[n];  // Crear un arreglo de tamaño n
        this.top = -1;  // Indica la posición del último elemento
    }

    public void push(long e) {
        if (isFull()) {
            System.out.println("La pila está llena, no se puede agregar más elementos.");
        } else {
            top++;
            arreglo[top] = e;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no se puede sacar elementos.");
            return -1;
        } else {
            return arreglo[top--];
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1;
        }
        return arreglo[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    public static void main(String[] args) {
        practica3 pila = new practica3(5);
        pila.push(10);
        pila.push(20);
        System.out.println("Elemento en la cima: " + pila.peek());  // Debería mostrar 20
        System.out.println("Elemento sacado: " + pila.pop());  // Debería mostrar 20
        System.out.println("¿La pila está vacía? " + pila.isEmpty());  // Debería mostrar false
    }
}
