package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import funcionario.Fixado;
import funcionario.MenorAprendiz;
import funcionario.Tercerizado;
import funcionario.enums.TipoFuncionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Fixado> list = new ArrayList<>();
		
		System.out.println("Pagamento de Funcionário");
		System.out.println("-------------------------");
		System.out.print("Quantidade de funcionário: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Funciorario #" + (1+i) + " :" );
			System.out.print("Tipo do fincionario: ");
			TipoFuncionario tipo = TipoFuncionario.valueOf(sc.next());
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			Integer horas = sc.nextInt();
			
			System.out.print("Valor da hora trabalhada: ");
			Double valorHora = sc.nextDouble();
			if (tipo == TipoFuncionario.valueOf("tercerizado")) {
				System.out.print("Taxa adicional: ");
				double adcional = sc.nextDouble();
				Fixado t = new Tercerizado (nome, horas, valorHora, adcional);
				list.add(t);
			}else if (tipo == TipoFuncionario.valueOf("menoraprendiz")) {
				System.out.print("Desconto: ");
				double desconto = sc.nextDouble();
				Fixado m = new MenorAprendiz (nome, horas, valorHora, desconto);
				list.add(m);
			} else {
				Fixado f = new Fixado (nome, horas, valorHora);
				list.add(f);
			}
		}
		
		System.out.println();
		System.out.println("Lista De Pagamento");
		for(Fixado f : list) {
			System.out.println(f.getNome() +" $" + String.format("%.2f", f.salario()));
		}
		
		sc.close();
	}

}
