package SistemaEscolar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae
 */
public class Aluno extends Pessoa{
	private int rgm;
    private double nota1, nota2, nota3;
    private double media;
    
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	
	public void mostrarPerfil(){
        System.out.println("Nome: "+getNome());
        System.out.println("idade: "+ getIdade());
        System.out.println("rgm: "+ getRgm());
        System.out.println("Notas : "+ "Nota1: "+ getNota1()+ " Nota2: " + getNota2()+ " Nota3: " + getNota3());
        System.out.println("Media : " + MediaNotas());
        System.out.println("Status : " + SituacaoAprovamento());
    }
	
	public double MediaNotas() {
		return media = (getNota1() + getNota2() + getNota3()) / 3;
	}

	public String SituacaoAprovamento() {
		double media = this.MediaNotas();
		if (media >= 5) {
			if (media >= 7) {
				return statusAluno.APROVADO;
			} else {
				return statusAluno.RECUPERACAO;
			}
		} else {
			return statusAluno.REPROVADO;
		}
		
	}
		
}

