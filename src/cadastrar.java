
import java.util.ArrayList;
import java.util.Scanner;

public class cadastrar  {
    //static Pessoa pessoa1 = new Pessoa ();
    static ArrayList <Pessoa> pessoas = new ArrayList<>();
            
    public static void cadastrarAluno(){
        
        Pessoa pessoatemp = new Pessoa();
        
        System.out.println("Porfavor favor informe o nome do aluno : ");
        Scanner sc = new Scanner(System.in);
        //pessoa1.setNome(sc.nextLine());
        pessoatemp.setNome(sc.nextLine());
        System.out.println("Porfavor favor informe a primeira nota : ");
        pessoatemp.setNota1(sc.nextInt());
        System.out.println("Porfavor favor informe a segunda nota : ");
        pessoatemp.setNota2(sc.nextInt());
        System.out.println("Porfavor favor informe a terceira nota : ");
        pessoatemp.setNota3(sc.nextInt());
        System.out.println("Porfavor favor informe o RGM do aluno : ");
        pessoatemp.setRgm(sc.nextInt());
        pessoas.add(pessoatemp);
        
    }
    
    public void mostrar(){
        //pessoa1.mostrarPerfil();
        int i =0;
        for(Pessoa pessoa : pessoas){
            System.out.println("id do aluno: "+ i);
            pessoa.mostrarPerfil();
            i++;
        }
    }
    
    public void mudaNota(){
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o id do aluno que voce deseja alterar a nota: ");
        int id = sc.nextInt();
        if (pessoas.get(id)!= null){
            System.out.println("Qual nota voce deseja alterar ? ");
            int escolhaNota = sc.nextInt();
            if (escolhaNota == 1){
            System.out.println("Qual nota voce quer dar para " + pessoas.get(id).getNome());
            int novaNota = sc.nextInt();
            pessoas.get(id).setNota1(novaNota);
            }else if(escolhaNota == 2){
                System.out.println("Qual nota voce quer dar para " + pessoas.get(id).getNome());
                int novaNota = sc.nextInt();
                pessoas.get(id).setNota2(novaNota);
            }else if (escolhaNota == 3){
                System.out.println("Qual nota voce quer dar para " + pessoas.get(id).getNome());
                int novaNota = sc.nextInt();
                pessoas.get(id).setNota3(novaNota);
            } 
            
        }else{}
    }
    
}
