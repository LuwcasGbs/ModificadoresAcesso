package Aula04_09.Modificadores;

public class Cidade {
	private String nome;
	private Estado estado;
	
	public void estado() {
		estado = new Estado();
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
