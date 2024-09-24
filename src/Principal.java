public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.durancionEnMinutos = 109;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumasDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1988;
        otraPelicula.durancionEnMinutos = 180;


//        otraPelicula.muestraFichaTecnica();


    }
}
