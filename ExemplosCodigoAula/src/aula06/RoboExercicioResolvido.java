package aula06;

public class RoboExercicioResolvido {
	public String modelo;
    public String cor;
    public int ano ;
    public String nSerie ;
    public boolean ligado ;
    public float direcao ;
    public float velocidade ;

    // public RoboExericioResolvido(){
        // ligado = true;
        // velocidade = 2;
        // direcao = 0;
    //}

    public RoboExercicioResolvido(){
        ligado = false;
        velocidade = 0;
        direcao = 0;
    }

    public void ligar () {
        ligado = true ;
        velocidade = 0;
    }

    public void desligar () {
        ligado = false ;
        velocidade = 0;
    }
    public void andar () {
        velocidade = 2;
    }

    public void andar(float v){
        this.velocidade += v;
    }

    public void parar () {
        velocidade = 0;
    }
    public void virar () {
        direcao = direcao + 1;
        if (direcao == 360)
            direcao = 0;
    }

    public void virar(float d){
        direcao = direcao + d;
        if (direcao >= 360)
            direcao = direcao - 360;
    }

    @Override
    public String toString(){
        return modelo + ", " + cor + ", " + ano + ", " + nSerie + 
        		", " + ligado + ", " + direcao + ",  " + velocidade; 
    }
}
