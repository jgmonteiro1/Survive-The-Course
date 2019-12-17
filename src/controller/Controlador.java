package controller;

public class Controlador {
	
	private String nome;
	private int pontuacao;

	public Controlador () {
		
	}
	
	
	
	public Controlador(String nome) {
		this.nome = nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}
	
	public boolean testePraVerSeVoceEhMedroso(boolean fugiu) {
		if(fugiu == true) {
			fugiu = true;
		} else {
			fugiu = false;
		}
		return fugiu;
	}
	
}
