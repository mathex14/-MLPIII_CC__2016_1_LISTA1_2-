package Mini_App;

import java.util.Comparator;

public class Aluno extends Pessoa implements Comparator<Aluno> {
	
	private double media;
	private int faltas;
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return super.getMatricula();
	}
	
	@Override
	public void setMatricula(String matricula) {
		// TODO Auto-generated method stub
		super.setMatricula(matricula);
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	

	@Override
	public String toString() {
		return "\nAluno [nome=" + nome + ", matricula=" + matricula + ", media=" + media + ", faltas=" + faltas + "]";
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
	

}
