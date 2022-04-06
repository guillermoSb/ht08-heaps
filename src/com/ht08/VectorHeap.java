package com.ht08;

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    private Vector<E> data;
    public VectorHeap(){
        data = new Vector<>();
    }
    public VectorHeap(Vector<E> v) {
        int i;
        data = new Vector<E>(v.size());
        for (i = 0; i < v.size(); i++) {
            add(v.get(i));
        }
    }


    protected static int parent(int i) {return (i-1)/2;}

    protected static int left(int i) {
        return (2*i)+1;
    }

    protected static int right(int i) {
        return 2*(i+1);
    }

    protected void perlocateUp(int leaf) {
        int parent = parent(leaf);  // Obtener el parent
        E value = data.get(leaf);   // Obtener el valor de la leaf
        // Mientrar el valor de la hoja sea menor al parent
        while(leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            // ubicar la leaf en el parent
            data.set(leaf, data.get(parent));   // Asignar el valor del parent a la hoja
            leaf = parent;  // Nuevo valor de la leaf
            parent = parent(leaf);  // Nuevo valor del parent
        }
        data.set(leaf, value);
    }

    protected void pushDownRoot(int root) {
        E value = data.get(root);
        int heapSize = data.size();
        while (root < heapSize) {
            int childPos = left(root);
            if (childPos < heapSize) {
                // Verificar si el hijo izquierdo es menor que el valor derecho
                if (right(root) < heapSize && (data.get(childPos + 1).compareTo(data.get(childPos)) < 0)) {
                    childPos ++;    // El valor derecho es el menor
                }
                // Verificar que el menor es menor al root
                if (data.get(childPos).compareTo(value) < 0) {
                    // arreglar para la siguiente iteración
                    data.set(root, data.get(childPos));
                    root = childPos;
                } else {
                    // Esta en la ubicacion correcta
                    data.set(root, value);
                    return;
                }
            } else {
                // El root ya es una hoja
                data.set(root, value);
                return;
            }
        }
    }

    @Override
    public E getFirst() {
        if (data.size() == 0) return null;
        return data.get(0);
    }

    @Override
    public E remove() {
        if (data.size() == 0) return null;
        E value = data.get(0);
        data.set(0, data.get(data.size() -1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) pushDownRoot(0);
        return value;
    }

    @Override
    public void add(E value) {
        data.add(value);
        perlocateUp(data.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data = new Vector<>();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (E value :
                data) {
            buffer.append(value.toString());
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}
