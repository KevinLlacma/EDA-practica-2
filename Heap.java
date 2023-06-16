import java.util.ArrayList;
//TAD heap generico
class Heap<T extends Comparable<T>>{
    private ArrayList<T> heap;

    public Heap(){
        heap = new ArrayList<>();    
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }
    //insercion y eliminacion
    public void insertar(T item) {
        heap.add(item);
        amontonarArriba(heap.size() - 1);
    }

    public T eliminar() {
        if (isEmpty()) {
            throw new IllegalStateException("Ya esta vacio el heap");
        }

        T root = heap.get(0);
        int last = heap.size() - 1;
        heap.set(0, heap.get(last));
        heap.remove(last);
        amontonarAbajo(0);

        return root;
    }
    public void amontonarArriba(int i) {
        
    }

    public void amontonarAbajo(int i) {
       
    }


}