import java.util.Scanner;

public class TaxaProduto {

	public static void main(String[] args) {
		int perC;
		double val, tax, temp, res;
		
		perC = 100;
		
		
		Scanner sc =  new Scanner(System.in);
		 System.out.print("Escreva o valor que será pago no produto sem a taxa: ");
		 val = sc.nextDouble();
		 System.out.println("Escreva de forma decimal o percentual de taxa pelo atraso: ");
		 tax = sc.nextDouble();
		 System.out.println("Escreva o tempo de atraso da prestação em dias: ");
		 temp = sc.nextDouble();
		
		
		 res = val + (val * tax / perC) * temp;
		
		
		System.out.println("O valor da prestação com a taxa de atraso é: " + res);
		


	}

}