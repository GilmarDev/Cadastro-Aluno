package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Vixxx erro ao processamento das notas do aluno" + erro);
	}

}
