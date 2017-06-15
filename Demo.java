
/**
 * Write a description of class Demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demo
{
   private Torneo torneo;
    
    public Demo()
    {
        torneo = new Torneo();
        
        System.out.println("");
        System.out.println("### -- ### --- ###");
        System.out.printf("PERMUTACION");
        Fixture fix = new Fixture();
        fix.crearEncuentros();
        System.out.println("");
        System.out.println("### -- ### --- ###");
        
        System.out.println("Agrega 4 equipos");
        System.out.println("");
        torneo.crearEquipo("sistemas");
        torneo.crearEquipo("civil");
        torneo.crearEquipo("medicina");
        torneo.crearEquipo("matematicas");
        System.out.println("");
        System.out.println("Imprimir equipos inscritos");
        System.out.println("");
        torneo.imprimirEquipos();        
        System.out.println("Agrega 5 participantes al equipo 1");
        System.out.println("");
        torneo.buscarEquipo(0).crearParticipante("pte1" , "Sistemas" , 2 );
        torneo.buscarEquipo(0).crearParticipante("pte2" , "Sistemas" , 22 );
        torneo.buscarEquipo(0).crearParticipante("pte3" , "Sistemas" , 12 );
        torneo.buscarEquipo(0).crearParticipante("pte4" , "Sistemas" , 34 );
        torneo.buscarEquipo(0).crearParticipante("pte5" , "Sistemas" , 10 );
        System.out.println("");
        System.out.println("Imprimir participantes inscritos en el equipo 1");
        torneo.buscarEquipo(0).imprimirParticipantes();
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
