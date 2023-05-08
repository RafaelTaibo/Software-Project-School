
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
    private String login = "andrea";
    private int senha = 123;
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    public void fazerLogin(){
        //professor professor1 = new Professor();
        Scanner sc = new Scanner(System.in);
        System.out.println("login : ");
        String login1 = sc.nextLine();
        System.out.println("senha : ");
        int senha1 = sc.nextInt();
        //if (login1.equals(professor1.getLogin()) && senha1 == professor1.getSenha()) {
        if (login1.toLowerCase().equals(getLogin().toLowerCase()) && senha1 == getSenha()){
            System.out.println("logado"); 
        }else{
            System.out.println("Login ou senha inválidos, tente novamente.");
        }
        
    }
    public void consultarProfessores(){
        System.out.println("Professor cadastrados no sistema : ");
        System.out.println("Professor : " + login );
    }
    
}
