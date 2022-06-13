import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Escolhas escs = new Escolhas();
		Scanner ler = new Scanner(System.in);
		int escolha;
		int escolha2;
		
		escs.escolha1();
		escolha = ler.nextInt();
		
		switch(escolha) {
		case 1:
			Gerente g1 = new Gerente();
			
			
			do {
				ler = new Scanner(System.in);
				escs.escolha2();
				escolha2 = ler.nextInt();
				
				switch(escolha2) {
				case 1:
					System.out.println("Digite o nome: ");
					String nome = ler.next();
					
					System.out.println("Digite o cpf: ");
					String cpf = ler.next();
					
					System.out.println("Digite o salario base: ");
					double salarioBase = ler.nextDouble();
					
					g1.cadastrarFuncionario(nome, cpf, salarioBase);
					
					break;
					
				case 2:
					System.out.println("Digite a bonificacao: ");
					double bonificacao = ler.nextDouble();

					g1.setValorBonificacao(bonificacao);
					g1.calcularSalarioFinal(bonificacao);
					
					break;
					
				case 3:
					g1.calcularBonificacao();
					break;
				
				case 4:
					System.out.println(g1.apresentarSalario());
					break;
				}
				
			} while(escolha2 != 0);
			break;
			
		case 2:
			Vendedor v1 = new Vendedor();

			
			do {
				ler = new Scanner(System.in);
				escs.escolha2();
				escolha2 = ler.nextInt();
				
				switch(escolha2) {
				case 1:
					System.out.println("Digite o nome: ");
					String nome = ler.next();
					
					System.out.println("Digite o cpf: ");
					String cpf = ler.next();
					
					System.out.println("Digite o salario base: ");
					double salarioBase = ler.nextDouble();
					
					v1.cadastrarFuncionario(nome, cpf, salarioBase);
					
					break;
					
				case 2:
					System.out.println("Digite a bonificacao: ");
					ler = new Scanner(System.in);
					double bonificacao = ler.nextDouble();
					ler = new Scanner(System.in);
					v1.setValorBonificacao(bonificacao);
					v1.calcularSalarioFinal(bonificacao);
					
					break;
					
				case 3:
					v1.calcularBonificacao();
					break;
				
				case 4:
					System.out.println(v1.apresentarSalario());
					break;
				}
				
			} while(escolha2 != 0);
			break;
			
		case 3:
			Atendente a1 = new Atendente();

			
			do {
				ler = new Scanner(System.in);
				escs.escolha2();
				escolha2 = ler.nextInt();
				
				switch(escolha2) {
				case 1:
					System.out.println("Digite o nome: ");
					String nome = ler.next();
					
					System.out.println("Digite o cpf: ");
					String cpf = ler.next();
					
					System.out.println("Digite o salario base: ");
					double salarioBase = ler.nextDouble();
					
					a1.cadastrarFuncionario(nome, cpf, salarioBase);
					
					break;
					
				case 2:
					System.out.println("Digite a bonificacao: ");
					ler = new Scanner(System.in);
					double bonificacao = ler.nextDouble();
					ler = new Scanner(System.in);
					a1.setValorBonificacao(bonificacao);
					a1.calcularSalarioFinal(bonificacao);
					
					break;
					
				case 3:
					a1.calcularBonificacao();
					break;
				
				case 4:
					System.out.println(a1.apresentarSalario());
					break;
				}
				
			} while(escolha2 != 0);
			break;
		
			default:
				break;
		}
	}	
}
