package atividadesestruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> nomes = new Stack<String>();

		int opcao;

		do {
			System.out.println("\nDigite o número da opcção desejada: \n ");
			System.out.println("1 - Adicionar Livro na pilha ");
			System.out.println("2 - Listar todos os Livros ");
			System.out.println("3 - Retirar Livro da pilha ");
			System.out.println("0 - Sair ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				String nome = leia.nextLine();
				nomes.push(nome);
				System.out.println("\nLivro adicionado com SUCESSO!\n");
				break;

			case 2:
				if (nomes.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("livros na pilha:\n");
					for (String cliente : nomes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
			    if (nomes.isEmpty()) {
			        System.out.println("A pilha está vazia.\n");
			    } else {
			        System.out.println("Digite o nome do livro que deseja remover:");
			        String livroRemover = leia.nextLine();
			        boolean livroRemovido = nomes.remove(livroRemover);

			        if (livroRemovido) {
			            System.out.println("Livro " + livroRemover + " retirado da pilha.");
			        } else {
			            System.out.println("Livro não encontrado na pilha.");
			        }
			    }
			    break;
			case 0:
				System.out.println("Saindo do programa");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
				break;
			}

		} while (opcao != 0);

		leia.close();
	}

}
