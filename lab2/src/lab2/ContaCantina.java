package lab2;
/**
 * Representação de uma conta na cantina que contém:
 *  O nome da cantina.
 *  Débito em conta.
 * 
 * Laboratório de Programação 2 - Lab 2
 * @author Gustavo Henrique Dias Ventura - 119110971
 */

import java.util.List;
import java.util.ArrayList;

public class ContaCantina {
	//Atributos
	/** (String) recebe o nome da cantina. */
	private String nomeCantina;
	
	/** (Inteiro) valor que está devendo para a cantina. */
	private int debitoConta;
	
	/** (Inteiro) quantidade de itens. */
	private int qntItens;
	
	/** (Inteiro) valor de todos os itens solicitados. */
	private int valorLanches;
	
	private List<String> lanchesDescricao = new ArrayList<>();
	
	//Início dos Construtores.
	/** Construtor ContaCantina
	 * 
	 * @param nome da cantina (String).
	 */
	public ContaCantina(String nomeCantina) {
		this.nomeCantina = nomeCantina;
		this.debitoConta = 0;
		this.qntItens = 0;
		this.valorLanches = 0;
	}
	//Fim dos Construtores.
	
	//Início dos Métodos
	/** Cadastra a quantidade de lanches e o valor em centavos.
	 * 
	 * @param Quantidade de itens (Inteiro).
	 * @param Valor dos itens em centavos (Inteiro).
	 */
	public void cadastraLanche(int qntItens, int valorCentavos) {
		this.debitoConta += valorCentavos;
		this.qntItens += qntItens;
		this.valorLanches += valorCentavos;
	}

	/** Cadastra a quantidade de lanches e o valor em centavos.
	 * 
	 * @param Quantidade de itens (Inteiro).
	 * @param Valor dos itens em centavos (Inteiro).
	 * @param Descrição do lanche (String).
	 */
	public void cadastraLanche(int qntItens, int valorCentavos, String detalhes) {
		this.debitoConta += valorCentavos;
		this.qntItens += qntItens;
		this.valorLanches += valorCentavos;
		this.lanchesDescricao.add(detalhes);
	}
	
	/** Retorna os 5 últimos lanches
	 * 
	 * @return um lanche em cada linha (String).
	 * */
	public String listarDetalhes() {
		String detalhes = "";
		int contaDetalhes = 5;
		for (int i=this.lanchesDescricao.size()-1; i >= 0 && contaDetalhes > 0; i--, contaDetalhes--) {
			detalhes += lanchesDescricao.get(i) + "\n";
		}
		return detalhes;
	}
	/** Recebe uma quantia em centavos para subtrair do debitoConta.
	 * 
	 * @param (Inteiro) valor em centavos.
	 */
	public void pagaConta(int valorCentavos) {
		this.debitoConta -= valorCentavos;
	}
	
	/** Retorna a quantia, em centavos, que falta para pagar a cantina.
	 *
	 * @return (Inteiro) Debito da conta.
	 */
	public int getFaltaPagar() {
		return this.debitoConta;
	}
	
	@Override
	/** Retorna uma String no estilo:
	 *  "Nome da cantinha + quantidade de itens + valor dos lanches".
	 * 
	 * @return (String) representação de uma cantina.
	 */
	public String toString() {
		return "Nome da cantina: " + this.getNomeCantina()
				+ " Quantidade de itens: " + this.qntItens
				+ " Valor dos lanches: " + this.valorLanches;
	}
	
	/** Retorna o nome da cantina.
	 * 
	 * @return (String) nome da cantina
	 */
	public String getNomeCantina() {
		return this.nomeCantina;
	}
	//Fim dos Métodos
}