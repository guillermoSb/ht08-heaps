package com.ht08;

/**
 *  Simulación de Paciente que ingresa a emergencias
 *  @author Guillermo Santos
 *  @author Mariel Guamuche
 */
public class Paciente implements Comparable<Paciente>{
    private String nombre, situacion, prioridad; // datos del paciente

    /**
     * Constructor
     * @param nombre: String del nombre del paciente
     * @param situacion: String de síntomas
     * @param prioridad: String de tipo de prioridad
     */
    public Paciente(String nombre, String situacion, String prioridad) {
        setNombre(nombre);
        setSituacion(situacion);
        setPrioridad(prioridad);
    }

    /**
     * Colocación del nombre del paciente
     * @param nombre: String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Colocación de la prioridad del paciente
     * @param prioridad: String
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Colocación del síntoma o situación del paciente
     * @param situacion: String
     */
    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    /**
     * Obtención del nombre paciente
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtención de la situación
     * @return String
     */
    public String getSituacion() {
        return situacion;
    }

    /**
     * Obtención de la prioridad
     * @return String
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Realiza la comparación entre prioridad de pacientes, permite realización del VectorHeap
     * @param o
     * @return
     */
    @Override
    public int compareTo(Paciente o) {
        return getPrioridad().compareTo(o.getPrioridad());
    }

    @Override
    public String toString() {
        return  nombre  +
                ", "+ situacion +
                ", " + prioridad;
    }
}
