package psw2;

public class Principal {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		
		aluno1.setMatricula(1);
		aluno1.setNome("Mateus1");
		
		aluno2.setMatricula(2);
		aluno2.setNome("Mateus2");
		
		aluno3.setMatricula(3);
		aluno3.setNome("Mateus3");
		
		aluno4.setMatricula(4);
		aluno4.setNome("Mateus4");
		
		aluno5.setMatricula(5);
		aluno5.setNome("Mateus5");
		
		lista.inserirFinal(aluno1);
		lista.inserirInicio(aluno1);
		lista.inserirFinal(aluno2);
		lista.inserirInicio(aluno2);
		lista.inserirFinal(aluno3);
		lista.inserirInicio(aluno3);
		lista.inserirFinal(aluno4);
		lista.inserirInicio(aluno4);
		lista.inserirFinal(aluno5);
		lista.inserirInicio(aluno5);		
		
		lista.imprimeLista();
	}

}
