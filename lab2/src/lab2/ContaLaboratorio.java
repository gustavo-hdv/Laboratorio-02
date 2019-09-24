package lab2;

/**

 * Representação de uma conta de laboratório de computação que contém:
 * 	Nome do laboratório.
 *  Espaço ocupado em MBytes.
 *  Espaço limite em MBytes.
 *
 * Laboratório de Programação 2 - Lab 2
 * @author Gustavo Henrique Dias Ventura - 119110971
 * 
 */

public class ContaLaboratorio {
	//Atributos
	/** (String) nomeLab: recebe o nome do laboratório. */
	private String nomeLab;
	
	/** (int) espacoOcupado: tem como padrão 0 MBytes, contém o espaço ocupado no laboratório. */
	private int espacoOcupado;
	
	/** (int) limiteEspaco: tem como padrão 2000 MBytes, contém o espaço limite no laboratório. */
	private int limiteEspaco;
	//Fim dos Atributos
	
	//Início dos Construtores.
	/** Constroi um laboratório com um nome e um limite de espaço de (2000 MBytes).
	 *  O espaço ocupado começa em (0 MBytes).
	 * @param (String) nome do laboratório.
	 */
	public ContaLaboratorio(String nomeLab) {
		this.nomeLab = nomeLab;
		this.limiteEspaco = 2000;
		this.espacoOcupado = 0;
	}
	
	/** Constroi um laboratório com um nome e um limite de espaço.
	 * 
	 * @param (String) nome do laboratório.
	 * @param (int) limite de espaço.
	 */
	public ContaLaboratorio(String nomeLab, int limiteEspaco) {
		this.nomeLab = nomeLab;
		this.limiteEspaco = limiteEspaco;
	}
	//Fim dos Construtores
	
	
	//Início dos Métodos
	/** Método para consumir determinado espaço utilizado.
	 * 
	 *  @param (int) espaço em MBytes*/
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
	}
	
	/** Método para liberar determinado espaço utilizado.
	 * 
	 *  @param espaço em MBytes*/
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
	}
	
	/** Checa se o espaço limite(2000MBytes) do laboratório foi atingido.
	 * 
	 * @return (boolean) true ou false.
	 */
	public boolean atingiuCota() {
		if (this.espacoOcupado >= this.limiteEspaco) {
			return true;
		}
		return false;
	}
	
	@Override 
	/** Retorna o nome do laboratório e o status do espaço atual.
	 *  estilo "NomeLab EspacoOcupado/LimiteEspaco"
	 *  
	 *  @return (String) representação de um laboratório.
	 */
	public String toString() {
		return this.getNomeLab() + " " + this.espacoOcupado + "/" + this.limiteEspaco;
	}
	
	/** Retorna o nome do laboratório.
	 * 
	 * @return (String) nome do laboratório.
	 */
	public String getNomeLab() {
		return nomeLab;
	}
	//Fim dos métodos
}