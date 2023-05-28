public class TypeCastingJava {
    public static void main(String[] args) {

        // Widening Casting
        int intNum1 = 9;
        double doubleNum1 = intNum1; // Casteo Automatico

        System.out.println(intNum1); // 9
        System.out.println(doubleNum1); // 9.0

        // Narrowing Casting
        double doubleNum2 = 9.78d;
        int intNum2 = (int) doubleNum2; // Casteo Manual

        System.out.println(doubleNum1); //  9.78
        System.out.println(intNum2); //  9
    }
}
