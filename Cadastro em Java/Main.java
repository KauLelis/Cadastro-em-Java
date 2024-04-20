import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Cadastro de Pessoas");
        System.out.println("============================");
        System.out.print("\nDigite quantas pessoas irá cadastrar: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        CadastroPessoas cadastro = new CadastroPessoas(quantidade);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nPessoa " + (i + 1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, idade);
            cadastro.adicionarPessoa(pessoa);
            System.out.println("Pessoa adicionada com sucesso!");
        }

        System.out.println("\n============================");
        System.out.println("Resultados");
        System.out.println("============================");
        System.out.println("\nPessoa mais velha: " + cadastro.getPessoaMaisVelha());
        System.out.println("Pessoa mais nova: " + cadastro.getPessoaMaisNova());

        cadastro.ordenarPorIdade();
        System.out.println("\nOrdem por idade:");
        cadastro.listarPessoas();

        scanner.close();
    }
}
