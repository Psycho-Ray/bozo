public class Placar {
	int[] scoreBoard = new int[10];
	
	/*Inicia com o placar zerado*/
	public Placar() {
		for (int i = 0; i < 10; i++)
			scoreBoard[i] = 0;
	}

	/*Adiciona a pontuação correspondente ao placar, mas não checa se o movimento é honesto*/
	public void add(int posicao, int[] dados) {

		if (scoreBoard[posicao - 1] == 0) {
			if (posicao <= 6) scoreBoard[posicao - 1] = posicao * dados.length;
			else if (posicao == 7) scoreBoard[6] = 15;
			else if (posicao == 8) scoreBoard[7] = 20;
			else if (posicao == 9) scoreBoard[8] = 30;
			else if (posicao == 10) scoreBoard[9] = 40;
		}

	}

	/*Retorna a soma dos pontos no placar*/
	public int getScore() {
		int sum = 0;
		for (int i = 0; i < 10; i++) sum += scoreBoard[i];
		return sum;
	}

	@Override
	public String toString() {
		String scoreDisplay = "";
		String aux = "";
		int filledSpace;
		
		//For the first three rows
		for (int i = 0; i < 4; i++) {
			//(1) or 2, for example
			aux = Integer.toString(scoreBoard[i]);
			scoreDisplay += (scoreBoard[i] != 0) ? aux : "(1)";
			
			//Allign with spaces
			filledSpace = (scoreBoard[i] != 0) ? aux.length() : 3;
			for (int j = filledSpace; j < 7; j++)
				scoreDisplay += " ";
			
			//More spaces
			scoreDisplay += "|";
			for (int j = 0; j < 3; j++)
				scoreDisplay +=  " ";
			
			//Middle Column
			aux = Integer.toString(scoreBoard[i+6]);
			scoreDisplay += (scoreBoard[i+6] != 0) ? aux : "(7)";
			
			//Allign with spaces
			filledSpace = (scoreBoard[i+6] != 0) ? aux.length() : 3;
			for (int j = filledSpace; j < 7; j++)
				scoreDisplay += " ";
			
			//More spaces
			scoreDisplay += "|";
			for (int j = 0; j < 3; j++)
				scoreDisplay +=  " ";
			
			//Final Column
			aux = Integer.toString(scoreBoard[i+3]);
			scoreDisplay += (scoreBoard[i+3] != 0) ? aux : "(4)";
			
			//Allign with spaces, then a line break
			filledSpace = (scoreBoard[i+3] != 0) ? aux.length() : 3;
			for (int j = filledSpace; j < 4; j++)
				scoreDisplay +=  " ";
			scoreDisplay += "\n";
			
			//End of line
			scoreDisplay += "--------------------------";
		}
		
		//Allign with spaces
		scoreDisplay += "        |   ";
		
		//Last Cell
		aux = Integer.toString(scoreBoard[9]);
		scoreDisplay += (scoreBoard[9] != 0) ? aux : "(10)";
		
		//Last allignment
		filledSpace = (scoreBoard[9] != 0) ? aux.length() : 3;
		for (int j = filledSpace; j < 4; j++)
			scoreDisplay +=  " ";
		scoreDisplay += "|\n";
		
		//Last line
		scoreDisplay += "        +----------+\n";
		
		return scoreDisplay;
	}
}
