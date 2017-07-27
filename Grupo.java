import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator;
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
    private String primerPuesto;
    private String segundoPuesto;
    private ArrayList<Equipo> equipos;
    private ArrayList<Match> posibleEncuentros;
    private Fixture calendarioGrupo;
    private Random rndG;
    

    /**
     * Constructor for objects of class Grupo
     */
    public Grupo(String nombre)
    {    
        this.nombre = nombre;
        equipos = new ArrayList<Equipo>();
        posibleEncuentros = new ArrayList<Match>();
        calendarioGrupo = new Fixture();
        rndG = new Random();
    }
    
    /**
     * Obtiene los equipos inscritos en el torneo
     */
    public void asignarEquipos(Equipo eq)
    {
        equipos.add(eq);
    }
    
    public String infoGrupo()
    {
        String info = nombre + "\n" ;
        for(Equipo eq: equipos)
        {
            info+= " " + eq.getIDEquipo() +" "+ eq.getNombreEquipo() +" "+ eq.getVEDP() + "\n";
        }
        
        return info;
    }

   /**
     * Muestra los equipos de un grupo
     */
    public ArrayList<Equipo> getEquipos()
    {
        return equipos;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public ArrayList<Match> getPosiblesEncuentros()
    {
        String[] p = {"P1vsP2", "P1vsP3" , "P2vsP3", "P1vsP4", "P2vsP4", "P3vsP4", "P1vsP5", "P2vsP5" , "P3vsP5", "P1vsP5", "P6vsP1" , "P6vsP2", "P6vsP3", "P6vsP4", "P6vsP5" };
        Match temp; 
        int cont = 1;
        for(String item : p)
        {
            String[] parts = item.split("vs");
            temp = new Match(parts[0] , parts[1]); 
            temp.asignarID(cont);
            temp.asignarGrupo(getNombre());
            posibleEncuentros.add(temp);
            cont++;
        }     
        
        return posibleEncuentros;
    }
   
    
    public void crearCalendarioGrupo()
    {
        int cont;
        int aleatorio;
        getPosiblesEncuentros();
        if(getEquipos().size() == 4)
        {   
            cont = 6;
            for (int i = 0; i < 6; i++)
            {
                aleatorio = rndG.nextInt(cont);
                calendarioGrupo.crearEncuentros(posibleEncuentros.get(aleatorio));
                posibleEncuentros.remove(aleatorio);
                cont--; 
            }
        }else if (getEquipos().size() == 5)
        {
            cont = 10;
            for (int i = 0; i < 10; i++)
            {
                
                aleatorio = rndG.nextInt(cont);
                calendarioGrupo.crearEncuentros(posibleEncuentros.get(aleatorio));
                posibleEncuentros.remove(aleatorio);
                cont--; 
            }
            
        }else if (getEquipos().size() == 6)
        {
            cont = 15;
            for (int i = 0; i < 15; i++)
            {
                
                aleatorio = rndG.nextInt(cont);
                calendarioGrupo.crearEncuentros(posibleEncuentros.get(aleatorio));
                posibleEncuentros.remove(aleatorio);
                cont--; 
            }
        }
        
        System.out.println(calendarioGrupo.infoEncuentros());
    }
    
    public void definirGanadoresGrupo()
    {
        Comparator<Equipo> comparator = new Comparator<Equipo>() {
            @Override
        	public int compare(Equipo p1, Equipo p2) {
        		return new Integer(p2.getPuntos()).compareTo(new Integer(p1.getPuntos()));
        	}
        };        
        
        Collections.sort(equipos, comparator);
        primerPuesto = equipos.get(0).getNombreEquipo();
        segundoPuesto = equipos.get(1).getNombreEquipo();
    }
    
    public void imprimirCalendario()
    {
        System.out.println(calendarioGrupo.infoEncuentros());
    }
    
    public Fixture getCalendarioGrupo()
    {
        return calendarioGrupo;
    }
    
    
   public String getSegundoPuesto()
   {
       return segundoPuesto;
   }
   
   public String getPrimerPuesto()
   {
       return primerPuesto;
   }
   
   
}
