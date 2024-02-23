import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Empregado emp = new Empregado();
		
		System.out.print("Digite o Nome do funcionario: ");
		emp.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: "+ emp);
		System.out.println();
		System.out.print("Qual o percentual para aumentar o salario?");
		double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualizar dados: " + emp);
		sc.close();

    }
}
