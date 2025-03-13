package practica4;

public class practica3_1 {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int elementos;

    public practica3_1(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.elementos = 0;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("La cola está llena, no se puede agregar más elementos.");
        } else {
            fin = (fin + 1) % n; 
            arreglo[fin] = e;
            elementos++;
        }
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("La cola está vacía, no se puede remover elementos.");
            return -1;
        } else {
            long elemento = arreglo[inicio];
            inicio = (inicio + 1) % n; 
            elementos--;
            return elemento;
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return arreglo[inicio];
    }

    public boolean isEmpty() {
        return elementos == 0;
    }

    public boolean isFull() {
        return elementos == n;
    }

    public int size() {
        return elementos;
    }

    public static void main(String[] args) {
        practica3_1 cola = new practica3_1(5);
        cola.insert(10);
        cola.insert(20);
        System.out.println("Elemento en el frente: " + cola.peek());  // Debería mostrar 10
        System.out.println("Elemento removido: " + cola.remove());  // Debería mostrar 10
        System.out.println("Tamaño actual de la cola: " + cola.size());  // Debería mostrar 1
    }
}

