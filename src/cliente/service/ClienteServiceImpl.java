package cliente.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cliente.model.Cliente;

public class ClienteServiceImpl implements ClienteService {

	List<Cliente> clientes = new ArrayList<>();

	@Override
	public List<Cliente> listar() {
		System.out.println("-----Clientes cadastrados-----");

		System.out.println();
		
		if (!this.clientes.isEmpty()) {			
			for (int i = 0; i < clientes.size(); i++) {
				System.out.println(clientes.get(i).getNome());
			}
		}else {
			System.out.println("não existem clientes cadastrados");
		}
		
		return this.clientes;
	}

	@Override
	public void salvar(Cliente cliente) {

		System.out.println("------ Cadastro de  Cliente  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Cadastrar este cliente ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {
			Cliente clienteSalvo = cliente;

			clientes.add(cliente);
			System.out.println("----- Cliente cadastrado com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando o Cadastro de Cliente -----");
			System.out.println();
		}
	}

	@Override
	public void remover(Cliente cliente) {

		System.out.println("------ Remover Cliente  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Remover este cliente ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {

			clientes.remove(cliente);

			System.out.println("----- Cliente removido com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando a remocão de Cliente -----");
			System.out.println();
		}

		System.out.println("Removendo cliente da base de dados");
	}

	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void relizaChamada() {
		System.out.println("Realizando chamado...");

	}

}
