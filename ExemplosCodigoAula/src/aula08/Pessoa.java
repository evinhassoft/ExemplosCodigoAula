package aula08;

public class Pessoa {

	protected String nome;
	protected long cpf;
	protected String rg;
	protected String tel_contato;
	protected String end_residencial;

	/* 
	 * Escrever codigo para criar uma 
	 * nova pessoa. Esse metodo seria 
	 * melhor modelado como um construtor
	 */
	public void adicionar() {
		// todo
	}

	/* 
	 * Escrever editar as informacoes de 
	 * uma pessoa. Talvez seja necessario
	 * criar varios metodos editar, um
	 * para cada campo que se deseja
	 * editar ou a logica de escolha
	 * do campo a ser editado deve estar
	 * no codigo
	 */
	public boolean editar() {
		// todo
		return false;
	}

	/* 
	 * Escrever deletar uma pessoa.
	 * Uma pessoa so pode ser deletada
	 * se nao nao possuir um contrato
	 */
	public boolean deletar() {
		// todo
		return false;
	}
	
	public String imprimir_informacoes_basicas() {
		String saida = "Nome: ";
		saida = saida + nome + "\n";
		saida = saida + "Telefone: ";
		saida = saida + tel_contato + "\n";
		saida = saida + "Endereco";
		saida = saida + end_residencial + "\n";
		return saida;
	}

}
