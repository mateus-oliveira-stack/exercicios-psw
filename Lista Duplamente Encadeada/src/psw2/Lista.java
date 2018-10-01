package psw2;

public class Lista {
	private No inicio;
	private No fim;
	private int qtd;
	
	public Lista() {
		this.inicio = null;
		this.fim = null;
		this.qtd = 0;
	}
	
	public void inserirInicio(Aluno al) {
		No novo = new No();
		novo.setDados(al);
		if(this.inicio == null) {
			this.inicio = novo;
			this.fim = novo;
			novo.setProx(null);
		}
		else {
			novo.setProx(this.inicio);
			this.inicio.setAnt(novo);
			this.inicio = novo;
		}
		novo.setAnt(null);
		this.qtd++;
	}
	
	public void inserirFinal(Aluno al) {
		No novo = new No();
		novo.setDados(al);
		novo.setProx(null);
		if(this.inicio == null) {
			this.inicio = novo;
			this.fim = novo;
			novo.setAnt(null);
		}
		else {
			novo.setAnt(this.fim);
			this.fim.setProx(novo);
			this.fim = novo;
		}
		this.qtd++;
	}
	
	public void removerInicio() {
		if(this.inicio != null) { //lista não está vazia
			if(this.inicio.getProx() == null) {//lista com apenas 1 elemento
				this.inicio = null;
				this.fim = null;
			}
			else {//lista com mais de 1 elemento
				this.inicio = this.inicio.getProx();
				this.inicio.setAnt(null);
			}
			this.qtd--;
		}
	}
	
	public void removerFinal() {
		if(this.inicio != null) {//lista não está vazia
			if(this.fim.getAnt() == null) {//lista com apenas 1 elemento
				this.inicio = null;
				this.fim = null;
			}
			else {//lista com mais de 1 elemento
				this.fim.getAnt().setProx(null);
				this.fim = this.fim.getAnt();
			}
			this.qtd--;
		}
	}
	
	public void imprimeLista() {
		No novo = this.inicio;
		while(novo != null) {
			System.out.println("Matricula: " + novo.getDados().getMatricula());
			System.out.println("Nome: " + novo.getDados().getNome());
			System.out.printf("\n");
			novo = novo.getProx();		
		}
	}
}
