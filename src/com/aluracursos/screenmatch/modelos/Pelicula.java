package com.aluracursos.screenmatch.modelos;

public class Pelicula {

    private String nombre;

    private int fechaDeLanzamiento;

    private int durancionEnMinutos;

    private boolean incluidoEnElPlan;

    private double sumasDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDurancionEnMinutos() {
        return durancionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDurancionEnMinutos(int durancionEnMinutos) {
        this.durancionEnMinutos = durancionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + durancionEnMinutos);
    }

    public void evalua(double nota) {
        sumasDeLasEvaluaciones = sumasDeLasEvaluaciones + nota;
        // sumaDeLasEvaluaciones +=
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia() {
        return sumasDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}

