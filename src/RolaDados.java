import java.util.Calendar;

public class RolaDados {
	private Dado[] dices;
	private int n_dices;
	private int[] vals;

	public RolaDados(int n) {
		this.n_dices = n;
		this.dices = new Dado[n];
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(100);                 // 1/10 second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			dices[i] = new Dado(); 
		}
	}

	public int[] rolar() {
		// Creates a new array to store the dices
		this.vals = new int[this.n_dices];

		// Rola os dados
		for (int i = 0; i < this.n_dices; i++) {
			this.vals[i] = this.dices[i].rolar();
		}
		
		return this.vals;
	}

	public int[] rolar(boolean[] quais) {	
		for (int i = 0; i < this.n_dices; i++) {
			if (quais[i]) {
				this.vals[i] = this.dices[i].rolar();
			}
		}
		return vals;
	}

	public int[] rolar(String s) {
		/*Split s by withe spaces. 
		Ex: "1 2 7" will be 1, 2, 7 */
		String[] parts = s.split(" ");
		boolean[] aux = new boolean[this.n_dices];
		int i, j;

		// Create a bool's vector with the numbers in s
		for (i = 0, j = 0; i < this.n_dices 
			&& j < parts.length; i++) {
			// If the i-th number is in parts, then it must be roled again
			if (i == Integer.parseInt(parts[j])) {
				aux[i] = true;
				j++;	
			}
			else {
				aux[i] = false;
			}
		}
		// Retorna os novos dados com os do conteudo de "S" rejogados
		return this.rolar(aux);
	}

	public String toString() {
		String[][] aux = new String[this.n_dices][];
		String ans = "";
		
		/*Makes the vals a string*/
		for (int i = 0; i < this.n_dices; i++) 
			ans += dices[i].getLado() + "\t\t";

		ans += "\n";

		/* Split the dice's drawings ans store them in aux*/
		for (int i = 0; i < this.n_dices; i++) 
			aux[i] = this.dices[i].toString().split("\n");

		/* Put the drawings back together */
		for (int i = 0; i < this.n_dices; i++) {
			for (int j = 0; j < aux[i].length; j++) {
				ans += aux[j][i] + "\t\t";
			}
			ans += "\n";
		}

		return ans;
	}

}