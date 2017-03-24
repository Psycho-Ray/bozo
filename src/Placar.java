public class Placar {
	int scoreBoard[10];
	
	//Just a test. Delet this on sight.
	
	/*Inicia com o placar zerado*/
	public Placar() {
		for (int i=0; i<10; i++)
			scoreBoard[i] = 0;
	}

	/*Adiciona a pontuação correspondente ao placar, mas não checa se o movimento é honesto*/
	public void add(int posicao, int[] dados) {
		if (scoreBoard[posicao - 1] == 0) {
			if (posicao <= 6) scoreBoard[posicao - 1] = posicao * dados.lenght;
			else if (posicao == 7) scoreBoard[6] = 15;
			else if (posicao == 8) scoreBoard[7] = 20;
			else if (posicao == 9) scoreBoard[8] = 30;
			else if (posicao == 10) scoreBoard[9] = 40;
		}
	}

	/*Retorna a soma dos pontos no placar*/
	public int getScore() {
		int sum = 0;
		for (int i=0; i<10; i++) sum += scoreBoard[i];
		return sum;
	}

	@Override
	public String toString() {
		return "";
	}
}
