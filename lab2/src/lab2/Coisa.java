package lab2;

/** Representação do Controle Institucional da Situação Acadêmica (COISA).
 * 
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Gustavo Henrique Dias Ventura - 119110971
 */

import java.util.Scanner;

/** O código a seguir é para interação com o usuário, execute o programa para entender o que está acontecendo =) */
public class Coisa {
	/**  Analisa de um valor da entrada está em uma lista e comandos 
	 * 
	 * @param Lista de comandos
	 * @param Valor da entrada
	 * 
	 * @return (true) ou (false)*/
	public static boolean analisaComando(String[] comandos, String entrada) {
		for (String comando : comandos) {
			if (comando.equalsIgnoreCase(entrada)) {
				return true;
			}
		}
		return false;
	}
	
	public static void getInfos(String entrada, String menu, String manualDosEscoteiros, String infoLaboratorio, String infoDisciplina, String infoCantina, String infoSaude) {
		if (entrada.equalsIgnoreCase(menu)) {
			avisoln(menu);
		}
			
		if (entrada.equalsIgnoreCase(manualDosEscoteiros)) {
			avisoln (manualDosEscoteiros);
		}
			
		if (entrada.equalsIgnoreCase(infoLaboratorio)) {
			avisoln (infoLaboratorio);
		}

		if (entrada.equalsIgnoreCase(infoDisciplina)) {
			avisoln (infoDisciplina);
		}
			
		if (entrada.equalsIgnoreCase(infoCantina)) {
			avisoln (infoCantina);
		}
			
		if (entrada.equalsIgnoreCase(infoSaude)) {
			avisoln (infoSaude);
		}
	}
	
	/** Substitui o System.out.println para avisoln */
	public static void avisoln(String mensagem) {
		System.out.println(mensagem);
	}
	/** Substitui o System.out.print para aviso */
	public static void aviso(String mensagem) {
		System.out.print(mensagem);
	}
	
	public static void main(String[] args) {
		/** ============================= 
		 * Menu de interação com o usuário
		 *  =============================
		 **/
		
		/** Scanner para futura leituras de dados */
		Scanner sc = new Scanner(System.in);
		
		/** Objeto da classe Aluno */
		Aluno gustavohdv = new Aluno();
		
		/** Lista de comandos */
		String[] comandosLaboratorio = {"cadastrarLab", "liberaLab", "analisarLab", "sairCentralLab"};
		String[] comandosDisciplina = {"sairCentralDisciplinas", "cadastrarDisciplina", "cadastrarNota", "aprovado", "analisarDisciplina"};
		String[] comandosCantina = {"sairCentralCantinas", "cadastrarCantina", "cadastrarLanche", "pagarConta", "quantoDeve", "analisarCantina"};
		String[] comandosSaude = {"sairHospital", "saudeFisica", "saudeMental", "estadoGeral"};
		
		/** Strings para interação com o usuário */
		String menu = "Para mais informações, digite:\n"
				+ " ('infoLaboratorio')\n"
				+ " ('infoDisciplina')\n"
                + " ('infoCantina')\n"
                + " ('infoSaude')\n"
                + " ('manualDosEscoteiros')";
		
		String manualDosEscoteiros = "==============================================================\n"
				+ " Não se preocupe em digitar com letras maiúsculas ou minúsculas.\n"
				+ " Não existe o tratamento de erros.\n"
				+ " Se algo der problema, tente ler os manuais antes do próximo comando.\n"
				+ "==============================================================";
		
		String infoLaboratorio = "Para entrar na central de laboratórios\n"
				+ "Digite: ('entrarCentralLab')\n"
				+ "--------------------------------------------\n"
				+ "Para sair da central de laboratórios\n"
				+ "Digite: ('sairCentralLab')\n"
				+ "--------------------------------------------\n"
				+ "Para cadastrar no laboratório:\n"
				+ "Digite: ('cadastrarLab') (nome_do_laboratorio : String)\n"
				+ "--------------------------------------------\n"
				+ "Para consumir espaço no HD:\n"
				+ "Digite: ('consumirEspaco') (nome_do_laboratorio: String) (quantia: int)\n"
				+ "--------------------------------------------\n"
				+ "Para liberar espaço no HD:\n"
				+ "Digite: ('liberarEspaco') (nome_do_laboratorio: String) (quantia : int)\n"
				+ "--------------------------------------------\n"
				+ "Verificar informações do laboratório:\n"
				+ "Digite: ('analisarLab') (nome_do_laboratorio : String)\n"
				+ "--------------------------------------------";
		
		String infoDisciplina = "Para entrar na central de disciplinas\n"
				+ "Digite: ('entrarCentralDisciplinas')\n"
				+ "--------------------------------------------\n"
				+ "Para sair da central de disciplinas\n"
				+ "Digite: ('sairCentralDisciplinas')\n"
		        + "--------------------------------------------\n"
		        + "Para cadastrar na disciplina\n"
		        + "Digite: (cadastrarDisciplina) (nome_da_disciplina : String)\n"
		        + "--------------------------------------------\n"
		        + "Para cadastrar uma nota (total 4)\n"
		        + "Digite: ('cadastrarNota') (nome_da_disciplina : int) (posicao_da_nota(1 até 4): int) (valor_da_nota : double)\n"
		        + "--------------------------------------------\n"
		        + "Para cadastrar as horas da disciplina\n"
		        + "Digite: ('cadastrarHoras') (nome_da_disciplina : String) (horas_de_disciplina : int)"
		        + "--------------------------------------------\n"
		        + "Para verificar se foi aprovado\n"
		        + "Digite: ('aprovado') (nome_da_disciplina : String)\n"
		        + "--------------------------------------------\n"
		        + "Para pegar as informações da disciplina\n"
		        + "Digite: (analisarDisciplina) (nome_da_disciplina)\n"
		        + "--------------------------------------------";
		String infoCantina = "Para entrar na central de cantinas\n"
				+ "Digite: ('entrarCentralCantinas')\n"
                + "--------------------------------------------\n"
                + "Para sair da central de cantinas\n"
                + "Digite: ('sairCentralCantinas')\n"
                + "--------------------------------------------\n"
                + "Para cadastrar na cantina\n"
                + "Digite: ('cadastrarCantina')\n"
                + "--------------------------------------------\n"
                + "Para cadastrar um lanche\n"
                + "Digite: ('cadastrarLanche') (nome_da_cantina : String) (quantidade_de_itens : int) (valor_das_compras_em_centavos : int)\n"
                + "--------------------------------------------\n"
                + "Para pagar a conta\n"
                + "Digite: ('pagarConta') (nome_da_cantina) (valor_em_centavos)\n"
                + "--------------------------------------------\n"
                + "Para saber quanto deve a cantina\n"
                + "Digite: ('quantoDeve') (nome_da_cantina : String)\n"
                + "--------------------------------------------\n"
                + "Mais informações sobre a cantina\n"
                + "Digite: ('analisarCantina')\n"
                + "--------------------------------------------";
		String infoSaude = "Para entrar no hospital\n"
				+ "Digite: ('entrarHospital')\n"
				+ "--------------------------------------------\n"
				+ "Para sair do hospital\n"
				+ "Digite: ('sairHospital')\n"
				+ "--------------------------------------------\n"
				+ "Para definir a saúde mental\n"
				+ "Digite: ('saudeMental') (('boa') ou ('fraca'))\n"
				+ "--------------------------------------------\n"
				+ "Para definir a saúde física\n"
				+ "Digite: ('saudeFisica') (('boa') ou ('fraca'))\n"
				+ "--------------------------------------------\n"
				+ "Para saber o estado geral do paciente\n"
				+ "Digite: ('estadoGeral')";
		
		avisoln(manualDosEscoteiros);
		avisoln("Digite (menu) para mais informações.");
		
		while (true) {
			aviso("(sair) para ir embora -> ");
			String[] comando = sc.nextLine().split(" ");
			
			if (comando[0].equalsIgnoreCase("sair")) {
				avisoln("Finalizando...");
				sc.close();
				break;
			}
			
			/** Informações para o usuário. */
			getInfos(comando[0], menu, manualDosEscoteiros, infoLaboratorio, infoDisciplina, infoCantina, infoSaude);
			
			if (analisaComando(comandosLaboratorio, comando[0])) {
				avisoln("Você precisa entrar na central dos laboratórios antes de fazer algo lá!!");
				avisoln("Digite: ('entrarCentralLab')");
			}
			
			if (analisaComando(comandosDisciplina, comando[0])) {
				avisoln("Você precisa entrar na central das disciplinas antes de fazer algo lá!!");
				avisoln("Digite: ('entrarCentralDisciplinas')");
			}
			
			if (analisaComando(comandosCantina, comando[0])) {
				avisoln("Você precisa entrar na central de cantinas antes de fazer algo lá!!");
				avisoln("Digite: ('entrarCentralCantinas')");
			}
			
			if (analisaComando(comandosSaude, comando[0])) {
				avisoln("Você precisa entrar no hospital antes de fazer algo lá!!");
				avisoln("Digite: ('entrarHospital')");
			}
			
			/** Central de laboratórios */
			if (comando[0].equalsIgnoreCase("entrarCentralLab")) {
				avisoln("Você entrou na central dos laboratórios. (sairCentralLab) para sair.");
				while (true) {
					aviso("Laboratório: ");
					String[] acoesLab = sc.nextLine().split(" ");
					
					if (acoesLab[0].equalsIgnoreCase("manualDosEscoteiros")) {
						avisoln(manualDosEscoteiros);
					} else if (acoesLab[0].equalsIgnoreCase("infoLaboratorio")) {
						avisoln(infoLaboratorio);
					} else if (acoesLab[0].equalsIgnoreCase("infoDisciplina") || acoesLab[0].equalsIgnoreCase("infoCantina") || acoesLab[0].equalsIgnoreCase("infoSaude")) {
						avisoln("!!Você precisa sair da central de laboratórios para verificar o manual " + acoesLab[0] + "!!");
					}
					
					if (acoesLab[0].equalsIgnoreCase("sairCentralLab")) {
						avisoln("Você saiu da central dos laboratórios.");
						break;
					} else if (acoesLab[0].equalsIgnoreCase("cadastrarLab")) {
						gustavohdv.cadastraLaboratorio(acoesLab[1]);
						avisoln("Cadastrado no laboratório " + acoesLab[1] + " com sucesso.");
					} else if (acoesLab[0].equalsIgnoreCase("consumirEspaco")) {
						gustavohdv.consomeEspaco(acoesLab[1], Integer.parseInt(acoesLab[2]));
					} else if (acoesLab[0].equalsIgnoreCase("liberarEspaco")) {
						gustavohdv.liberaEspaco(acoesLab[1], Integer.parseInt(acoesLab[2]));
						avisoln("Total de " + acoesLab[2] + "MBytes liberados  no espaço do HD");
					} else if (acoesLab[0].equalsIgnoreCase("analisarLab")) {
						avisoln(gustavohdv.laboratorioToString(acoesLab[1]));
						if (gustavohdv.atingiuCota(acoesLab[1])) {
							avisoln("O limite de espaço no HD foi atingido. Libere espaço no HD.");
						} else {
							avisoln("O limite de espaço no HD não foi atingido.");
						}
					} else {
						avisoln("!!Comando não encontrado!! (sairCentralLab) para sair.");
					}
				}
			}
			
			/** Central de disciplinas */
			if (comando[0].equalsIgnoreCase("entrarCentralDisciplinas")) {
				avisoln("Você entrou na central das disciplinas. (sairCentralDisciplina) para sair.");
				while (true) {
					aviso("Disciplina: ");
					String[] acoesDisciplina = sc.nextLine().split(" ");
					
					if (acoesDisciplina[0].equalsIgnoreCase("manualDosEscoteiros")) {
						avisoln(manualDosEscoteiros);
					} else if (acoesDisciplina[0].equalsIgnoreCase("infoDisciplina")) {
						avisoln(infoLaboratorio);
					} else if (acoesDisciplina[0].equalsIgnoreCase("infoLaboratorio") || acoesDisciplina[0].equalsIgnoreCase("infoCantina") || acoesDisciplina[0].equalsIgnoreCase("infoSaude")) {
						avisoln("!!Você precisa sair da central de disciplinas para verificar o manual " + acoesDisciplina[0] + "!!");
					}
					
					if (acoesDisciplina[0].equalsIgnoreCase("sairCentralDisciplina")) {
						avisoln("Você saiu da central das disciplinas.");
						break;
					} else if (acoesDisciplina[0].equalsIgnoreCase("menu")) {
						avisoln(menu);
					} else if (acoesDisciplina[0].equalsIgnoreCase("cadastrarDisciplina")) {
						gustavohdv.cadastraDisciplina(acoesDisciplina[1]);
						avisoln("Cadastrado na disciplina " + acoesDisciplina[1] + " com sucesso.");
					} else if (acoesDisciplina[0].equalsIgnoreCase("cadastrarNota")) {
						gustavohdv.cadastraNota(acoesDisciplina[1], Integer.parseInt(acoesDisciplina[2]), Double.parseDouble(acoesDisciplina[3]));
						avisoln("Nota n°" + acoesDisciplina[2] + " cadastrada com sucesso.");
					} else if (acoesDisciplina[0].equalsIgnoreCase("aprovado")) {
						if (gustavohdv.aprovado(acoesDisciplina[1])) {
							avisoln("Parabéns!! você foi aprovado.");
						} else {
							avisoln("Você foi reprovado. Estude mais da próxima vez");
						}
					} else if (acoesDisciplina[0].equalsIgnoreCase("analisarDisciplina")) {
						avisoln(gustavohdv.disciplinaToString(acoesDisciplina[1]));
					} else if (acoesDisciplina[0].equalsIgnoreCase("cadastrarHoras")) {
						gustavohdv.cadastraHoras(acoesDisciplina[1], Integer.parseInt(acoesDisciplina[2]));
						avisoln("Horas de disciplina cadastradas com sucesso.");
					} else {
						avisoln("!!Comando não encontrado!! (sairCentralDisciplina) para sair.");
					}
				}
			}
			
			/** Central de cantinas  */
			if (comando[0].equalsIgnoreCase("entrarCentralCantinas")) {
				avisoln("Você entrou na central de cantinas. (sairCentralCantinas) para sair.");
				while (true) {
					aviso("Cantina: ");
					String[] acoesCantina = sc.nextLine().split(" ");
					
					if (acoesCantina[0].equalsIgnoreCase("manualDosEscoteiros")) {
						avisoln(manualDosEscoteiros);
					} else if (acoesCantina[0].equalsIgnoreCase("infoCantina")) {
						avisoln(infoCantina);
					} else if (acoesCantina[0].equalsIgnoreCase("infoLaboratorio") || acoesCantina[0].equalsIgnoreCase("infoDisciplina") || acoesCantina[0].equalsIgnoreCase("infoSaude")) {
						avisoln("!!Você precisa sair da central de cantinas para verificar o manual " + acoesCantina[0] + "!!");
					}
					
					if (acoesCantina[0].equalsIgnoreCase("sairCentralCantinas")) {
						avisoln("Você saiu da central de cantinas.");
						break;
					} else if (acoesCantina[0].equalsIgnoreCase("menu")) {
						avisoln(menu);
					} else if (acoesCantina[0].equalsIgnoreCase("cadastrarCantina")) {
						gustavohdv.cadastraCantina(acoesCantina[1]);
						avisoln("Cadastrado na cantina " + acoesCantina[1] + " com sucesso.");
					} else if (acoesCantina[0].equalsIgnoreCase("cadastrarLanche")) {
						gustavohdv.cadastraLanche(acoesCantina[1], Integer.parseInt(acoesCantina[2]), Integer.parseInt(acoesCantina[3]));
						avisoln("Lanche cadastrado com sucesso.");
					} else if (acoesCantina[0].equalsIgnoreCase("pagarConta")) {
						gustavohdv.pagarConta(acoesCantina[1], Integer.parseInt(acoesCantina[2]));
						avisoln("Você pagou " + acoesCantina[2] + " centavos para a cantina");
					} else if (acoesCantina[0].equalsIgnoreCase("quantoDeve")) {
						avisoln("Falta pagar " + gustavohdv.getFaltaPagar(acoesCantina[1]) + " centavos para a cantina");
					} else {
						avisoln("!!Comando não encontrado!! (sairCentralCantinas) para sair.");
					}
				}
			}
			
			/** Central de saúde */
			if (comando[0].equalsIgnoreCase("entrarHospital")) {
				avisoln("Você entrou no hospital. (sairHospital) para sair.");
				while (true) {
					aviso("Hospital: ");
					String[] acoesHospital = sc.nextLine().split(" ");
					
					if (acoesHospital[0].equalsIgnoreCase("manualDosEscoteiros")) {
						avisoln(manualDosEscoteiros);
					} else if (acoesHospital[0].equalsIgnoreCase("infoSaude")) {
						avisoln(infoSaude);
					} else if (acoesHospital[0].equalsIgnoreCase("infoLaboratorio") || acoesHospital[0].equalsIgnoreCase("infoDisciplina") || acoesHospital[0].equalsIgnoreCase("infoCantina")) {
						avisoln("!!Você precisa sair da central do hospital para verificar o manual " + acoesHospital[0] + "!!");
					}
					
					if (acoesHospital[0].equalsIgnoreCase("sairHospital")) {
						avisoln("Você saiu do hospital.");
						break;
					} else if (acoesHospital[0].equalsIgnoreCase("menu")) {
						avisoln(menu);
					} else if (acoesHospital[0].equalsIgnoreCase("estadoGeral")) {
						avisoln(gustavohdv.getStatusGeral());
					} else if (acoesHospital[0].equalsIgnoreCase("saudeFisica")) {
						gustavohdv.defineSaudeFisica(acoesHospital[1]);
						avisoln("A saúde física foi definida para: " + acoesHospital[1] + ".");
					} else if (acoesHospital[0].equalsIgnoreCase("saudeMental")) {
						gustavohdv.defineSaudeMental(acoesHospital[1]);
						avisoln("A saúde mental foi definida para: " + acoesHospital[1] + ".");
					} else {
						avisoln("!!Comando não encontrado!! (sairHospital) para sair.");
					}
				}
			}
		} 
	}	
}

