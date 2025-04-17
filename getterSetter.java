//crie um codigo que o usuario possa digitar seus dados e retorne pra ele tratado
import java.util.Scanner;

class Usuario{
    private String name;
    private int age;

    //setter
    public void setName(String name){
        this.name=name;
    }

    public void setIdade(int age){
        this.age=age;
    }

    //getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class getter{
    public static void main(String[]args){
        Usuario user = new Usuario();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scan.nextLine();
        user.setName(name);

        System.out.print("Digite idade: ");
        int age = scan.nextInt();
        user.setIdade(age);

        System.out.print("Nome:"+user.getName()+"\n"+"Idade:"+user.getAge());

    }
}
