package mc322.lab03;

public class AquarioLombriga {
	char direcao;
    int size_lombriga, pos_lombriga; //Posição onde está a ponta da cauda.
    int size_aquario;
    
    AquarioLombriga(int size_aquario, int size_lombriga, int pos_lombriga, char direcao){
        this.size_aquario = size_aquario;
        this.size_lombriga = size_lombriga;
        this.pos_lombriga = pos_lombriga;
        this.direcao = direcao;
    }
    
    void crescer(){
        if (this.direcao == 'D' && this.pos_lombriga > 1){
            this.size_lombriga += 1;
            this.pos_lombriga -= 1;
        }
        else if (this.direcao == 'E' && this.pos_lombriga < this.size_aquario){
            this.size_lombriga += 1;
            this.pos_lombriga += 1;
        }
    }
    
    void virar(){
        if(this.direcao == 'D'){
            this.direcao = 'E';
            this.pos_lombriga = this.pos_lombriga + this.size_lombriga - 1;
        }
        else{
            this.direcao = 'D';
            this.pos_lombriga = this.pos_lombriga - this.size_lombriga + 1;
        }
    }
    
    void mover(){
        if (this.direcao == 'D'){
            if ((this.pos_lombriga + this.size_lombriga - 1) < this.size_aquario){
                this.pos_lombriga += 1;
            }
            else{
                virar();
            }
        }
        else{
            if ((this.pos_lombriga - this.size_lombriga + 1) > 1){
                this.pos_lombriga -= 1;
            }
            else{
                virar();
            }
        }
    }
    
    void apresentar(){
        int i;
        if (this.direcao == 'D'){
            for (i = 1; i < this.pos_lombriga; i++){
                System.out.print('#');
            }
            for (i = 0; i < this.size_lombriga-1; i++){
                System.out.print('@');
            }
            System.out.print('O');
            for (i = this.pos_lombriga + this.size_lombriga; i <= this.size_aquario; i++){
                System.out.print('#');
            }
        }
        else{
            for (i = 1; i < this.pos_lombriga - this.size_lombriga + 1; i++){
                System.out.print('#');
            }
            System.out.print('O');
            for (i = 0; i < this.size_lombriga-1; i++){
                System.out.print('@');
            }
            for (i = this.pos_lombriga+1; i <= this.size_aquario; i++){
                System.out.print('#');
            }
        }
    }
}
