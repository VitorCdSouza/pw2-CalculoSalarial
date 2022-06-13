
public class Atendente extends Funcionario {

	private double adicionalNoturno;

	@Override
	public String listarFuncionario() {
		return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Salario Base: " + getSalarioBase() + ", Salario Final: " + getSalarioFinal() + ", Valor Bonificacao: " + getValorBonificacao() + ", Adicional Noturno: " + adicionalNoturno;
	}

	@Override
	public void calcularSalarioFinal(double bonificacao) {
		adicionalNoturno = bonificacao;
		setSalarioFinal(adicionalNoturno + getSalarioBase() + getValorBonificacao());
	}

	@Override
	public String apresentarSalario() {
		return "Nome: " + getNome() + ", Salario Base: " + getSalarioBase() + ", Bonificacao: " + getValorBonificacao() + ", Adicional Noturno: " + adicionalNoturno + ", Salario Final: " + (adicionalNoturno + getSalarioBase() + getValorBonificacao());
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	
	
}
