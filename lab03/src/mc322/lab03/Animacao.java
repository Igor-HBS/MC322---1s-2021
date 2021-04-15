package mc322.lab03;

public class Animacao {
	AquarioLombriga lombriga;
    String animacao;
    int animacao_i = 6;
    
    Animacao(AquarioLombriga lombriga, String animacao){
        this.lombriga = lombriga;
        this.animacao = animacao;
    }
    
    void passo(){
        char anime = this.animacao.charAt(animacao_i);
        this.animacao_i += 1;
        
        if (anime == 'C'){
            this.lombriga.crescer();
            this.lombriga.apresentar();
            System.out.print("\n");
        }
        else if (anime == 'M'){
            this.lombriga.mover();
            this.lombriga.apresentar();
            System.out.print("\n");
        }
        else{
            this.lombriga.virar();
            this.lombriga.apresentar();
            System.out.print("\n");
        }
    }
}
