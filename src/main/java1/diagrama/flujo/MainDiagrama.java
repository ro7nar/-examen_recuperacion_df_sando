package diagrama.flujo;

import java.util.Scanner;

public class MainDiagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salir;
		int opcion;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("#################################\r\n" + "Programa de Figuras, seleccione opción:\r\n"
					+ "1. Imagen triangulo\r\n" + "2. SALIR\r\n" + "#################################\"\r\n");
			salir = teclado.nextInt();

			if (salir == 1) {

				do {
					System.out.println("Ingrese las Dimensiones del triangulo");

					opcion = teclado.nextInt();
					if (opcion >= 1) {

						for (int i = 0; i <= opcion; i++) {
							for (int a = 0; a < i; a++) {
								System.out.print("*");
							}
							System.out.println();
						}

					} else {
						System.out.println("Ingrese una dimension que sea igual o mayor a uno");
					}

				} while (opcion >= 1);

			} else if (salir == 2) {

			} else {
				System.out.println("Ingrese una opcion valida");
			}

		} while (salir != 2);

	}

}
