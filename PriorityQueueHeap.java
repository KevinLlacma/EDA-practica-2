public class PriorityQueueHeap<T extends Comparable<T>> {
    private Heap<Elemento<T>> heap;

    public PriorityQueueHeap(){

    }
    public void enqueue() {
       
    }

    public T dequeue() {
        
    }

    public T front() {
        
    }

    public T back() {
       
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

    }

   
}
