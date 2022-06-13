
public class Gerente extends Funcionario{

	private double gratificacao;

	@Override
	public String listarFuncionario() {
		return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Salario Base: " + getSalarioBase() + ", Salario Final: " + getSalarioFinal() + ", Valor Bonificacao: " + getValorBonificacao() + ", Gratificacao: " + gratificacao;
	}

	@Override
	public void calcularSalarioFinal(double bonificacao) {
		gratificacao = bonificacao;
		calcularBonificacao();
		double bon = getValorBonificacao();
		setSalarioFinal(gratificacao + getSalarioBase() + bon);
	}
	
	@Override
	public String apresentarSalario() {
		return "Nome: " + getNome() + ", Salario Base: " + getSalarioBase() + ", Bonificacao: " + getValorBonificacao() + ", Gratificacao: " + gratificacao + ", Salario Final: " + (gratificacao + getSalarioBase() + getValorBonificacao());
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	
}
