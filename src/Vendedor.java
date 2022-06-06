
public class Vendedor extends Funcionario{
	
	private double valorComissao;

	@Override
	public void listarFuncionario() {
		System.out.println("Nome: " + getNome() + ", CPF: " + getCpf() + ", Salario Base: " + getSalarioBase() + ", Salario Final: " + getSalarioFinal() + ", Valor Bonificacao: " + getValorBonificacao() + ", Valor Comissao: " + valorComissao);
	}

	@Override
	public void calcularSalarioFinal(double bonificacao) {
		valorComissao = bonificacao;
		setSalarioFinal(valorComissao + getSalarioBase() + getValorBonificacao());
	}

	@Override
	public String apresentarSalario() {
		return "Nome: " + getNome() + ", Salario Base: " + getSalarioBase() + ", Bonificacao: " + getValorBonificacao() + ", Valor Comissao: " + valorComissao + ", Salario Final: " + getSalarioFinal();
	}

	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	
	
}
