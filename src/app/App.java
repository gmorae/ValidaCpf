package app;

import java.util.Scanner;
import app.Cpf;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
        // usando os metodos isCPF() e imprimeCPF() da classe "Cpf"
        if (Cpf.isCPF(CPF) == true)
            System.out.printf("%s\n", Cpf.imprimeCPF(CPF));
        else
            System.out.printf("Erro, CPF invalido !!!\n");
    }
}