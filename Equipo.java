import java.util.ArrayList;
/**
 * Write a description of class Equipo here.
 * 
 * @author JoCh     
 * @version 2017
 */
public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombreEquipo;
    private Participante pante;
    private ArrayList<Participante> miembros;
    

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombre)
    {    
        this.nombreEquipo = nombre;
        miembros = new ArrayList<Participante>();
    }
    
    /**
     * lee la informacion de los participantes de un equipo 
     * @param nombre Es el nombre del equipo 
     */    
    public void cambiarNombre(String nombre)
    {
        this.nombreEquipo = nombre; 
        
    }
    
     /**
     * Registrar los participantes individualmente
     */
    public void crearParticipante(String nombre , String carrera , int numero)
    {
        pante = new Participante(nombre , carrera , numero);
        guardarParticipantes(pante);
    }
    
    
    /**
     * lee la informacion de los participantes de un equipo 
     */
    public void leerArchivo(){}

    /**
     * Guarda la informacion de los participantes en una coleccion
     */
    public void guardarParticipantes(Participante p)
    {        
        miembros.add(p);
    }
    
    /**
     * Imprime los miembros del torneo actualmente inscritos
     */
    public void imprimirParticipantes()
    {
        for(Participante p : miembros )
        {
            System.out.println("Nombre participante: "+p.getNombre() + "\n Carrera: " + p.getCarrera());
        }
    }
    
    public String getNombreEquipo()
    {
        return nombreEquipo;
    }
}
