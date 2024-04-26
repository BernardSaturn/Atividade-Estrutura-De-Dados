package atividadesestruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao;

		do {
			System.out.println("\nDigite o número da opcção desejada: \n ");
			System.out.println("1 - Adicionar Cliente Na Fila ");
			System.out.println("2 - Listar Todos os Clientes ");
			System.out.println("3 - Retirar Cliente Da Fila ");
			System.out.println("0 - Sair ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente:");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nCliente adicionado com SUCESSO!\n");
				break;
				
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:\n");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
			    if (fila.isEmpty()) {
			        System.out.println("A fila está vazia.\n");
			    } else {
			        System.out.println("Digite o nome do cliente que deseja retirar:");
			        String clienteRemover = leia.nextLine();
			        boolean clienteRemovido = fila.remove(clienteRemover);

			        if (clienteRemovido) {
			            System.out.println("Cliente " + clienteRemover + " retirado da fila.");
			        } else {
			            System.out.println("Cliente não encontrado na fila.");
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
