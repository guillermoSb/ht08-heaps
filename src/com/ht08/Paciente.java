package com.ht08;

public class Paciente implements Comparable<Paciente>{
    private String nombre, situacion, prioridad;

    public Paciente(String nombre, String situacion, String prioridad) {
        setNombre(nombre);
        setSituacion(situacion);
        setPrioridad(prioridad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSituacion() {
        return situacion;
    }

    public String getPrioridad() {
        return prioridad;
    }

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
