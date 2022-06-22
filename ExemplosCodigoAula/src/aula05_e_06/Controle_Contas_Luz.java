package aula05_e_06;

public class Controle_Contas_Luz {
	private String id;
	private Conta_Luz contas[];
	private double media_consumo;
	private int qtd_contas;
	
	public Controle_Contas_Luz() {
		contas =  new Conta_Luz[120];
		media_consumo = 0;
		qtd_contas = 0;
	}
	
	public boolean acrescentar_Conta(Conta_Luz c) {
		if(qtd_contas < 120) {
			contas[qtd_contas] = c;
			qtd_contas++;
			return true;
		} else {
			return false;
		}
	}
	
	public void calcular_media_consumo() {
		double soma = 0;
		for(int i = 0; i < qtd_contas; i++) 
			soma = soma + contas[i].getValor(); 
		media_consumo = soma/qtd_contas;
	}
	
	public String verificar_mes_menor_consumo() {
		Conta_Luz menor = contas[0];
		for(int i = 1; i < qtd_contas; i++) {
			if(contas[i].getValor() < menor.getValor())
				menor = contas[i];
		}
		return menor.getDt_leitura();
	}
}
