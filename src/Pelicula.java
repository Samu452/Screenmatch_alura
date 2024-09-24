public class Pelicula {

    String nombre;

    int fechaDeLanzamiento;

    int durancionEnMinutos;

    boolean incluidoEnElPlan;

    double sumasDeLasEvaluaciones;

    int totalDeLasEvaluaciones;

    void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + durancionEnMinutos);
    }

    void evalua(double nota) {
        sumasDeLasEvaluaciones = sumasDeLasEvaluaciones + nota;
        // sumaDeLasEvaluaciones +=
        totalDeLasEvaluaciones++;
    }

    double calculaMedia() {
        return sumasDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}

