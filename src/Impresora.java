public class Impresora {
    public void imprimirTicket(String texto) {
        System.out.println("Imprimiendo: " + texto);
        return texto; // ¿Qué error ocurre en esta línea?
        // unexpected return value
    }
}
// Explica la incompatibilidad entre la firma del método y la instrucción return.
// Porque la palabra reservada void indica que el metodo no debe retornar nada
// entonces al querer retornar texto marca el error

// ¿Cómo se corrige?
// Simplemente quitando el return de el metodo.