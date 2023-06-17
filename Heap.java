//Ejercicio 5 
//Kevin Llacma EDA A

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
    public void amontonarArriba(int ind) {
        int indice = (ind - 1) / 2;

        while (ind > 0 && heap.get(ind).compareTo(heap.get(indice)) > 0) {
            intercambiar(ind, indice);
            ind = indice;
            indice = (ind - 1) / 2;
        }
    }

    public void amontonarAbajo(int ind) {
       int indice = getIndice(ind);

        while (indice != -1 && heap.get(ind).compareTo(heap.get(indice)) < 0) {
            intercambiar(ind, indice);
            ind = indice;
            indice = getIndice(ind);
        }
    }
    private void intercambiar(int ind, int j) {
        T var = heap.get(ind);
        heap.set(ind, heap.get(j));
        heap.set(j, var);
    }
    private int getIndice(int ind) {
        int izq = 2 * ind + 1;
        int der = 2 * ind + 2;

        if (izq >= heap.size()) {
            return -1; 
        } else if (der >= heap.size()) {
            return izq; 
        } else {
           
            if (heap.get(izq).compareTo(heap.get(izq)) > 0) {
                return izq;
            } else {
                return der;
            }
        }
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("ESTA VACIO");
        }

        return heap.get(0);
    }

}