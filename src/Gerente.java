
public class Gerente extends Funcionario{

	private double gratificacao;

	@Override
	public void listarFuncionario() {
		System.out.println("Nome: " + getNome() + ", CPF: " + getCpf() + ", Salario Base: " + getSalarioBase() + ", Salario Final: " + getSalarioFinal() + ", Valor Bonificacao: " + getValorBonificacao() + ", Gratificacao: " + gratificacao);
	}

	@Override
	public void calcularSalarioFinal(double bonificacao) {
		gratificacao = bonificacao;
		setSalarioFinal(gratificacao + getSalarioBase() + getValorBonificacao());
	}
	
	@Override
	public String apresentarSalario() {
		return "Nome: " + getNome() + ", Salario Base: " + getSalarioBase() + ", Bonificacao: " + getValorBonificacao() + ", Gratificacao: " + gratificacao + ", Salario Final: " + getSalarioFinal();
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	
}
