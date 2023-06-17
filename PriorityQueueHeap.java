public class PriorityQueueHeap<T extends Comparable<T>> {
    private Heap<Elemento<T>> heap;

    public PriorityQueueHeap(){
         heap = new Heap<>();
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public void enqueue(T x, int p) {
       Elemento<T> objeto = new Elemento<>(x, p);
        heap.insertar(objeto);
    }

    public T dequeue() {
        Elemento<T> objeto = heap.eliminar();
        return objeto.getElemento();
    }

    public T front() {
        Elemento<T> objeto = heap.peek();
        return objeto.getElemento();
    }

    public T back() {
       throw new UnsupportedOperationException("NO esta implementado");
    }
    public static class Elemento<T> implements Comparable<Elemento<T>> {
        private T x;
        private int p;

        public Elemento(T x, int p) {
            this.x = x;
            this.p = p;
        }
        public int compareTo(Elemento<T> other) {
            return Integer.compare(p, other.getPrioridad());
        }
        public int getPrioridad() {
            return p;
        }
        public T getElemento() {
            return x;
        }

    }

   
}
