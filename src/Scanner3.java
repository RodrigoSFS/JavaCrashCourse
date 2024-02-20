import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual e o seu nome: ");
		String name = sc.nextLine();
		System.out.println("Ola " + name);
		System.out.println("Qual e a sua idade: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Essa e a sua idade " + age);
		System.out.println("Qual e a sua comida favorita");
		String food = sc.nextLine();
		
		System.out.println("Voce gosta dessa comida: " + food);
	}

}
