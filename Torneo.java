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
         grupoA = new Grupo("grupo A");
         grupoB = new Grupo("grupo B");
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
     * Buscar un equipo participante del torneo por nombre;
     */
    public Equipo buscarEquipo(int num)
    {
       return equipos.get(num);
    }
    
    /**
     * Devuelve el array de equipos del torneo;
     */
    public ArrayList<Equipo> getEquipos()
    {
       return equipos;
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
     * Imprime los grupos del torneo actualmente inscritos
     */
    public void imprimirGrupos()
    {
        for(Grupo gp : grupos )
        {
            System.out.println("Nombre grupo: "+ gp.getNombre());
        }
    }
    
    /**
     * Devuelve el array de grupos del torneo;
     */
    public ArrayList<Grupo> getGrupos()
    {
       return grupos;
    }
    
    /**
     *  Asigna los equipos entre los grupos disponibles del torneo
     */
    public void gruposRandom(ArrayList<Equipo> equipos , ArrayList<Grupo> grupos)
    {
        for(Equipo eq: equipos)
        {
            int temp = rnd.nextInt(grupos.size());
            System.out.println(temp);
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
   public void asignarFixture(ArrayList<Grupo> grupos)
   {
       Equipo temp = null;
       Equipo temp2 = null;
       int rand;
       int cont = 0;
       int equiposSorteados = 1;
       fixture = new Fixture();
       
       for (Grupo gp: grupos)
       {
            rand = rnd.nextInt(gp.getEquipos().size());
            
            while(!(equiposSorteados == gp.getEquipos().size()))
            {
                if(gp.getEquipos().get(rand).getdisponibilidad() && equiposSorteados%2 == 1)
                {
                    temp = gp.getEquipos().get(rand);
                    gp.getEquipos().get(rand).disponibilidad(false);
                }
                
                if(gp.getEquipos().get(rand).getdisponibilidad() && equiposSorteados%2 == 0)
                {
                    temp2 = gp.getEquipos().get(rand);
                    gp.getEquipos().get(rand).disponibilidad(false);
                }
            }
            
           if(!(temp.equals(null)&& temp2.equals(null)))
           {
               cont++;
               fixture.CrearEncuentros(cont, temp.getNombreEquipo() , temp2.getNombreEquipo());
           }
            
       }
       
   }
   
   /**
     * Asigna el nombre al torneo
     *      
     */
   public void setNombre(){}
}
