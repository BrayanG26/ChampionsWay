
/**
 * Write a description of class Demo2_16equipos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demo2_16equipos
{
     private Torneo torneo;
    

    /**
     * Constructor for objects of class Demo2_16equipos
     */
    public Demo2_16equipos()
    {
        torneo = new Torneo();
        
        System.out.println("Agrega 8 equipos");
        System.out.println("");
        torneo.crearEquipo("sistemas");
        torneo.crearEquipo("civil");
        torneo.crearEquipo("medicina");
        torneo.crearEquipo("matematicas");
        torneo.crearEquipo("petroleos");
        torneo.crearEquipo("quimica");
        torneo.crearEquipo("industrial");
        torneo.crearEquipo("fisica");
        torneo.crearEquipo("enfermeria");
        torneo.crearEquipo("nutricion y dietetica");
        torneo.crearEquipo("trabajo social");
        torneo.crearEquipo("mecanica");
        torneo.crearEquipo("diseño industrial");
        torneo.crearEquipo("derecho");
        torneo.crearEquipo("microbiologia");
        torneo.crearEquipo("metalurgica");
        
        System.out.println("");
        System.out.println("Imprimir equipos inscritos");
        System.out.println("");
        torneo.imprimirEquipos();
        Grupo grupoc = new Grupo("Grupo C");
        Grupo grupod = new Grupo("Grupo D");
        torneo.crearGrupos(grupoc);
        torneo.crearGrupos(grupod);
        System.out.println("");
        torneo.imprimirGrupos();
        System.out.println("Asigna los equipos a los grupos");
        System.out.println("");        
        torneo.gruposRandom(torneo.getEquipos(),torneo.getGrupos());
        System.out.println("");        
        torneo.imprimirGrupos();
        System.out.println("Asigna el calendario de encuentros del torneo");
        torneo.asignarFixture(torneo.getGrupos());
    }

    
}
