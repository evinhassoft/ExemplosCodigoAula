package aula07;

public class Robo {

	String modelo;
	String cor;
	int ano;
	String nSerie;
	boolean ligado;
	float direcao;
	float velocidade;
	
	public void ligar() {
		ligado = true;
		velocidade = 0;
	}
	
	public void desligar() {
		ligado = false;
		velocidade = 0;
	}
	
	public void andar() {
		velocidade = 2;
	}
	
	public void parar() {
		velocidade = 0;
	}
	
	public void virar() {
		direcao = direcao + 1;
		if(direcao == 360)
			direcao = 0;
	}
	
	/*
	 * Exercicios:
	 * (1) Escrever um construtor no qual o robo já e
	 *     criado no estado ligado, velocidade igual a
	 *     dois, e direcao igual a zero.
	 * (2) Escrever um construtor no qual o robo e
	 *     criado no estado desligado, velocidade igual a
	 *     zero, direcao igual a zero.
	 * (3) Escrever um segundo metodo andar cujo incremento da
	 *     velocidade e fornecida como argumento
	 * (4) Escrever um segundo metodo virar cuja incremento da
	 *     direcao e fornecida como argumento
	 * (5) Escrever o método toString que imprima o estado atual
	 * do robo
	 */
}
