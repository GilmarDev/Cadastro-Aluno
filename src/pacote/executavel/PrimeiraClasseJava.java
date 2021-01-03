package pacote.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	/*main � um m�todo em Java auto execut�vel*/
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual � a idade? ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? ");
		String rg = JOptionPane.showInputDialog("Registro Geral? ");
		String cpf = JOptionPane.showInputDialog("Qual n�mero do CPF? ");
		String mae = JOptionPane.showInputDialog("Nome da m�e? ");
		String pai = JOptionPane.showInputDialog("Nome do pai? ");
		String matricula = JOptionPane.showInputDialog("Qual n�mero da matr�cula? ");
		String serie = JOptionPane.showInputDialog("Qual � a s�rie? ");
		String escola = JOptionPane.showInputDialog("nome da escola? ");
		
		
		/* new Aluno() � uma inst�ncia (Cria��o do objeto)*/
		/* aluno � uma refer�ncia para objeto aluno*/
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		aluno.setRegistroGeral(rg);
		aluno.setNumeroCpf(cpf);
		aluno.setNomeMae(mae);
		aluno.setNomePai(pai);
		aluno.setSerieMatriculado(matricula);
		aluno.setSerieMatriculado(serie);
		aluno.setNomeEscola(escola);
		
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina =JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina =JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));;
			
		
			aluno.getDisciplina().add(disciplina);
		}
		
		
		
		System.out.println(aluno.toString());/*Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + aluno.getAlunoAprovado());
		
	}
}
