import java.util.Set;

public class Produto {

	//private String nome;
	private String nome;
	private float valor;
	private int quant;
	private int codigo;
	
	
	public Produto(String nome, float valor, int quant) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quant = quant;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

	
	
}
