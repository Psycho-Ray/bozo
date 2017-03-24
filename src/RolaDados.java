public class RolaDados {
	Dado dices;
	int n_dices;
	int[] vals;

	public RolaDados(int n) {
		this.n_dices = n;
		this.dices = new Dado();
	}

	public int[] rolar() {
		// Creates a new array to store the dices
		this.vals = new int[this.n_dices];

		// Rola os dados
		for (int i = 0; i < this.n_dices; i++) 
			this.vals[i] = this.dices.rolar();
		
		return this.vals;
	}

	public int[] rolar(boolean[] quais) {	
		for (int i = 0; i < this.n_dices; i++) {
			if (quais[i]) {
				this.vals[i] = this.dices.rolar();
			}
		}
		return vals;
	}

/*	public int[] rolar(String s) {

	}

	public String toString() {
		return "";
	}
*/	
}