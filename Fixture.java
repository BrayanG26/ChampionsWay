import java.util.ArrayList;
/**
 * Es la clase encargada de crear los grupos y generar un fixture en base a ellos.
 * 
 * @author JoCh 
 * @version 2017
 */
public class Fixture
{
    private ArrayList<Match> calendario;
    private Match encuentro;

    /**
     * Constructor for objects of class Fixture
     */
    public Fixture()
    {
       calendario = new ArrayList<Match>();
    }
    
    
    /**
     * Crea los encuentros aleatoriamente
     */
    public void crearEncuentros(Match encuentro)
    {
        calendario.add(encuentro);
    }
    
     /**
     * Crea los encuentros aleatoriamente
     */
    public String infoEncuentros()
    {
        String info = "Calendario \n";
        for(Match mt: calendario)
        {
            info+= " " + mt.mostrarEncuentro() + "\n";
        }
        return info;
    }
    
    public ArrayList<Match> getCalendario()
    {
        return calendario;
    }
        
}
