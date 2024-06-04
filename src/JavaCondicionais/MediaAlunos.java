package JavaCondicionais;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		
		Scanner Valor = new Scanner (System.in);
		
		System.out.println("Exibindo a media "+ "\n" +"Insira sua nota: ");
		float num1 = Valor.nextInt();
		
		System.out.println("Insira sua nota: ");
		float num2 = Valor.nextInt();
		
		System.out.println("Insira sua nota: ");
		float num3 = Valor.nextInt();
		
		System.out.println("Insira sua nota: ");
		float num4 = Valor.nextInt();
		
		float media = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("Sua media final é: " + media);
		
		if (media >= 6) {
			System.out.println("Aprovado");
		}else if(media == 5){
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
	

}
