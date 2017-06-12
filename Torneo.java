import java.util.ArrayList;
import java.util.Random;
/**
 * Gestion lo relacionado a cada torneo en especifico.
 * 
 * @author JoCh 
 * @version 2017
 */
public class Torneo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Fixture fixture;
    private Grupo grupoA;
    private Grupo grupoB;
    private ArrayList<Grupo> grupos;
    private ArrayList<Equipo> equipos;    
    private Equipo eqp;
    private Random rnd;

    /**
     * Constructor for objects of class Torneo
     */
    public Torneo()
    {
         equipos = new ArrayList<Equipo>();
         grupos = new ArrayList<Grupo>();
         grupoA = new Grupo();
         grupoB = new Grupo();
         crearGrupos(grupoA);
         crearGrupos(grupoB);
         rnd = new Random();
    }
      
    
    /**
     * Crea un equipo participante del torneo
     */
    public void crearEquipo(String nombre)
    {
        eqp = new Equipo(nombre);
        equipos.add(eqp);
    }
    
    /**
     * Imprime los equipos del torneo actualmente inscritos
     */
    public void imprimirEquipos()
    {
        for(Equipo eq : equipos )
        {
            System.out.println("Nombre equipo: "+ eq.getNombreEquipo());
        }
    }
    
    /**
     * Crea los grupos de acuerdo a la cantidad de participantes aleatoriamente
     */
    public void crearGrupos(Grupo g)
    {
        grupos.add(g);
    }
    
    /**
     *  Asigna los equipos entre los grupos disponibles del torneo
     */
    public void gruposRandom(ArrayList<Equipo> equipos , ArrayList<Grupo> grupos)
    {
        for(Equipo eq: equipos)
        {
            int temp = rnd.nextInt(grupos.size());
            
            switch (temp) 
            {
                case 0: 
                    grupos.get(temp).asignarEquipos(eq);
                    break;
                case 1 :
                    grupos.get(temp).asignarEquipos(eq);
                    break;      
                
            }
        }
    }

    /**
     * Asigna el fixture al torneo
     *      
     */
   public void asignarFixture(){}
   
   /**
     * Asigna el nombre al torneo
     *      
     */
   public void setNombre(){}
}