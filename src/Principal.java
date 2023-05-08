/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author rafae
 */

public class Principal {
    
    private static cadastrar cadastro = new cadastrar();
    public static void main(String[] args){
        
        
        Professor professor1 = new Professor();
        Diretor diretor1 = new Diretor();
        //Pessoa pessoa1 = new Pessoa ();
        
        //pessoa1.nome = "Rafael";
        //pessoa1.setNome("rafael");
        //pessoa1.idade = 24;
        //pessoa1.nota1 = 10;
        //pessoa1.nota2 = 7;
        //pessoa1.nota3 = 10;
        //pessoa1.rgm = 70192;
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("faça login no sistema ");
        //System.out.println("login : ");
        //String login1 = sc.nextLine();
        //System.out.println("senha : ");
        //int senha1 = sc.nextInt();
        //if (login1.equals(professor1.getLogin()) && senha1 == professor1.getSenha()) {
        //if (login1.equals(professor1.getLogin()) && senha1 == professor1.getSenha()){
        //    System.out.println("logado"); 
            
        int opcao = 0;
        do {
            System.out.println("--- Teste Menu ---");
            System.out.println("1 ---- Lançar notas no sistema ");
            System.out.println("2 ---- Consultar alunos ");
            //System.out.println("3 ---- Mudar nota ");
            System.out.println("4 ---- Entrar como professor ");
            System.out.println("5 ---- entrar como diretor ");
            //System.out.println("6 ---- entrar como aluno ");
            System.out.println("0 ---- Sair ");
            System.out.println("Informe sua opção : ");
            opcao = sc.nextInt();
           
            switch (opcao){
                case 1:
                    cadastro.cadastrarAluno();
                    break;
                    
                case 2:
                    cadastro.mostrar();
                    //pessoa1.mostrarPerfil();
                    break;
                case 3:
                    professor1.fazerLogin();
                    System.out.println("--- Teste Menu Professor ---");
                    System.out.println("1 ---- Consultar Alunos ");
                    //System.out.println("2 ---- Consultar Professores ");
                    System.out.println("2 ---- Mudar Nota ");
                    int opcao1 = sc.nextInt();
                    if (opcao1 == 1){
                        cadastro.mostrar();
                    }else if(opcao1 == 2 ){
                        cadastro.mudaNota();
                    } 
                    break;
                case 4: 
                    diretor1.loginDiretor();
                    System.out.println("--- Teste Menu Professor ---");
                    System.out.println("1 ---- Consultar Alunos ");
                    System.out.println("2 ---- Consultar Professores ");
                    System.out.println("3 ---- Mudar Nota ");
                    int opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        cadastro.mostrar();
                    }else if(opcao2 == 2 ){
                        cadastro.mudaNota();
                    }else if (opcao2 == 2){
                        professor1.consultarProfessores();
                    } 
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }while (opcao != 0);
        //}else{System.out.println("Login ou senha inválidos, tente novamente.");}
    }
}
