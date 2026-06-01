package Atividade_Dia_a_Dia05.aplicativo;
import Atividade_Dia_a_Dia05.entidades.login;
import Atividade_Dia_a_Dia05.entidades.cardapio;
import Atividade_Dia_a_Dia05.entidades.produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite seu email");
        String email=sc.nextLine();
        System.out.println("Digite sua senha");
        String senha= sc.nextLine();
        login login=new login(email,senha);
        if (login.getEmail().isEmpty()){
            System.out.println("Usuários ou senha inválidos.");
            System.exit(0);
        }
        else {
            cardapio cardapio=new cardapio();
            ;
            for (produto )

        }
    }
}
