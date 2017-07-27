
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
        System.out.println("");
        System.out.println("Registrar resultados de grupo A");
        torneo.registrarResultadoEncuentro("grupoA", 0, 2, 1);
        torneo.registrarResultadoEncuentro("grupoA", 1, 1, 1);
        torneo.registrarResultadoEncuentro("grupoA", 2, 3, 4);
        torneo.registrarResultadoEncuentro("grupoA", 3, 1, 2);
        torneo.registrarResultadoEncuentro("grupoA", 4, 3, 1);
        torneo.registrarResultadoEncuentro("grupoA", 5, 0, 2);
        torneo.mostrarCalendario("grupoA");
        
        System.out.println("Registrar resultados de grupo B");
        torneo.registrarResultadoEncuentro("grupoB", 0, 1, 1);
        torneo.registrarResultadoEncuentro("grupoB", 1, 3, 2);
        torneo.registrarResultadoEncuentro("grupoB", 2, 2, 4);
        torneo.registrarResultadoEncuentro("grupoB", 3, 0, 2);
        torneo.registrarResultadoEncuentro("grupoB", 4, 4, 3);
        torneo.registrarResultadoEncuentro("grupoB", 5, 1, 2);
        torneo.mostrarCalendario("grupoB");
        System.out.println("");
        torneo.imprimirGrupos();
        
        System.out.println("Ganadores de los grupos ");
        torneo.imprimirGanadoresGrupos();
        
        torneo.definirFaseFinal();
        System.out.println("");
        System.out.println("Partidos Fase final ");
        torneo.mostrarFasefinal();
        torneo.asignarEquiposFinales();
        
        System.out.println("");
        System.out.println("Partidos Fase final ");
        torneo.mostrarFasefinal();
        
        
        System.out.println("");
        System.out.println("Registrar Partidos Fase final ");
        torneo.asignarResultadoFaseFinal("Semifinal N° 1", 3, 2);
        torneo.asignarResultadoFaseFinal("Semifinal N° 2", 1, 2);
        torneo.asignarSiguienteFase();
        torneo.mostrarFasefinal();
        
        System.out.println("");
        System.out.println("Registrar Partidos Fase final ");
        torneo.asignarResultadoFaseFinal("Final", 4, 5);        
        torneo.asignarSiguienteFase();
        torneo.mostrarFasefinal();
        
    }

   
   
}
