package SistemaEscolar;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastrar  {
    //static Pessoa pessoa1 = new Pessoa ();
    static ArrayList <Aluno> alunos = new ArrayList<Aluno>();
            
    public void cadastrarAluno(){
    	Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Por favor favor informe o nome do aluno : ");
        aluno.setNome(sc.nextLine());
        System.out.println("Por favor favor informe o RGM do aluno : ");
        aluno.setRgm(sc.nextInt());
        System.out.println("Por favor informe a idade do aluno : ");
        aluno.setIdade(sc.nextInt());
        System.out.println("Por favor favor informe a primeira nota : ");
        aluno.setNota1(sc.nextInt());
        System.out.println("Por favor favor informe a segunda nota : ");
        aluno.setNota2(sc.nextInt());
        System.out.println("Por favor favor informe a terceira nota : ");
        aluno.setNota3(sc.nextInt());
        
        alunos.add(aluno);
        
    }
    
    public void mostrar(){
        //pessoa1.mostrarPerfil();
        int i =0;
        for(Aluno aluno : alunos){
        	System.out.println("-------------------------------------");
            System.out.println("id do aluno: "+ i);
            aluno.mostrarPerfil();;
            i++;
            System.out.println("-------------------------------------");
        }
    }
    
    public void mudaNota(){
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o id do aluno que voce deseja alterar a nota: ");
        int id = sc.nextInt();
        if (alunos.get(id)!= null){
            System.out.println("Qual nota voce deseja alterar ? ");
            int escolhaNota = sc.nextInt();
            if (escolhaNota == 1){
            System.out.println("Qual nota voce quer dar para " + alunos.get(id).getNome());
            int novaNota = sc.nextInt();
            alunos.get(id).setNota1(novaNota);
            }else if(escolhaNota == 2){
                System.out.println("Qual nota voce quer dar para " + alunos.get(id).getNome());
                int novaNota = sc.nextInt();
                alunos.get(id).setNota2(novaNota);
            }else if (escolhaNota == 3){
                System.out.println("Qual nota voce quer dar para " + alunos.get(id).getNome());
                int novaNota = sc.nextInt();
                alunos.get(id).setNota3(novaNota);
            } 
            
        }else{}
    }
    
}
