/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;
    
public class Main {

    private static final int MAX_TENTATIVAS = 10;  // Número máximo de tentativas

    public static void main(String[] args) {
        System.out.println("𝕤𝕖𝕔𝕣𝕖𝕥 𝕟");
        Scanner scanner = new Scanner(System.in);
        Random randomizacao = new Random();

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine().trim();
        System.out.println("\nOlá, " + nome + "! Vamos jogar.");

        boolean continuar = true;

        while (continuar) {
            int numeroSorte = randomizacao.nextInt(100) + 1;  // Número aleatório entre 1 e 100
            int tentativas = 0;
            boolean acertou = false;

            while (tentativas < MAX_TENTATIVAS && !acertou) {
                System.out.print("Qual é o seu palpite? (entre 1 e 100): ");
                int tentativa = scanner.nextInt();
                tentativas++;

                if (tentativa < numeroSorte) {
                    System.out.println("O número da sorte é maior!");
                } else if (tentativa > numeroSorte) {
                    System.out.println("O número da sorte é menor!");
                } else {
                    acertou = true;
                    System.out.println("Parabéns, " + nome + "! Você acertou o número da sorte em " + tentativas + " tentativas.");
                }
            }

            if (!acertou) {
                System.out.println("Você não conseguiu adivinhar o número da sorte. Era " + numeroSorte + ".");
            }

            // Pergunta se o usuário quer jogar novamente
            System.out.print("Quer jogar novamente? (s/n): ");
            char resposta = scanner.next().trim().toLowerCase().charAt(0);
            continuar = (resposta == 's');
        }

        System.out.println("Obrigado por jogar, " + nome + "!");
        scanner.close();
    }
}