
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
    
    /**
     * @return   nombre del participante
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * @return   nombre de la carrera a la que pertenece el participante
     */
    public String getCarrera()
    {
        return carrera;
    }
    
    /**
     * @return   numero que identifica al participante
     */
    public int getNumero()
    {
        return numero;
    }

    /**
     * Cambia el nombre del participante
     * @param nombre Nombre del participante
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Cambia la carrera a la que pertenece el participante
     * @param carrera carrera del participante
     */
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    /**
     * Cambia el numero con el que compite el participante
     * @param numero numero del participante
     */
     public void setNumero(int numero){
        this.numero = numero;
     }
   
}
