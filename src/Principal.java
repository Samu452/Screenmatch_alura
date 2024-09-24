import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDurancionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println("***********************");


        //       com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
        //      otraPelicula.nombre = "Matrix";
        //       otraPelicula.fechaDeLanzamiento = 1988;
        //       otraPelicula.durancionEnMinutos = 180;


//        otraPelicula.muestraFichaTecnica();


    }
}
