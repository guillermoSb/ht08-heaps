package com.ht08;

public class HospitalVectorQueue {
    private VectorHeap<Paciente> vectorHeap;    // Priority Queue para almacenar pacientes

    /**
     * Crea un Hospital Queue
     * @param vectorHeap
     */
    public HospitalVectorQueue(VectorHeap<Paciente> vectorHeap) {
        this.vectorHeap = vectorHeap;
    }

    /**
     * Obtener el siguiente paciente
     * @return
     */
    public Paciente siguientePaciente() {
        return this.vectorHeap.remove();
    }

}
