package Fibonacci;

import java.util.Scanner;

public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n, x = 0;
		int y = 1;
		int z;
		System.out.println("¿Cuantos numeros desea generar?");
		n = leer.nextInt();
		for (int i = 1; i<= n; i++) {
		z= x;
		x=y+x;
		y=z;
		System.out.println(y);
}
}
}
