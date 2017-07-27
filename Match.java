
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
    private String ganador;
    private String perdedor;
    private int idEncuentro;
    private int scoreParticiante1;    
    private int scoreParticiante2;
    
    
    

    /**
     * Constructor for objects of class Match
     */
    public Match( String P1 , String P2)
    {
       
       participante1 = P1;
       participante2 = P2;
       
    }
    
    /**
     * actualizar los participante de un Match
     */
    public void actualizarMatch( String P1 , String P2)
    {
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
     * Asigna id a un encuentro 
     * 
     * @param  y   a sample parameter for a method     
     */
    public void asignarID(int id)
    {
        idEncuentro = id;
    }
    
      /**
     * Asigna grupo a un encuentro 
     * 
     * @param  y   a sample parameter for a method     
     */
    public void asignarGrupo(String grupo)
    {
        this.grupo = grupo;
    }
    
    public void calcularResultado()
    {
        if(scoreParticiante1 > scoreParticiante2)
        {
            ganador = participante1;
            perdedor = participante2; 
        }else if(scoreParticiante1 < scoreParticiante2)
        {
           ganador = participante2;
           perdedor = participante1; 
        }else 
        {
            ganador = "Empate";
            perdedor = "Empate";
        }
        
       
    }
    
    /**
     * Muestra toda informacion  de un encuentro especifico
     *
     * @return     String con toda la informacion.
     */
    public String mostrarEncuentro()
    {
        String info = "Encuentro: " + idEncuentro + " del grupo " + grupo +"\n " + 
        participante1 + " " + scoreParticiante1 + " - "  + scoreParticiante2 + " " + participante2 +
        "\n Fecha: " + fecha;
        return info;
    }
    
    public String mostrarEncuentrosFinales()
    {
        String info = " " + participante1 + " " + scoreParticiante1 + " - "  + scoreParticiante2 + " " + participante2 +
        "\n Fecha: " + fecha;
        return info;
    }
    
    public String getParticipante1()
    {
        return participante1;
    }
    
    public String getParticipante2()
    {
        return participante2;
    }
    
    public String getGanador()
    {
        return ganador;
    }
    
    public String getPerdedor()
    {
        return perdedor;
    }
}
