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
    private boolean sorteo;
    private Participante pante;
    private ArrayList<Participante> miembros;
    

    /**
     * Constructor for objects of class Equipo
     * @param nombre Nombre del equipo
     */
    public Equipo(String nombre)
    {    
        this.nombreEquipo = nombre;
        miembros = new ArrayList<Participante>();
        sorteo = true;
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
     * @param nombre Nombre del participante
     * @param carrera Nombre de la carrera a la que pertenece el participante
     * @param numero Numero que identifica al participante
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
     * @param p Participante creado
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
    
    /**
     * Retorna el nombre del equipo
     * @return El nombre del equipo
     */
    public String getNombreEquipo()
    {
        return nombreEquipo;
    }
    
    /**
     * Define la disponibilidad del equipo para enfrentarse a los demas
     * @param valor Disponibilidad del equipo
     */
    public void disponibilidad(boolean valor)
    {
        sorteo = valor;
    }
    
    /**
     * Obtiene la disponibilidad del equipo para enfrentarse a los demas
     * @return Disponibilidad del equipo
     */
    public boolean getdisponibilidad()
    {
        return sorteo;
    }
}
