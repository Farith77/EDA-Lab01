public class VariablesJava {
    public static void main(String[] args) {

        // Tipo de dato String
        String name = "Juan";
        System.out.println(name);

        // Tipo de dato int
        int num = 15;
        System.out.println(num);

        // Declaracion e inicialización por separado
        int num2;
        num2 = 20;
        System.out.println(num2);

        // Cambiamos el valor a la variable
        num2 = 80;
        System.out.println(num2);

        // Variables FINAL (constantes)
        final int num3 = 15;
        num3 = 20; // Esto generara un error, ya que no
                   // podemos cambiar el valor a una constante

        // Otros tipos de dato: float, char, boolean
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

    }
}
