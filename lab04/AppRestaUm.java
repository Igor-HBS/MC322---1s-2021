package mc322.lab04;

public class AppRestaUm {
	public static String[] executaJogo(String file_path) {
		// Reading CSV file to obtain commands[]
		CSVReader reader = new CSVReader();
		reader.setDataSource(file_path);
		String[] commands = reader.requestCommands();
		
		//Creating board
		Board board = new Board();
		board.inicializar();
		
		// Playing game
		board.imprimir();
		
		int pos_x, pos_y, new_pos_x, new_pos_y;
		for (int i = 0; i < commands.length; i++) {
			// Obter as posicoes atuais e novas de cada
			// comando
			
			board.moverPeca(pos_x, pos_y, new_pos_x, new_pos_y);
			board.imprimir();
		}
		
		// Obter um vetor de String com todas etapas do jogo
		// Retornar esse vetor de string
	}
	
	
	public static void main(String args[]) {
		// Obter o filepath na entrada;
		// String vetor_estados[] = executaJogo(file_path);
		
		// O executaJogo printa todos os estados do tabuleiro e
		// retorna o vetor de estados.
		
		// Fazer algo com o vetor de estados.
	}
}
