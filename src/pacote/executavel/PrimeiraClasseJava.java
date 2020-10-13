package pacote.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

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
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1? ");
		String nota1 = JOptionPane.showInputDialog("Insira a nota 1 ");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2? ");
		String nota2 = JOptionPane.showInputDialog("Insira a nota 2 ");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3? ");
		String nota3 = JOptionPane.showInputDialog("insira a nota 3 ");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4? ");
		String nota4 = JOptionPane.showInputDialog("Insira a nota 4 ");
		
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
		
		
		System.out.println(aluno.toString());/*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + aluno.getAlunoAprovado());
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCpf("1234");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais ");
		}else {
			System.out.println("Alunos não iguais ");
		}
	}
}
