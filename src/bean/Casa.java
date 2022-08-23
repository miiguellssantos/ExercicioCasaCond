package bean;

public class Casa {
	// atributos 
	private int numero;
	private String nomeprop;
	private int Numerocond;
	
	// construtor
	public Casa(int numero, String nomeprop, int numerocond) {
		super();
		this.numero = numero;
		this.nomeprop = nomeprop;
		Numerocond = numerocond;
	}

	// métodos
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeprop() {
		return nomeprop;
	}

	public void setNomeprop(String nomeprop) {
		this.nomeprop = nomeprop;
	}

	public int getNumerocond() {
		return Numerocond;
	}

	public void setNumerocond(int numerocond) {
		Numerocond = numerocond;
	}

	@Override
	public String toString() {
		return "Casa [numero=" + numero + ", nomeprop=" + nomeprop + ", Numerocond=" + Numerocond + "]";
	}
}
