package Ejemplo_Hola_Mundo;

/**
 * Clase de ejemplo que genera un mensaje de saludo.
 */
public class HolaMundo {
    private String mensaje;

    /**
     * Constructor que inicializa el mensaje a "Hola, Mundo!".
     */
    public HolaMundo() {
        this.mensaje = "Hola, Mundo!";
    }

    /**
     * Constructor que permite definir un mensaje personalizado.
     * @param mensaje El mensaje de saludo.
     * @throws Exception si el mensaje es nulo.
     */
    public HolaMundo(String mensaje) throws Exception {
        if (mensaje == null) {
            throw new Exception("El mensaje no puede ser nulo");
        }
        this.mensaje = mensaje;
    }

    /**
     * Método para obtener el mensaje actual.
     * @return El mensaje de saludo.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Método para establecer un mensaje de saludo nuevo.
     * @param mensaje El mensaje de saludo nuevo.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

