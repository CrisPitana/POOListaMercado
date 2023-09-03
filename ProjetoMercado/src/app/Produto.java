package app;

public class Produto {
	
	private String nome;
	private double valorUnitario;
	private int qtde;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public int getQtde() {
		return qtde;
	}


	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	

	@Override
	public String toString() {
		return "\nPRODUTO : " + this.nome + 
				" CUSTO R$ "  + this.valorUnitario +
				" QTDE : "    + this.qtde + 
				" unidade(s)";
	}
	
	
	public double calcularTotal() {
		return this.qtde * this.valorUnitario;
	}

	

}
