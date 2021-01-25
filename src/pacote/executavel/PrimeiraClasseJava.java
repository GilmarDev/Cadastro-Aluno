package pacote.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* main é um método em Java auto executável */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual é a idade? "); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento? "); String
			 * rg = JOptionPane.showInputDialog("Registro Geral? "); String cpf =
			 * JOptionPane.showInputDialog("Qual número do CPF? "); String mae =
			 * JOptionPane.showInputDialog("Nome da mãe? "); String pai =
			 * JOptionPane.showInputDialog("Nome do pai? "); String matricula =
			 * JOptionPane.showInputDialog("Qual data da matrícula? "); String serie =
			 * JOptionPane.showInputDialog("Qual é a série? "); String escola =
			 * JOptionPane.showInputDialog("nome da escola? ");/*
			 * 
			 * /* new Aluno() é uma instância (Criação do objeto)
			 */
			/* aluno é uma referência para objeto aluno */

			Aluno aluno = new Aluno();

			aluno.setNome(nome);
			/*
			 * aluno.setIdade(Integer.valueOf(idade));
			 * aluno.setDataNascimento(dataNascimento); aluno.setRegistroGeral(rg);
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

			if (escolha == 0) {/* Opção SIM e Zero */

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

		for (int pos = 0; pos < alunos.size(); pos ++) {

			Aluno aluno = alunos.get(pos);

			if (aluno.getNome().equalsIgnoreCase("alex")) {

				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(96);

				trocar.getDisciplina().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);

			}
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Media Aluno = " + aluno.getMediaNota());
			System.out.println("Resultado: " + aluno.getAlunoAprovado());
			System.out.println("---------------------------------------------------");

			for (int posd = 0; posd < aluno.getDisciplina().size(); posd++) {

				Disciplina disc = aluno.getDisciplina().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + " Nota: " + disc.getNota());

			}

		}

	}
}
