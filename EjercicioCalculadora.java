import java.util.Scanner;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe tu primer valor: ");
		float a= in.nextInt();
		System.out.println("Escribe tu segundo valor: ");
		float b= in.nextInt();
		float c=a+b;
		float d=a-b;
		float e=a*b;
		float f=a/b;
		System.out.println("El resultado de tu suma es: "+c);
		System.out.println("El resultado de tu resta es: "+d);
		System.out.println("El resultado de tu multiplicación es: "+e);
		System.out.println("El resultado de tu división es: "+f);
	}
}