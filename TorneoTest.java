

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

/**
 * The test class TorneoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TorneoTest
{
    private Torneo t;
    
    /**
     * Default constructor for test class TorneoTest
     */
    public TorneoTest()
    {
        t = new Torneo();
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Prueba que al crear un equipo este esta vacio y usa el nombre asignado de creacion.
     */
    @Test
    public void testCrearEquipo()
    {
        t.crearEquipo("Seleccion Sistemas");
        assertEquals("Seleccion Sistemas", t.buscarEquipo(0).getNombreEquipo());
        assertEquals(0, t.buscarEquipo(0).getMiembros().size());
    }
    
    /**
     * Prueba que al crear un torneo ya hay dos equipos por defecto.
     */
    @Test
    public void testCrearGrupos()
    {
        Grupo g1 = new Grupo("GrupoC");
        Grupo g2 = new Grupo("GrupoD");
        Grupo g3 = new Grupo("GrupoE");
        t.crearGrupos(g1);
        t.crearGrupos(g2);
        t.crearGrupos(g3);
        
        assertEquals(5, t.getGrupos().size());
    }
    
    
    /**
     * Prueba que genere numeros randomicos entre 0 y el tamaño de los grupos.
     */
    @Test
    public void testGruposRandom()
    {
        t.crearEquipo("Seleccion Sistemas");
        t.crearEquipo("Seleccion Civil");
        t.crearEquipo("Seleccion Medicina");
        t.crearEquipo("Seleccion Derecho");
       
        t.gruposRandom(t.getEquipos(), t.getGrupos());
        assertEquals(2, t.getGrupos().get(0).getEquipos().size());
    }
    
    
}
