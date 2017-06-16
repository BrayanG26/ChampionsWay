import java.util.ArrayList;

/**
 * Es la clase encargada de crear los grupos y generar un fixture en base a ellos.
 * 
 * @author JoCh 
 * @version 2017
 */
public class Fixture {
    private ArrayList<Match> calendario;
    private Match encuentro;

    /**
     * Constructor for objects of class Fixture
     */
    public Fixture() {
        calendario = new ArrayList<Match>();
    }

    /**
     * Crea los encuentros aleatoriamente
     */
    public void CrearEncuentros(int i, String P1, String P2) {
        encuentro = new Match(i, P1, P2);
        calendario.add(encuentro);
    }

    /**
    * Crea los encuentros aleatoriamente
    */
    public String infoEncuentros() {
        String info = "Calendario \n";
        for (Match mt : calendario) {
            info += " " + mt.mostrarEncuentro() + "\n";
        }
        return info;
    }

    /**
     * Parametriza la informacion para pasarla al metodo permutar
     */
    public void crearEncuentros() {
        String[] elementos = "1,2,3,4,5,6,7,8".split(",");
        int n = 2;
        int r = elementos.length;
        permutar(elementos, "", n, r);
    }

    /**
     * Permutacion sin repeticion para obtener todos los posibles encuentros entre los diferentes equipos
     * @param elementos Vector con los elementos o equipos inscritos
     * @param act Cadena separadora
     * @param n Numero de elementos escogidos (2 por encuentro)
     * @param r Numero de elementos disponibles
     */
    private void permutar(String[] elementos, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        }else{
            for(int i=0;i<r;i++){
                if(!act.contains(elementos[i])){
                    permutar(elementos, act+elementos[i]+",", n-1, r);
                }
            }
        }
    }

}
