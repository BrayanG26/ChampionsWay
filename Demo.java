
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
        
        System.out.println("Agrega 4 equipos");
        System.out.println("");
        torneo.crearEquipo("sistemas");
        torneo.crearEquipo("civil");
        torneo.crearEquipo("medicina");
        torneo.crearEquipo("matematicas");
        System.out.println("");
        System.out.println("Agrega 5 participantes al equipo 1");
        System.out.println("");
        torneo.buscarEquipo(0).crearParticipante("pte1" , "Sistemas" , 2 );
        torneo.buscarEquipo(0).crearParticipante("pte2" , "civil" , 22 );
        torneo.buscarEquipo(0).crearParticipante("pte3" , "matematicas" , 12 );
        torneo.buscarEquipo(0).crearParticipante("pte4" , "quimica" , 34 );
        torneo.buscarEquipo(0).crearParticipante("pte5" , "derecho" , 10 );
        System.out.println("");
        System.out.println("Asigna los equipos a los grupos");
        System.out.println("");
        torneo.gruposRandom(torneo.getEquipos(),torneo.getGrupos());
        System.out.println("");
        System.out.println("Asigna el calendario de encuentros del torneo");
        System.out.println("");
        
    }

   
   
}
