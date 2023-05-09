package SistemaEscolar;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae
 */
public class Professor extends Pessoa{
    private String login;
    private String senha;
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public boolean fazerLogin(){
        //professor professor1 = new Professor();
        Scanner sc = new Scanner(System.in);
        System.out.println("login : ");
         login = sc.next();
        System.out.println("senha : ");
         senha = sc.next();
        if (login.equalsIgnoreCase("andrea") && senha.equalsIgnoreCase("123")) {
            System.out.println("logado"); 
            return true;
        }else{
        	System.out.println("Login ou senha inválidos, tente novamente.");
            return false;
        }
        
    }
    public void consultarProfessores(){
        System.out.println("Professor cadastrados no sistema : ");
        System.out.println("Professor : " + login );
    }
    
    public void Salario() {
    	Scanner sc = new Scanner(System.in);
    	int horasTrabalhadas = 0;
    	double valorHora = 0;
    	double salario;
    	
    	System.out.println("Digite o valor de sua hora de trabalho");
    	valorHora = sc.nextDouble();
    	System.out.println("Digite a quantidade de horas trabalhas no mes");
    	horasTrabalhadas = sc.nextInt();
    	
    	salario = valorHora * horasTrabalhadas;
    	System.out.println("Salario : " + salario);
    }
}
