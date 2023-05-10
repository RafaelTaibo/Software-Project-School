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
public class Diretor extends Pessoa{
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    public boolean loginDiretor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
         login = sc.nextLine();
        System.out.println("Senha : ");
         senha = sc.nextLine();
        if (login.equalsIgnoreCase("renata") && senha.equalsIgnoreCase("1234")){
            System.out.println("logado"); 
            return true;
        } else {
        	System.out.println("Login ou senha inválidos, tente novamente.");
        	return false;
        }
    }
    
}
