import java.util.Scanner;
public class Altura {

	public static void main(String[] args) {

			int i=1;
			double joao, pedro;
			joao = 134;
			pedro= 145;
			
			while (joao <= pedro) {
				joao = (joao + 2.5);
				pedro = (pedro + 2.0);
				i++;
			
			}
			System.out.println("Foram necessários " + i +" para João ser maior");
	}

}
