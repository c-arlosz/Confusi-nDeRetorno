
public class Calculadora {
    int acumulador;

    public int sumar(int a, int b) {
        int resultado = a + b;
        acumulador += resultado;
        // ¿Qué error de compilación ocurre aquí?
        // missing return statement
    }
}

 // ¿Por qué el compilador de Java se rehusará compilar el método `sumar`?
 // Porque la firma del metodo sumar esta declarado para un retorno int
 // entonces al no retornar nada solo actualiza  el resultado



 // ¿Cómo se corrige?
 // Una opcion es colocar el (return resultado;)
 // otra seria cambiar la firma colocar void donde va el int.