public class JavaArrays {
	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]);

		// Cambiar elemento
		cars[0] = "Opel";
		System.out.println(cars[0]);

		// Tamaño del arreglo
		System.out.println(cars.length);

		// Recorremos el array con un bucle for, for-each
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		for (String i : cars) {
			System.out.println(i);
		}

		// Arrelgos multidimensionales
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		System.out.println(myNumbers[1][2]);
	}
}
