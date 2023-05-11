
public class Cliente implements Runnable{
	ContoCorrente conto;
	boolean genitore;
	double importo;
	
	public Cliente(ContoCorrente conto, boolean genitore) {
		this.genitore=genitore;
		this.conto=conto;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			if(genitore) {
				synchronized(conto) {
					importo = Math.floor(Math.random() * 100);
					conto.versa(importo);
					System.out.println("Ho versato " + importo + " €, adesso il saldo ammonta a " + conto.getSaldo() + " (genitore)");
				}
			}else {
				synchronized(conto) {
					conto.preleva(50);
					System.out.println("(figlio) Prelevo 50€");
					System.out.println("Il saldo ammonta a " + conto.getSaldo());
				}
				
			}
		}
	}

}
