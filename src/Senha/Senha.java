package Senha;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha com no mínimo 8 caracteres!");
        String senha = scanner.nextLine();

        try{
            verificarSenha(senha);
            System.out.println("Senha.Senha verificada com sucesso!");
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

    private static void verificarSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException("Erro: A senha deve ter pelo menos 8 caracteres!!");
        }
    }
}
