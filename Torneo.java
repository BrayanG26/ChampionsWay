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
    private Grupo grupo;
    private ArrayList<Grupo> grupos;
    private ArrayList<Equipo> equipos;
    private ArrayList<Participante> participantes;   
    private Equipo eqp;
    private Random rnd;

    /**
     * Constructor for objects of class Torneo
     */
    public Torneo()
    {
         equipos = new ArrayList<Equipo>();
         grupos = new ArrayList<Grupo>();
         participantes = new ArrayList<Participante>();
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
     * Añade elementos tipo grupo a la lista de Grupos
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
     * Crea participantes o jugadores
     * @param nombre Nombre del participante
     * @param carrera Carrera que cursa el participante
     * @param numero Numero en la dorsal del participante
     */
    public void crearParticipante(String nombre, String carrera, int numero){
        participantes.add(new Participante(nombre, carrera, numero));
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
