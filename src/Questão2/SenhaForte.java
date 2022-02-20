package Questão2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SenhaForte {
    public static void main(String[] args) {
        String password = "Ya3&ab";
        //expressão regular para criação da senha
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,}";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);

        System.out.println(m.matches());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Login:"); //input para criar login
        String login = scanner.next();
        System.out.println("Sua senha deve ter no mínimo 1 digito, 1 letra minúscula, 1 letra maiúscula, 1 caractere especial.Os caracteres especiais são: !@#$%^&*()-+ \nCrie sua Senha:"); //input para criar senha
        String senha = scanner.next();


        //condições para verificar se senha contém o que se pede
        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,}")) {
            //vai imprimir na tela se o usuario seguir as instruções para criação de senha
            System.out.println("Cadastro realizado com sucesso");
        }
        else {
            //vai imprimir na tela essa mensagem caso o usuario não seguiu as instruções de criação de senha
            System.out.println("Senha fraca. Lembre-se que sua senha deve ter no mínimo 1 digito, 1 letra minúscula, 1 letra maiúscula, 1 caractere especial.Os caracteres especiais são: !@#$%^&*()-+ ");
        }
    }
}

