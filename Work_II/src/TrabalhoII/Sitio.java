package TrabalhoII;
import java.io.Serializable;

public class Sitio extends Imovel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cor;
	private Integer qtdComodos;
	private String endereco;

	public Sitio(String cor, Integer qtdComodos, String endereco) {
		super();
		this.cor = cor;
		this.qtdComodos = qtdComodos;
		this.endereco = endereco;
	}
	
	public Sitio() {}

	@Override
	public String toString() {
		String aux = "O sitio fica na(o) " + this.endereco + " a cor da casa é " + this.cor + " e tem " + this.qtdComodos + " cômodos.";
		return aux;
	}

	@Override
	public String getCor() {
		return this.cor;
	}

	@Override
	public void setCor(String cor) {
		this.cor = cor;
		
	}

	@Override
	public Integer getQtdComodos() {
		return this.qtdComodos;
	}

	@Override
	public void setQtdComodos(Integer comodos) {
		this.qtdComodos = comodos;
		
	}

	@Override
	public String getEndereco() {
		return this.endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
