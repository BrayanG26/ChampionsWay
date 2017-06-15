
/**
 * Write a description of class Match here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Match
{
    // instance variables - replace the example below with your own
   
    private String participante1;
    private String participante2;
    private String fecha;
    private String grupo;
    private int numEncuentro;
    private int scoreParticiante1;    
    private int scoreParticiante2;
    
    
    

    /**
     * Constructor for objects of class Match
     */
    public Match(int enc, String P1 , String P2)
    {
       numEncuentro = enc;
       participante1 = P1;
       participante2 = P2;
       
    }

    /**
     * Asigna resultado del encuentro 
     * 
     * @param  y   a sample parameter for a method     
     */
    public void asignarResultado(int r1 , int r2)
    {
        scoreParticiante1 = r1;
        scoreParticiante2 = r2;
    }
    
    /**
     * Asigna fecha a un encuentro 
     * 
     * @param  y   a sample parameter for a method     
     */
    public void asignarFecha(String fecha)
    {
        this.fecha = fecha;
    }
    
    /**
     * Muestra toda informacion  de un encuentro especifico
     *
     * @return     String con toda la informacion.
     */
    public String mostrarEncuentro()
    {
        String info = "Encuentro: " + numEncuentro + " del grupo " + grupo +"\n " + 
        participante1 + " " + scoreParticiante1 + " - "  + scoreParticiante1 + " " + participante1 +
        "\n Fecha: " + fecha;
        return info;
    }
}
