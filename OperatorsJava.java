public class OperatorsJava {
    public static void main(String[] args) {
        
        //Operadores Aritmeticos
        int a = 5, b = 10, result = 0;
        result = a+b; //Suma
        System.out.println(result);
    
        result = a-b; //Sustraccion
        System.out.println(result);

        result = a*b; //Multiplicacion
        System.out.println(result);

        result = a/b; //Division
        System.out.println(result);

        result = a%b; //Modulo (residuo)
        System.out.println(result);

        //Operadores de Comparacion
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);

        //Operadores Logicos
        System.out.println(a == b && a > b);
        System.out.println(a > b || a < b);
        System.out.println(!(a >= b));
    
    }
}
