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
    private String IDequipo;
    private Participante pante;
    private ArrayList<Participante> miembros;
    private int puntos;
    private int[] VED;
    

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombre)
    {    
        this.nombreEquipo = nombre;
        miembros = new ArrayList<Participante>();        
        VED = new int[3];
        puntos = 0;
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
    
    public String getIDEquipo()
    {
        return IDequipo;
    }
    
    public void asignarIDEquipo(String id)
    {
        IDequipo = id;
    }
    
    public ArrayList<Participante> getMiembros()
    {
        return miembros;
    }
    
    public String getVEDP()
    {
        String info = "";
        info += "Victorias "+ VED[0] + " Empates "+ VED[1] +" Derrotas "+ VED[2] + " Puntos " + puntos ; 
        return info;
    }
    
    public void sumarVictoria()
    {
        VED[0] = VED[0] + 1;
        calcularPuntos();
    }
    
    public void sumarEmpate()
    {
        VED[1] = VED[1] + 1;
        calcularPuntos();
    }
    
    public void sumarderrota()
    {
        VED[2] = VED[2] + 1;
        calcularPuntos();
    }
    
   /**
     * calcula los puntos de un equipo 
     */
    public void calcularPuntos()
   {
       puntos = VED[0] *3 + VED[1];
   }
   
   public int getPuntos()
   {
       return puntos;
   }
}
