package TrabalhoII;
import java.io.Serializable;

public abstract class Imovel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	abstract public String toString();

	abstract public String getCor();

	abstract public void setCor(String cor);

	abstract public Integer getQtdComodos();

	abstract public void setQtdComodos(Integer comodos);

	abstract public String getEndereco();

	abstract public void setEndereco(String endereco);
}
