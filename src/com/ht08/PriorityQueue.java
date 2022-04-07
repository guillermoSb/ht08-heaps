package com.ht08;

/**
 * Interfaz del priority queue
 * @param <E>
 * @author Guillermo Santos
 * @author Mariel Guamuche
 */
public interface PriorityQueue<E extends Comparable<E>> {

    /**
     * Obtener el primer elemento de la fila
     * @return
     */
    public E getFirst();

    /**
     * Eliminar un elemento de la fila
     * @return
     */
    public E remove();

    /**
     * Agregar un elemento a la fila
     */
    public void add(E value);

    /**
     * Indicar si la fila está vacía
     * @return
     */
    public boolean isEmpty();

    /**
     * Obtener el tamaño de la fila
     * @return
     */
    public int size();

    /**
     * Resetear la fila
     */
    public void clear();
}
