
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
    private String login = "renata";
    private int senha = 1234;

    public String getLogin() {
        return login;
    }

    public int getSenha() {
        return senha;
    }
    
    public void loginDiretor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        String login1 = sc.nextLine();
        System.out.println("Password : ");
        int password = sc.nextInt();
        if (login1.toLowerCase().equals(getLogin().toLowerCase()) && password == getSenha()){
            System.out.println("logado"); 
        } else {System.out.println("Login ou senha inválidos, tente novamente.");}
    }
    
}
