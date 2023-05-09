package SistemaEscolar;
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
    
    public static cadastrar cadastro = new cadastrar();
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
            System.out.println("------ Menu ------");
            System.out.println("1 ---- Entrar Como Aluno ");
            System.out.println("2 ---- Consultar dados do aluno cadastrados");
            System.out.println("3 ---- Entrar como professor ");
            System.out.println("4 ---- entrar como diretor ");
            System.out.println("0 ---- Sair ");
            System.out.println("Informe sua opção : ");
            opcao = sc.nextInt();
           
            switch (opcao){
                case 1:
                	System.out.println("Ola Aluno realize o seu cadastro.");
                    cadastro.cadastrarAluno();
                    break;
                case 2:
                	System.out.println("Aqui estao seus dados : ");
                    cadastro.mostrar();
                    break;
                case 3:
                    if (professor1.fazerLogin() == true) {
                    	int opcao1 = 0;
                    	do {
                    		   System.out.println("------ Menu Professor -----");
                               System.out.println("1 ---- Consultar Alunos ");
                               System.out.println("2 ---- Mudar Nota ");
                               System.out.println("3 ---- Calculo de Salario");
                               System.out.println("0 ---- Voltar ao Menu Principal");
                               System.out.println("Digite a opcao que deseja : ");
                               opcao1 = sc.nextInt();
                               if (opcao1 == 1){
                                   cadastro.mostrar();
                               }else if(opcao1 == 2 ){
                                   cadastro.mudaNota();
                               } else if (opcao1 ==3) {
                               	professor1.Salario();
                               } 
                    	}while(opcao1 != 0);
                    }
                    break;
                case 4: 
                    if(diretor1.loginDiretor() == true) {
                    	int opcao2;
                    	do {
                    		 System.out.println("------ Menu Diretor ------");
                             System.out.println("1 ---- Consultar Alunos ");
                             System.out.println("2 ---- Consultar Professores ");
                             System.out.println("0 ---- Voltar ao Menu Principal");
                             System.out.println("Digite a opcao que deseja : ");
                              opcao2 = sc.nextInt();
                             if (opcao2 == 1){
                                 cadastro.mostrar();
                             }else if(opcao2 == 2 ){
                            	 professor1.consultarProfessores();
                             } 
                    	}while(opcao2 != 0);
                    }
                   
                    break;
                default:
                	if (opcao == 0) {
                		System.out.println("Encerrando Programa");
                	} else {
                		System.out.println("Opção invalida");
                	}
                    
            }
        }while (opcao != 0);
        
    }
}
