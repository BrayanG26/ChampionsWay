import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.HashSet;
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
    private HashMap<String , Match > calendarioFaseFinal;
    private Grupo grupoA;
    private Grupo grupoB;
    private ArrayList<Grupo> grupos;
    private ArrayList<Equipo> equipos;
    private HashSet<String> ganadores ;
    private Equipo eqp;
    private Random rnd;

    /**
     * Constructor for objects of class Torneo
     */
    public Torneo()
    {
         equipos = new ArrayList<Equipo>();
         grupos = new ArrayList<Grupo>();
         grupoA = new Grupo("grupoA");
         grupoB = new Grupo("grupoB");
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
            System.out.println("Info grupo: "+ gp.infoGrupo());
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
        int contadorg1 = 0;
        int contadorg2 = 0;
        int contadorg3 = 0;
        int contadorg4 = 0;
        int temp = 0;
        int iter = 1;
        int tamañogrupos = equipos.size()/grupos.size();
        HashSet<Integer> moment = new HashSet<Integer>(); 
            
                for(Equipo eq: equipos)
                    {
                    temp = rnd.nextInt(grupos.size());            
                    while (!(moment.add(temp)))
                    {
                        temp = rnd.nextInt(grupos.size()); 
                    }
                    System.out.println(temp);
                    
                    if(contadorg1 != tamañogrupos && temp==0)
                      {
                       grupos.get(temp).asignarEquipos(eq);
                       contadorg1++;
                       eq.asignarIDEquipo("P"+contadorg1);
                      }
                    
                    if(contadorg2 != tamañogrupos && temp==1)
                      {
                       grupos.get(temp).asignarEquipos(eq);
                       contadorg2++;
                       eq.asignarIDEquipo("P"+contadorg2);
                      }
                          
                    if(contadorg3 != tamañogrupos && temp==2)
                      {
                       grupos.get(temp).asignarEquipos(eq);
                       contadorg3++;
                       eq.asignarIDEquipo("P"+contadorg3);
                      }
                      
                    if(contadorg4 != tamañogrupos && temp==3)
                      {
                       grupos.get(temp).asignarEquipos(eq);
                       contadorg4++;
                       eq.asignarIDEquipo("P"+contadorg4);
                      }   
                                                  
                    
                    if(iter % grupos.size() == 0)
                    {
                        moment.clear();
                    }   
                    iter++;
                    }
                    
    }

    /**
     * Asigna el fixture al torneo
     *      
     */
   public void asignarFixture(ArrayList<Grupo> grupos)
   {
             
       for (Grupo gp: grupos)
       {
          gp.crearCalendarioGrupo();
       }
       
   }
   
   public void registrarResultadoEncuentro(String grupo, int encuentro, int P1 , int P2)
   {
       String ganador;
       for(Grupo gp: grupos)
       {
           if(gp.getNombre().equals(grupo))
           {
               gp.getCalendarioGrupo().getCalendario().get(encuentro).asignarResultado(P1, P2);
               gp.getCalendarioGrupo().getCalendario().get(encuentro).calcularResultado();
               asignarPuntos(gp ,gp.getCalendarioGrupo().getCalendario().get(encuentro) , gp.getCalendarioGrupo().getCalendario().get(encuentro).getGanador() , gp.getCalendarioGrupo().getCalendario().get(encuentro).getPerdedor());
               
           }
       }
   } 
   
   public void mostrarCalendario(String grupo)
   {
       for(Grupo gp: grupos)
       {
           if(gp.getNombre().equals(grupo))
           {
               gp.imprimirCalendario();               
           }
       }
   }
   
   /**
     * Asigna el nombre al torneo
     *      
     */
   public void setNombre(){}
   
   public void asignarPuntos(Grupo gp, Match mt,  String ganador , String perdedor)
   {
       
           if(ganador.equals(perdedor))
           {
               mt.getParticipante1();
               mt.getParticipante2();
               for(Equipo eq: gp.getEquipos())
               {
                   if(mt.getParticipante1().equals(eq.getIDEquipo()))
                   {
                       eq.sumarEmpate();
                   }
                   
                   if(mt.getParticipante2().equals(eq.getIDEquipo()))
                   {
                       eq.sumarEmpate();
                   }
               }
            }else 
            {
                for(Equipo eq: gp.getEquipos())
               {
                   if(ganador.equals(eq.getIDEquipo()))
                   {
                       eq.sumarVictoria();
                   }
                   
                   if(perdedor.equals(eq.getIDEquipo()))
                   {
                       eq.sumarderrota();
                   }
               }
            }
   }
   
   public void imprimirGanadoresGrupos()
   {
       for(Grupo gp : grupos)
       {
           gp.definirGanadoresGrupo();
           System.out.println( gp.getNombre() + " \n "+ "Primer puesto: " + gp.getPrimerPuesto() +" \n Segundo puesto: " +gp.getSegundoPuesto() );
       }
   }
   
   public void definirFaseFinal()
   {
       calendarioFaseFinal = new HashMap<String , Match >();
       Match enc;
       String faseMatch = "";
       for(int i = 0; i < 15; i++)
       {
           if(i<1)
           {
               faseMatch = "Final";
            } else if(i<3)
            {
                faseMatch = "Semifinal N° "+ i;
            } else if(i<7)
            {
                faseMatch = "Cuartos de final N° " + (i - 2);
            } else if(i<15)
            {
                faseMatch = "Octavos de final N° " + (i - 6);
            }
           enc = new Match("","");
           
           calendarioFaseFinal.put(faseMatch , enc);
       }
   }
   
   public void mostrarFasefinal()
   {
       Iterator it = calendarioFaseFinal.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Match m = (Match) e.getValue() ;
            String a = (String) e.getKey();
            if(grupos.size() == 2 && a.contains("Semifinal N°") || a.contains("Final"))
            {
                System.out.println(e.getKey() + " \n " + m.mostrarEncuentrosFinales() );
            }else if(grupos.size() == 4 && (a.contains("Semifinal N°") || a.contains("Final") || a.contains("Cuartos de final N°")))
            {
                System.out.println(e.getKey() + " \n " + m.mostrarEncuentrosFinales() );
            }
        }
   }
   
   public void asignarEquiposFinales()
   {
       String[] primer = new String[grupos.size()];
       String[] segundo = new String[grupos.size()];
       ganadores = new HashSet<String>();
       int cont = 0;
       for(Grupo gp: grupos)
       {
           primer[cont] = gp.getPrimerPuesto();
           segundo[cont] = gp.getSegundoPuesto(); 
           cont++;
       }
       
       if(grupos.size() == 2)
           {
               calendarioFaseFinal.get("Semifinal N° 1").actualizarMatch(primer[0], segundo[1]);
               calendarioFaseFinal.get("Semifinal N° 2").actualizarMatch(primer[1], segundo[0]);
            }else if(grupos.size() == 4)
            {
               calendarioFaseFinal.get("Cuartos de final N° 1").actualizarMatch(primer[0], segundo[3]);
               calendarioFaseFinal.get("Cuartos de final N° 2").actualizarMatch(primer[1], segundo[2]);
               calendarioFaseFinal.get("Cuartos de final N° 3").actualizarMatch(primer[2], segundo[1]);
               calendarioFaseFinal.get("Cuartos de final N° 4").actualizarMatch(primer[3], segundo[0]);
            }else if(grupos.size() == 8)
            {
               calendarioFaseFinal.get("Octavos de final N° 1").actualizarMatch(primer[0], segundo[7]);
               calendarioFaseFinal.get("Octavos de final N° 2").actualizarMatch(primer[1], segundo[6]);
               calendarioFaseFinal.get("Octavos de final N° 3").actualizarMatch(primer[2], segundo[5]);
               calendarioFaseFinal.get("Octavos de final N° 4").actualizarMatch(primer[3], segundo[4]);
               calendarioFaseFinal.get("Octavos de final N° 5").actualizarMatch(primer[4], segundo[3]);
               calendarioFaseFinal.get("Octavos de final N° 6").actualizarMatch(primer[5], segundo[2]);
               calendarioFaseFinal.get("Octavos de final N° 7").actualizarMatch(primer[6], segundo[1]);
               calendarioFaseFinal.get("Octavos de final N° 8").actualizarMatch(primer[7], segundo[0]);
            }
       
       
   }
   
   public void asignarResultadoFaseFinal(String partido , int P1 , int P2)
   {
       Iterator it = calendarioFaseFinal.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            String a = (String) e.getKey();
            if(a.equals(partido))
            {
                Match m = (Match) e.getValue() ;
                m.asignarResultado(P1,P2);
                m.calcularResultado();
                ganadores.add(m.getGanador());
            }else {
                //System.out.println("No se encontro el encuentro buscado");
            }
            
        }
   }
   
   public void asignarSiguienteFase()
   {
       int cont = 1 ;
       int nmb = 1;
       String prev = "";
       String fase;
       String x = "";
       
       fase = determinarFase( ganadores.size());
       
       for(String str: ganadores)
       {   if(ganadores.size() ==1)
           {
                for( Iterator it = ganadores.iterator(); it.hasNext();) { 
                
                // Notese que el orden del TreeSet refleja un orden descendente 
                // en sus elementos independientemente del orden de inserción.
                // Debido al uso de String's esto refleja un orden alfabético
                x = (String)it.next(); 
        
            }
               System.out.println("El campeon del torneo es el equipo: " + x + "\n FELICITACIONES");
            }
           if(cont % 2 == 1){
               prev = str;
            }else{
                if(fase.equals("Final")){
                    calendarioFaseFinal.get(fase).actualizarMatch(prev, str);
                }else{
                    calendarioFaseFinal.get(fase+nmb).actualizarMatch(prev, str);
                }
                prev = ""; 
                nmb++;
            }   
            cont++;
            
       }
       ganadores.clear();
   }
   
   public String determinarFase(int cantGanadores)
   {
       if(cantGanadores == 2)
       {
           return "Final";
       }else if(cantGanadores == 4)
       {
           return "Semifinal N° ";
       }else if(cantGanadores == 8)
       {
           return "Cuartos de final N°";
       }else 
       {
           return "Cantidas de ganadores no valida";
        }
   }
}
