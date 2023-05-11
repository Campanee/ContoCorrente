
public class ContoCorrente {
	  double saldo;
	  String nome;
	 
	public ContoCorrente(double saldo, String nome) {
		this.saldo=saldo;
		this.nome=nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "ContoCorrente [saldo=" + saldo + ", nome=" + nome + "]";
	}
	
	public void versa(double importo) {
		saldo+=importo;
	}
	public void preleva(double importo) {
		saldo-=importo;
	}
}

