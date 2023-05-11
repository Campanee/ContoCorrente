
public class Main {
	public static void main(String[] args) throws InterruptedException {
		ContoCorrente conto = new ContoCorrente(100,"Davide");
		Cliente mamma = new Cliente(conto, true);
		Cliente papa = new Cliente(conto, true);
		Cliente figlio = new Cliente(conto, false);
		
		Thread th1 = new Thread(mamma);
		Thread th2 = new Thread(papa);
		Thread th3 = new Thread(figlio);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
		
	}
}