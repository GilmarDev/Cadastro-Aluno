package cursojava.classes;

/*Esta é a classe/objeto que representa Aluno*/
public class Aluno {
	
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	/*cria os dados na memoria - sendo padrão no java*/
	public Aluno() {
		
	}
	
	public Aluno(String nomePadrao) {
		nome =nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
