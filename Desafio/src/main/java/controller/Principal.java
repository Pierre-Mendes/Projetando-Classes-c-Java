package controller;

import modelo.Cliente;
import modelo.Carro;
import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		//read the inputs
		java.util.Scanner input = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println(" *** CADASTRO DE CLIENTES *** ");
		System.out.println(" ===============================");
		
		System.out.println("Insira o nome do cliente: ");
		String name = input.next();
		
		System.out.println("Qual o endereço do Cliente? ");
		String adress = input.next();
		
		System.out.println("Qual o e-mail do Cliente? ");
		String email = input.next();
		
		System.out.println("Qual o telefone do Cliente? ");
		String phone = input.next();

		cliente.setId(1);
		cliente.setAdress("Rua XXX, N° XXX");
		cliente.setName("Name");
		cliente.setEmail("xxx.xxx@xxx.xx");
		cliente.setPhone(123456789);

		Carro carro = new Carro();
		
		System.out.println("Qual a placa do veículo?");
		String placa = input.next();

		System.out.println("Qual o modelo do veículo?");
		String modelo = input.next();
		
		System.out.println("Qual o ano do veículo?");
		String ano = input.next();
		
		System.out.println("Qual o fabricante do veículo?");
		String fabricante = input.next();
		
		System.out.println("Qual a cor do veículo?");
		String cor = input.next();
		
		carro.setPlaca("XXX-1234");
		carro.setModelo("Example");
		carro.setAno(1);
		carro.setFabricante("Example");
		carro.setCor("example");
		
		input.close();
		
		System.out.println("Nome do Cliente:" + name);
		System.out.println("E-mail do Cliente:" + email);
		System.out.println("Endereço do Cliente:" + adress);
		System.out.println("Telefone do Cliente:"+ phone);
		
		System.out.println("Carro do Cliente:"+ modelo);
		System.out.println("Cor do Carro:"+ cor);
		System.out.println("Emplacamento do Carro:"+ placa);
		System.out.println("Ano de fabricação do Carro:"+ ano);
		System.out.println("Faabricante do Carro:"+ fabricante);	
	}	
}
