package mc322.lab03;

public class AppAnimacao {
	public static void main(String args[]) {
		String animacao = "080403MCMVM";
		int size_aquario = Integer.parseInt(animacao.substring(0,2));
		int size_lombriga = Integer.parseInt(animacao.substring(2,4));
		int pos_lombriga = Integer.parseInt(animacao.substring(4,6));

		AquarioLombriga lombriga = new AquarioLombriga(size_aquario, size_lombriga, pos_lombriga, 'D');

		Animacao animacao_classe = new Animacao(lombriga, animacao);
		animacao_classe.lombriga.apresentar();
		System.out.print("\n");

		int i;
		for (i = 6; i < animacao.length(); i++){
		    animacao_classe.passo();
		}
	}
}
