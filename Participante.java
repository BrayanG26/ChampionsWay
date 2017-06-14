
/**
 * Contiene la informacion de una participantes.
 * 
 * @author JoCh
 * @version 2017
 */
public class Participante
{
    private String nombre;
    private String carrera;
    private int numero;

    /**
     * Constructor for objects of class Participante
     */
    public Participante(String nombre , String carrera , int numero)
    {  
        this.nombre = nombre;
        this.carrera = carrera;
        this.numero = numero;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getCarrera()
    {
        return carrera;
    }
    
    public int getNumero()
    {
        return numero;
    }

   
}
