/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae
 */
public class Pessoa {
    private String nome;
    private int idade;
    private int rgm;
    private int nota1, nota2, nota3;
    private int media;

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    
    public void mostrarPerfil(){
        
        System.out.println("Nome: "+ nome);
        // System.out.println("idade: "+ idade);
        System.out.println("rgm: "+ rgm);
        System.out.println("Notas : "+ "Nota1: "+ nota1+ " Nota2: " + nota2+ " Nota3: " + nota3);
        media = (nota1 + nota2 + nota3)/3;
        System.out.println("Media : " + media);
    }
    
    
}
