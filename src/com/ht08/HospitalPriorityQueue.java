package com.ht08;
import java.util.PriorityQueue;
import java.util.Vector;

public class HospitalPriorityQueue {
    private final PriorityQueue<Paciente> paciente;

    /**
     * Crea un Hospital Priority Queue
     * @param vector
     */
    public HospitalPriorityQueue(Vector<Paciente> vector) {
        this.paciente = new PriorityQueue<>();
        this.paciente.addAll(vector);
    }

    /**
     * Obtener el siguiente paciente
     * @return Paciente
     */
    public Paciente siguientePaciente() {
        return this.paciente.remove();
    }
}