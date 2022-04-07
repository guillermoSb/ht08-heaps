package com.ht08;
import java.util.PriorityQueue;
import java.util.Vector;

/**
 * Similución de hospital usando Java Collection Framework PriorityQueue
 * @author Guillermo Santos
 * @author Mariel Guamuche
 */
public class HospitalPriorityQueue {
    private final PriorityQueue<Paciente> paciente;

    /**
     * Crea un Hospital de tipo Priority Queue
     * @param vector
     */
    public HospitalPriorityQueue(Vector<Paciente> vector) {
        this.paciente = new PriorityQueue<>(); // inicialización del queue
        this.paciente.addAll(vector); // agrega los datos y los coloca con prioridad
    }

    /**
     * Obtener el siguiente paciente según prioridad
     * @return Paciente
     */
    public Paciente siguientePaciente() {
        return this.paciente.remove();
    }
}