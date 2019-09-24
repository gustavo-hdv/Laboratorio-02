package lab2;
/**
 * Representação de um aluno:
 *  Lista de disciplinas.
 *  Lista de contas no laboratório.
 *  Lista de contas na cantina.
 *  Saude mental e física.
 * 
 * Laboratório de Programação 2 - Lab 2
 * @author Gustavo Henrique Dias Ventura - 119110971
 */

import java.util.ArrayList;
import java.util.List;

public class Aluno{
	//Atributos.
	/** (List) Lista de disciplinas do aluno. */
	List<Disciplina> disciplinas = new ArrayList<>();
	
	/** (List) Lista de contas de laboratório do aluno. */
	List<ContaLaboratorio> contasLaboratorio = new ArrayList<>();
	
	/** (List) Lista de cantinas do aluno. */
	List<ContaCantina> contasCantina = new ArrayList<>();
	
	/** (Saude) A saúde do aluno. */
	Saude estadoAluno = new Saude();
	//Fim dos atributos.
	
	/** Cadastra o aluno no laboratório:.
	 *  Adiciona o laboratório em uma lista de laboratórios.
	 * 
	 * @param (String) nome do laboratório.
	 */
	public void cadastraLaboratorio(String nomeLaboratorio) {
		this.contasLaboratorio.add(new ContaLaboratorio(nomeLaboratorio));
	}
	
	/** Cadastra o aluno no laboratório com um limite para o espaço no HD.
	 *  Adiciona o laboratório em uma lista de laboratórios.
	 * 
	 * @param (String) nome do laboratório.
	 * @param (int) limite do espaço no HD.
	 */
	public void cadastraLaboratorio(String nomeLaboratorio, int limiteEspaco) {
		this.contasLaboratorio.add(new ContaLaboratorio(nomeLaboratorio, limiteEspaco));
	}
	
	/** Consome um determinado espaço no HD do laboratório especificado.
	 *
	 * @param (String) nome o laboratório.
	 * @param (int) espaço consumido (MBytes).
	 */
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		for (ContaLaboratorio conta : this.contasLaboratorio) {
			if (conta.getNomeLab().equals(nomeLaboratorio)) {
				conta.consomeEspaco(mbytes);
			}
		}
	}
	
	/** Libera um determinado espaço no HD do laboratório especificado.
	 * 
	 * @param (String) nome do laboratório.
	 * @param (int) espaço liberado (MBytes); 
	 */
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		for (ContaLaboratorio conta: this.contasLaboratorio) {
			if (conta.getNomeLab().equals(nomeLaboratorio)) {
				conta.liberaEspaco(mbytes);
			}
		}
	}
	
	/** Verifica se atingiu o limite do HD no laboratório especificado.
	 * 
	 * @param (String) nome do laboratório.
	 */
	public boolean atingiuCota(String nomeLaboratorio) {
		for (ContaLaboratorio conta: this.contasLaboratorio) {
			if (conta.getNomeLab().equals(nomeLaboratorio)) {
				return conta.atingiuCota();
			}
		}
		return false;
	}
	
	/** Demonstra especificações do laboratório especificado:
	 *  "Nome do laboratório  Espaço utilizado / Espaço limite".
	 *  
	 *  @return (String) representação do laboratório.
	 */
	public String laboratorioToString(String nomeLaboratorio) {
		for (ContaLaboratorio conta: this.contasLaboratorio) {
			if (conta.getNomeLab().equals(nomeLaboratorio)) {
				return conta.toString();
			}
		}
		return null;
	}
	
	/** Cadastra o aluno em uma disciplina.
	 *  Adiciona a disciplina em uma lista de disciplinas.
	 * 
	 * @param (String) nome da disciplina.
	 */
	public void cadastraDisciplina(String nomeDisciplina) {
		this.disciplinas.add(new Disciplina(nomeDisciplina));
	}
	
	/** Cadastra as horas de estudo do aluno na disciplina especificada.
	 * 
	 * @param (String) nome da disciplina.
	 * @param (int) horas para o aluno estudar.
	 */
	public void cadastraHoras(String nomeDisciplina, int horasEstudando) {
		for (Disciplina disciplina: this.disciplinas) {
			if (disciplina.getNomeDisciplina().equals(nomeDisciplina)) {
				disciplina.cadastraHoras(horasEstudando);
			}
		}
	}
	
	/** Cadastra as notas do aluno na disciplina especificada.
	 * 
	 * @param (String) nome da disciplina.
	 * @param (int) posição da nota.
	 * @param (double) valor da nota.
	 * */
	public void cadastraNota(String nomeDisciplina, int posicaoNota, double valorNota) {
		for (Disciplina disciplina: this.disciplinas) {
			if (disciplina.getNomeDisciplina().equals(nomeDisciplina)) {
				disciplina.cadastraNota(posicaoNota, valorNota);
			}
		}
	}
	
	/** Verifica se o aluno foi aprovado ou não na disciplina especificada.
	 * 
	 * @return (boolean) true ou falso.
	 */
	public boolean aprovado(String nomeDisciplina) {
		for (Disciplina disciplina: this.disciplinas) {
			if (disciplina.getNomeDisciplina().equals(nomeDisciplina)) {
				return disciplina.aprovado();
			}
		}
		return false;
	}
	
	/** Demonstra as especificações da disciplina especificada.
	 *  "Nome da disciplina  horas estudando  media  lista de notas".
	 * 
	 * @param Nome da disciplina
	 * @return (String) representação da disciplina especificada.
	 */
	public String disciplinaToString(String nomeDisciplina) {
		for (Disciplina disciplina: this.disciplinas) {
			if (disciplina.getNomeDisciplina().equals(nomeDisciplina)) {
				return disciplina.toString();
			}
		}
		return null;
	}
	
	/** Cadastra o aluno em uma cantina.
	 *  Adiciona a cantina em uma lista de cantinas.
	 *  
	 *  @param (String) nome da cantina.
	 */
	public void cadastraCantina(String nomeCantina) {
		this.contasCantina.add(new ContaCantina(nomeCantina));
	}
	
	/** Cadastra os lanches da cantina especificada.
	 * 
	 * @param (String) nome da cantina.
	 * @param (int) quantidade de itens.
	 * @param (int) valor do lanche em centavos.
	 */
	public void cadastraLanche(String nomeCantina, int qtnItens, int valorCentavos) {
		for (ContaCantina conta: this.contasCantina) {
			if (conta.getNomeCantina().equals(nomeCantina)) {
				conta.cadastraLanche(qtnItens, valorCentavos);
			}
		}
	}
	
	/** Paga a conta na cantina especificada.
	 * 
	 * @param (String) nome da cantina.
	 * @param (int) valor em centavos.
	 */
	public void pagarConta(String nomeCantina, int valorCentavos) {
		for (ContaCantina conta : this.contasCantina) {
			if (conta.getNomeCantina().equals(nomeCantina)) {
				conta.pagaConta(valorCentavos);
			}
		}
	}
	
	/** Verifica quanto deve em uma cantina especificada.
	 * 
	 * @param (String) nome da cantina.
	 */
	public int getFaltaPagar(String nomeCantina) {
		for (ContaCantina conta : this.contasCantina) {
			if (conta.getNomeCantina().equals(nomeCantina)) {
				return conta.getFaltaPagar();
			}
		}
		return 0;
	}
	
	/** Retorna especificações da cantina especificada.
	 * "Nome da cantinha  quantidade de itens  valor dos lanches".
	 * 
	 * @param (String) nome da cantina.
	 * @return (String) representação da cantina especificada. 
	 */
	public String cantinaToString(String nomeCantina) {
		for (ContaCantina conta : this.contasCantina) {
			if (conta.getNomeCantina().equals(nomeCantina)) {
				return conta.toString();
			}
		}
		return null;
	}
	
	/** Define a saúde mental do aluno:
	 * 
	 * @param (String) saúde mental (boa ou fraca). 
	 */
	public void defineSaudeMental(String saudeMental) {
		this.estadoAluno.setSaudeMental(saudeMental);;
	}
	
	/** Define a saúde física do aluno:
	 * 
	 * @param (String) saúde física (boa ou fraca). 
	 */
	public void defineSaudeFisica(String saudeFisica) {
		this.estadoAluno.setSaudeFisica(saudeFisica);
	}
	
	/** Retorna o estado geral do aluno:
	 *  "estado geral + emoji(se existir)."
	 *  
	 *  @return (String) representação do estado geral do aluno.
	 */
	public String getStatusGeral() {
		return this.estadoAluno.getStatusGeral();
	}
}
