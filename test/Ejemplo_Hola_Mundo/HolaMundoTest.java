package Ejemplo_Hola_Mundo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba para la clase HolaMundo.
 */
public class HolaMundoTest {

    /**
     * Prueba para verificar el mensaje por defecto del constructor sin parámetros.
     */
    @Test
    public void testConstructorDefault() {
        HolaMundo holaMundo = new HolaMundo();
        
        // Verificamos que el mensaje por defecto sea "Hola, Mundo!"
        assertEquals("Hola, Mundo!", holaMundo.getMensaje());
    }

    /**
     * Prueba para verificar el constructor con un mensaje personalizado.
     */
    @Test
    public void testConstructorWithCustomMessage() {
        final String customMessage = "Hola, OpenAI!";
        
        try {
            HolaMundo holaMundo = new HolaMundo(customMessage);

            // Verificamos que el mensaje se haya establecido correctamente.
            assertEquals(customMessage, holaMundo.getMensaje());
            
        } catch (Exception e) {
            // Si hay una excepción, el test falla.
            fail("El constructor no debe lanzar una excepción cuando el mensaje es válido.");
        }
    }

    /**
     * Prueba para verificar que el constructor lanza una excepción cuando el mensaje es nulo.
     */
    @Test
    public void testConstructorWithNullMessage() {
        try {
            new HolaMundo(null);
            fail("El constructor debe lanzar una excepción cuando el mensaje es nulo.");
        } catch (Exception e) {
            // Verificamos que el mensaje de la excepción sea el correcto.
            assertEquals("El mensaje no puede ser nulo", e.getMessage());
        }
    }

    /**
     * Prueba para verificar que el método setMensaje establece el mensaje correctamente.
     */
    @Test
    public void testSetMensaje() {
        HolaMundo holaMundo = new HolaMundo();
        final String nuevoMensaje = "Hola, JUnit!";
        
        // Cambiamos el mensaje usando setMensaje
        holaMundo.setMensaje(nuevoMensaje);
        
        // Verificamos que el mensaje se haya actualizado.
        assertEquals(nuevoMensaje, holaMundo.getMensaje());
    }
}
