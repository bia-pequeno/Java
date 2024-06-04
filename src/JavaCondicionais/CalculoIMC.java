package JavaCondicionais;
 
import java.util.Scanner;
 
public class CalculoIMC {
 
	public static void main(String[] args) {
		// IMC = peso / (altura * altura)
 
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o peso: ");
		float peso = valor.nextFloat();
		
		
		System.out.println("Insira a altura: ");
		float altura = valor.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println(" Magreza");
		} else if (imc >= 18.5 && imc <= 24.9){
			System.out.println(" Normal");
		} else if (imc >= 25 && imc <= 29.9){
			System.out.println(" Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9){
			System.out.println(" Obesidade");
		}
		System.out.println("Peso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc);
	}
 
}