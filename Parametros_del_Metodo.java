public class Parametros_del_Metodo{
	
	public static void main(String[] args) {
		checkAge(20); // llama al metodo checkAge y le da el parametro
	}
	
	static void checkAge(int age) {
		// Si la eda es menor a 18, imprimira "acceso denegado" si no lo contrario
		if (age < 18) {
		  System.out.println("Access denied - You are not old enough!");
		} else {
		  System.out.println("Access granted - You are old enough!");
		}
	}
}