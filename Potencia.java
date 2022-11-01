import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1, base, expo, res = 1;
		System.out.println("Digite o valor da base:");
		base = in.nextInt();
		System.out.println("Digite o valor do expoente");
		expo = in.nextInt();
		while(expo>0) {
			res= base*base;
			expo--;
		}
		System.out.println("A potencia é de: "+res);
	}
}
