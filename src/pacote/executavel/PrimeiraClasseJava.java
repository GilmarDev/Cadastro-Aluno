package pacote.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/*main � um m�todo em Java auto execut�vel*/
	public static void main(String[] args) {
		
		
		/* new Aluno() � uma inst�ncia (Cria��o do objeto)*/
		/* aluno1 � uma refer�ncia para objeto aluno*/
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(33);
		aluno1.setDataNascimento("10/09/1987");
		aluno1.setRegistroGeral("003.899.456-9");
		aluno1.setNumeroCpf("124.670.567-90");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setSerieMatriculado("10/09/2000");
		aluno1.setSerieMatriculado("5�");
		aluno1.setNomeEscola("Escola JDEV treinamento");
		
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(79.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Nome da escola = " + aluno1.getNomeEscola());
		System.out.println("Aluno m�dia nota " + aluno1.getMediaNota());
	
		/*===========================================================*/
		System.out.println("==========================================");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/09/1970");
		
		System.out.println("Aluno 2 Nome � = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade � = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento = " + aluno2.getDataNascimento());
	
		
	/*====================================================================*/
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jo�o");
	}

}
