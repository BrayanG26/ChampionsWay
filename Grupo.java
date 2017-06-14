import java.util.ArrayList;
/**
 * Esta clase es la encargada de asignar los equipos en un grupo
 * 
 * @author JoCh  
 * @version 2017
 */
public class Grupo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<Equipo> equipos;
    

    /**
     * Constructor for objects of class Grupo
     */
    public Grupo()
    {    // initialise instance variables        
    }
    
    /**
     * Obtiene los equipos inscritos en el torneo
     */
    public void asignarEquipos(Equipo eq)
    {
        equipos.add(eq);
    }

   /**
     * Muestra los equipos de un grupo
     */
    public void consultarEquipos()
    {
        
    }
   
}
