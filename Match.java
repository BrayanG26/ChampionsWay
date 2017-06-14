
/**
 * Write a description of class Match here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Match
{
    // instance variables - replace the example below with your own
   
    private String Participante1;
    private String Participante2;
    private String Fecha;
    private int numEncuentro;
    private int ScoreParticiante1;    
    private int ScoreParticiante2;
    
    
    

    /**
     * Constructor for objects of class Match
     */
    public Match(int enc, String P1 , String P2, String Fecha)
    {
       numEncuentro = enc;
       Participante1 = P1;
       Participante2 = P2;
       this.Fecha = Fecha;
    }

    /**
     * Asigna resultado del encuentro 
     * 
     * @param  y   a sample parameter for a method     
     */
    public void asignarResultado(int r1 , int r2)
    {
        ScoreParticiante1 = r1;
        ScoreParticiante2 = r2;
    }
    
    /**
     * Muestra toda informacion  de un encuentro especifico
     *
     * @return     String con toda la informacion.
     */
    public String mostrarEncuentro()
    {
        String info = "Encuentro: " + numEncuentro + " \n " + 
        Participante1 + " " + ScoreParticiante1 + " - "  + ScoreParticiante1 + " " + Participante1 +
        "\n Fecha: " + Fecha;
        return info;
    }
}
