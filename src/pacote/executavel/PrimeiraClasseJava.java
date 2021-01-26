package pacote.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* main é um método em Java auto executável */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

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

		for (Aluno aluno : alunos) {
			
			if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else
			if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			}else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)){
				alunosReprovados.add(aluno);
			}
			
		}
		
		System.out.println("-------------------lista dos Aprovados-------------------------");
			for (Aluno aluno : alunosAprovados) {
				System.out.println("O aluno " + aluno.getNome() + " teve resultado = " 
								+ aluno.getAlunoAprovado() + " a média foi : " + aluno.getMediaNota());
				
			}
		System.out.println("-------------------lista dos Reprovados-------------------------");
			for (Aluno aluno : alunosReprovados) {
				System.out.println("O aluno " + aluno.getNome() + " teve resultado = " 
								+ aluno.getAlunoAprovado() + " a média foi : " + aluno.getMediaNota());
	}
		System.out.println("-------------------lista de Recuperação-------------------------");
			for (Aluno aluno : alunosRecuperacao) {
				System.out.println("O aluno " + aluno.getNome() + " teve resultado = " 
								+ aluno.getAlunoAprovado() + " a média foi : " + aluno.getMediaNota());

}
			
	}
}
