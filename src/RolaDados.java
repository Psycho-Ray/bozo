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
		return "";
	}

}