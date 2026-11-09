import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // PARTE 1 - TABUADA COM WHILE
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        int contador = 1;

        System.out.println("\nTabuada do " + numero + ":");

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }

        // Limpa o buffer do teclado
        scanner.nextLine();

        // PARTE 2 - MENU COM DO-WHILE
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite uma palavra ou frase: ");
                String texto = scanner.nextLine();

                System.out.println("Você digitou: " + texto);

            } else if (opcao == 2) {
                System.out.println("Encerrando o programa. Até logo!");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 2);

        scanner.close();
    }
}