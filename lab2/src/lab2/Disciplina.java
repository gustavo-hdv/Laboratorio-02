package lab2;

/**

 * Representação de uma disciplina que contém:
 *  O nome da disciplina.
 *  Horas de estudo do aluno.
 *  Notas do aluno na disciplina.
 *  Pesos das notas na disciplina.
 *
 * Laboratório de Programação 2 - Lab 2
 * @author Gustavo Henrique Dias Ventura - 119110971
 */

import java.util.Arrays;

public class Disciplina {
	//Atributos.
	/** (String) nomeDisciplina: recebe o nome da disciplina. */
	private String nomeDisciplina;
	
	/** (int) horasEstudando: recebe as horas de estudo. */
	private int horasEstudando;
	
	/** (double) notas[]: array com as notas do aluno. */
	private double[] notas;
	
	/** (double) pesoNotas[]: array com os pesos das notas. */
	private double[] pesoNotas;
	//Fim dos atributos.
	
	//Início dos Construtores.
	/** Primeiro Construtor da classe.
	 *  Constrói uma disciplina com um nome recebido.
	 *  Todas as 4 notas começam com 0.
	 *  Todos os pesos das 4 notas começam com 1.
	 *  Horas de estudo começa com 0.
	 * 
	 * @param (String) nome da disciplina.
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
		this.pesoNotas = new double[4];
		Arrays.fill(pesoNotas, 1);
		this.horasEstudando = 0;
	}
	
	/** Segundo Construtor da Classe
	 *  Constrói uma disciplina com um nome recebido.
	 *  Todas as notas começam com 0.
	 *  Todos os pesos das notas começam com 1.
	 *  Horas de estudo começa com 0.
	 * 
	 * @param (String) nome da disciplina.
	 * @param (String) quantidade de notas.
	 * */
	public Disciplina(String nomeDisciplina, int totalNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[totalNotas];
		this.pesoNotas = new double[totalNotas];
		Arrays.fill(pesoNotas, 1);
		this.horasEstudando = 0;
	}
	
	/** Terceiro Construtor da Classe
	 *  Constrói uma disciplina com um nome recebido.
	 *  Todas as notas começam com 0.
	 *  Um array com pesos de notas é recebido.
	 *  Horas de estudo começa com 0.
	 * 
	 * @param (String) nome da disciplina.
	 * @param (int) quantidade de notas.
	 * @param (double[]) pesos das notas.
	 * */
	public Disciplina(String nomeDisciplina, int totalNotas, double[] pesoNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[totalNotas];
		this.pesoNotas = pesoNotas;
		this.horasEstudando = 0;
	}
	//Fim dos Construtores.
	
	//Início dos Métodos.
	/** Cadastra as horas de estudo do aluno.
	 * 
	 * @param (int) horas de estudo.
	 */
	public void cadastraHoras(int horasEstudando) {
		this.horasEstudando += horasEstudando;
	}
	
	/** Cadastra as notas do aluno.
	 * 
	 * @param (int) número da nota a ser cadastrada.
	 * @param (int) o valor que representa a nota.
	 */
	public void cadastraNota(int posicaoNota, double valorNota) {
		this.notas[posicaoNota-1] = valorNota;
	}
	
	/** Verifica se o aluno foi aprovado (nota maior ou igual a sete).
	 * 
	 *  @return (boolean) true ou false.
	 */
	public boolean aprovado() {
		if (this.calculaMedia() >= 7.0) return true;
		return false;
	}
	
	/** Calcula a média das notas do aluno,
	 *  considerando o peso das respectivas notas.
	 * 
	 *  @return mediaA.
	 */
	private double calculaMedia() {
		double somaNotas = 0;
		double somaPesos = 0;
		for (int i=0; i < this.notas.length; i++) {
			somaNotas += this.notas[i] * this.pesoNotas[i];
			somaPesos += this.pesoNotas[i];
		}
		return somaNotas/somaPesos;
	}
	
	@Override
	/** Retorna uma String no estilo:
	 *  "Nome da Disciplina: x
	 *   Horas de Estudo: x
	 *   Média das notas: x
	 *   Todas as notas: [nota1, nota2, nota3, nota4]"
	 * 
	 *  @return (String) representação da disciplina.
	 */
	public String toString() {
		return "Nome da disciplina: (" + this.getNomeDisciplina()
		+ ") Horas de estudo: (" + this.horasEstudando
		+ ") Média das notas: (" + this.calculaMedia()
		+ ") Todas as notas: " + Arrays.toString(this.notas);
	}
	
	/** Retorna o nome da disciplina.
	 * 
	 * @return (String) nome da disciplina.
	 */
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	//Fim dos métodos.
}