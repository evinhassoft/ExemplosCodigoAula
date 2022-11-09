package aula22;

/**
 * Classe Veiculo simula o comportamento de um veiculo. 
 * @author Fabiana Freitas Mendes
 * @since 2022
 * @version 1.1
 *
 */

public class Veiculo {
	
	private String marca;
    private float velocidade;
    
    /**
     * Retorna a marca do veiculo
     * @return String
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Altera a marca do veiculo
     * @param marca string contendo a nova marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Retorna a velocidade atual do veiculo
     * @return float 
     */
    public float getVelocidade() {
        return velocidade;
    }
    
    /**
     * Altera a velocidade atual do veiculo pata
     * aquela indicada nos parametros do metodo
     * @param velocidade novo valor
     */
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    /**
     * Diminui a velocidade do veiculo em uma unidade
     * caso a velocidade seja maior que zero. 
     */
    public void frear() {
        if (velocidade > 0)
            velocidade--;
    }
    
    /**
     * Aumenta a velocidade do veiculo em uma unidade.
     * A velocidade maxima permitida de um veiculo e 10.
     */
    public void acelerar() {
        if (velocidade <= 10)
            velocidade++;
    }
    
    /**
     * Constroi uma string que contem a marca
     * e a velocidade do veiculo
     * @return String
     */
    public String toString() {
    	return "Marca = " + marca +
    			"Velocidade = " + velocidade;
    }
}
