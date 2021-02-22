package pacote.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classesauxiliares.FuncaoAutentificacao;
import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* main � um m�todo em Java auto execut�vel */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		try {
			
			lerArquivo();
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutentificacao(new Diretor(login, senha))
					.autenticar()) {/* se TRUE acessa se False n�o acessa */

				List<Aluno> alunos = new ArrayList<Aluno>();
				/*
				 * � uma lista que dentro dela temos uma chave que identifica uma sequencia de
				 * valores
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual � a idade? "); 
				    
					/*String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? "); 
					String rg = JOptionPane.showInputDialog("Registro Geral? "); 
					String cpf = JOptionPane.showInputDialog("Qual n�mero do CPF? "); 
					String mae = JOptionPane.showInputDialog("Nome da m�e? ");
					String pai = JOptionPane.showInputDialog("Nome do pai? "); 
					String matricula = JOptionPane.showInputDialog("Qual data da matr�cula? "); 
				    String serie = JOptionPane.showInputDialog("Qual � a s�rie? "); 
					String escola = JOptionPane.showInputDialog("nome da escola? ");
													 
					 new Aluno() {} //� uma inst�ncia (Cria��o do objeto)*/
													 
					//aluno � uma refer�ncia para objeto aluno 
					Aluno aluno = new Aluno();

					aluno.setNome(nome);
					
					  aluno.setIdade(Integer.valueOf(idade));
					 /* aluno.setDataNascimento(dataNascimento); aluno.setRegistroGeral(rg);
					 * aluno.setNumeroCpf(cpf); aluno.setNomeMae(mae); aluno.setNomePai(pai);
					 * aluno.setDataMatricula(matricula); aluno.setSerieMatriculado(serie);
					 * aluno.setNomeEscola(escola);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno.getDisciplina().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

					if (escolha == 0) {/* Op��o SIM e Zero */

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
							aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
						}
					}
					alunos.add(aluno);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("-------------------lista dos Aprovados-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("O aluno " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado()
							+ " a m�dia foi : " + aluno.getMediaNota());

				}
				System.out.println("-------------------lista de Recupera��o-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("O aluno " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado()
							+ " a m�dia foi : " + aluno.getMediaNota());
				}
				System.out.println("-------------------lista dos Reprovados-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("O aluno " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado()
							+ " a m�dia foi : " + aluno.getMediaNota());

				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso n�o permitido ");
			}

		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			
			/* Imprimir erro no console Java */
			e.printStackTrace();

			/* Mensagem de erro ou causa */
			System.out.println(" Mensagem " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro " + e.getStackTrace()[pos].getClassName());
				saida.append("\n M�todo de erro " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro convers�o de n�mero " + saida.toString());
			
		}finally {/*Sempre e executado ocorrendo erros ou n�o*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo ");
		}
	}
	
	public static void lerArquivo() throws FileNotFoundException {
		
		File file = new File(" arquivo.txt");
		Scanner scanner = new Scanner(file);
		
	}

}
