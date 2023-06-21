package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Teste teste = new Teste();

        String nome=teste.digiteSeuNome(scanner);
        System.out.println(nome);
    }

}