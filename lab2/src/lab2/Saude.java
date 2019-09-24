package lab2;
/**
 * Representação da saúde de um aluno:
 *  Saúde física.
 *  Saúde mental.
 *  Emoji representando o estado atual.
 * 
 * Laboratório de Programação 2 - Lab 2
 * @author Gustavo Henrique Dias Ventura - 119110971
 */
public class Saude {
	//Atributos.
	/** (String) Saude física do aluno. */
	private String saudeFisica;
	
	/** (String) Saude mental do aluno. */
	private String saudeMental;
	
	/** (String) Emoji representando o humor do aluno .*/
	private String emoji;
	//Fim dos atributos.
	
	//Início dos construtores.
	/** Determina a saúde do aluno.
	 *  A saúde física e saúde mental começam em "boa"  .
	 */
	public Saude() {
		this.setSaudeFisica("boa");
		this.saudeMental = "boa";
	}
	//Fim dos construtores
	
	
	//Início dos métodos.
	
	/** Define a saúde mental do aluno em:
	 *  -"boa" ou "fraca".
	 *  @param (String) Saúde mental. */
	public void defineSaudeMental(String saudeMental) {
		if (!this.getSaudeMental().equals(saudeMental)) {
			this.definirEmoji("");
		}
		this.saudeMental = saudeMental;
	}
	
	/** Define a saúde física do aluno em:
	 *  -"boa" ou "fraca".
	 * 
	 * @param (String) Saúde física.
	 */
	public void defineSaudeFisica(String saudeFisica) {
		if (!this.getSaudeFisica().equals(saudeFisica)) {
			this.definirEmoji("");
		}
		this.setSaudeFisica(saudeFisica);
	}

	
	/** Retorna a saúde geral do aluno e, se existir,
	 *  um emoji que representa seu estado atual.
	 *  
	 *  @return (String) a representação da saúde do aluno.
	 */
	public String getStatusGeral() {
		if (this.emoji == null) {
			return analisaSaude();
		}
		return analisaSaude() + " " + this.emoji;
	}
	
	/** Analisa a saúde do aluno.
	 *  Se a saúde física e saúde mental
	 *  for:
	 * -"boa" e "boa", a saúde geral é "boa".
	 * -"fraca" e "fraca", a saúde geral é "fraca".
	 * -"boa" e "fraca" ou "fraca" e "boa", a saúde geral é "ok".
	 * 
	 * @return (String) a saúde geral do aluno.
	 */
	private String analisaSaude() {
		if (this.getSaudeFisica().equals(this.getSaudeMental())) {
			if (this.getSaudeFisica().equals("boa")) {
				return "boa";
			} else {
				return "fraca";
			}
		} else {
			return "ok";
		}
	}
	/** Define um emoji para o estado atual do aluno.
	 * 
	 * @param (String) emoji. 
	 */
	public void definirEmoji(String emoji) {
		this.emoji = emoji;
	}
	
	/** Retorna o estado da saúde física.
	 *  "boa" ou "fraca".
	 *  @return (String) saúde física.
	 */
	public String getSaudeFisica() {
		return saudeFisica;
	}
	
	/** Determina a saúde física.
	 * 
	 * @param (String) saúde física "boa" ou "fraca".
	 */
	public void setSaudeFisica(String saudeFisica) {
		this.saudeFisica = saudeFisica;
	}

	/** Retorna a saúde mental.
	 *  "boa" ou "fraca".
	 *  
	 *  @return (String) saúde mental.
	 */
	public String getSaudeMental() {
		return saudeMental;
	}
	
	/** Determina a saúde mental.
	 * 
	 * @param (String) saúde mental "boa" ou "fraca".
	 */
	public void setSaudeMental(String saudeMental) {
		this.saudeMental = saudeMental;
	}
	//Fim dos métodos.
}
