package com.ht08;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorHeapTest {
    @Test
    public void testHeapAdd() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        heap.add(-1);
        heap.add(0);
        heap.add(1);
        heap.add(43);
        heap.add(3);
        heap.add(2);
        heap.add(-3);
        heap.add(65);
        heap.add(58);
        heap.add(40);
        heap.add(42);
        heap.add(4);
        assertEquals(heap.getFirst(), -3);  // Verificar que -3 es el valor menor
    }
    @Test
    public void testHeapRemove() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        heap.add(-1);
        heap.add(0);
        heap.add(1);
        heap.add(43);
        heap.add(3);
        heap.add(2);
        heap.add(-3);
        heap.add(65);
        heap.add(58);
        heap.add(40);
        heap.add(42);
        heap.add(4);
        System.out.println(heap);
        heap.remove();
        System.out.println(heap);
        assertEquals(heap.getFirst(), -1);  // -1 debe ser el siguiente valorh

    }
}
