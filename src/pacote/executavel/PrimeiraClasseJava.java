package pacote.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	/*main é um método em Java auto executável*/
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual é a idade? ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? ");
		String rg = JOptionPane.showInputDialog("Registro Geral? ");
		String cpf = JOptionPane.showInputDialog("Qual número do CPF? ");
		String mae = JOptionPane.showInputDialog("Nome da mãe? ");
		String pai = JOptionPane.showInputDialog("Nome do pai? ");
		String matricula = JOptionPane.showInputDialog("Qual número da matrícula? ");
		String serie = JOptionPane.showInputDialog("Qual é a série? ");
		String escola = JOptionPane.showInputDialog("nome da escola? ");
		
		
		/* new Aluno() é uma instância (Criação do objeto)*/
		/* aluno é uma referência para objeto aluno*/
		
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
		
		
		
		System.out.println(aluno.toString());/*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + aluno.getAlunoAprovado());
		
	}
}
