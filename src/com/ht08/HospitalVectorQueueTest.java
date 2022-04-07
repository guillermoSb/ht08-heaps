package com.ht08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalVectorQueueTest {
    @Test
    public void testHospitalQueue() {
        Paciente pa = new Paciente("Guillermo", "Dolor de Cabeza", "E");
        Paciente pb = new Paciente("Mariel", "Brazo Roto", "B");
        Paciente pc = new Paciente("Mafer", "Apendicitis", "A");
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(pc);
        heap.add(pb);
        heap.add(pa);
        HospitalVectorQueue hospitalVectorQueue = new HospitalVectorQueue(heap);
        int count = 0;
        while (count < 3) {
            String nombreExpected = "";
            if (count == 0 ) {
                nombreExpected = "Mafer";
            } else if (count ==1) {
                nombreExpected = "Mariel";
            } else  {
                nombreExpected = "Guillermo";
            }
            Paciente atendiendo = hospitalVectorQueue.siguientePaciente();
            System.out.println(atendiendo);
            assertEquals(atendiendo.getNombre(), nombreExpected);
            count ++;
        }
    }

}
