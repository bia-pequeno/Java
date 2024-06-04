package JavaCondicionais;
 
import java.util.Scanner;
 
public class DiaSemana {
 
	public static void main(String[] args) {
 
		Scanner valor = new Scanner(System.in);
 
		System.out.println("Insira o dia: ");
		int diaSemana = valor.nextInt();
 
		String nomeDia;
 
		switch (diaSemana) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda-feira";
			break;
		case 3:
			nomeDia = "Terça-feira";
			break;
		case 4:
			nomeDia = "Quarta-feira";
			break;
		case 5:
			nomeDia = "Quinta-feira";
			break;
		case 6:
			nomeDia = "Sexta-feira";
			break;
		case 7:
			nomeDia = "Sábado";
			break;
		default:
			nomeDia = "Dia inválido";
			break;
		}
 
		System.out.println("O dia da semana é: " + nomeDia);
 
	}
}
 