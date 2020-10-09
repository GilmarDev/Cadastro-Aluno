package pacote.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/*main é um método em Java auto executável*/
	public static void main(String[] args) {
		
		
		/* new Aluno() é uma instância (Criação do objeto)*/
		/* aluno1 é uma referência para objeto aluno*/
		
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
		String nota1 = JOptionPane.showInputDialog("Insira a nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Insira a nota 2 ");
		String nota3 = JOptionPane.showInputDialog("insira a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Insira a nota 4 ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setSerieMatriculado(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Nome da escola = " + aluno1.getNomeEscola());
		System.out.println("Aluno média nota " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		/*===========================================================*/
		System.out.println("==========================================");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/09/1970");
		
		System.out.println("Aluno 2 Nome é = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade é = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento = " + aluno2.getDataNascimento());
	
		
	/*====================================================================*/
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("João");
	}

}
