public class JavaOutput {

    public static void main(String[]args) {

        // Para imprimir texto puede usar println(). Tenga en cuenta que el texto debe estar entre comillas, sino se producirá un error.
        System.out.println("Hola mundo!");

        // Además de println(), existe la función print(), la cual muestra un mensaje en pantalla sin un salto de linea al final.
        System.out.print("Mensaje de salida. ");
        System.out.println("Continuación del mensaje de salida");

        // Puede usar println() para imprimir números, la única diferencia es que no le debe poner comillas dobles.
        System.out.println(7);

        // También se puede realizar cálculos matemáticos dentro del método print().
        System.out.println(3 * 5);
        
    }

}