
import java.util.*;
public class P01 {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		int a ,b; 
		System.out.println("Ingrese Valor a: ");
		a=teclado.nextInt();
		System.out.println("Ingrese Valor b : ");
		b=teclado.nextInt();
		
		if(a>b)
		{
			System.out.println("a es mayor");
		}
		else
			System.out.println("b es mayor");
		
		
	}

}
