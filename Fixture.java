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
    public void CrearEncuentros(int i , String P1, String P2 , String Fecha)
    {
        encuentro = new Match(i ,P1,P2 ,Fecha);
        calendario.add(encuentro);
    }
        
}
