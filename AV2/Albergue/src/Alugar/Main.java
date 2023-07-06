package Alugar;

import java.util.*;
//import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		int op;
		
		while(op!=5) {
			menu(1);
			Scanner sc = new Scanner (System.in);
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					AdmnistrarQuarto();
				break;
				case 2:
					AdmnistrarCliente();
				break;
				case 3:
					AdmnistrarCama();
				break;
				case 4:
					AdmnistrarReserva();
				break;
				default:
					System.out.println("Opcao invalida");
				break;
			}
		}
	}
	public static void menu(int op){
		
		if(op == 1) {
			System.out.println("\nEscolha uma das opcoes para prosseguir\n");
			System.out.println("1 para Admnistrar os Quartos\n");
			System.out.println("2 para Admnistrar os Clientes\n");
			System.out.println("3 para Admnistrar as Camas\n");
			System.out.println("4 para Admnistrar as Reservas\n");
			System.out.println("5 para Sair\n");
		}
		else {
			System.out.println("\nEscolha uma das opcoes para prosseguir\n");
			System.out.println("1 Incluir\n");
			System.out.println("2 Excluir\n");
			System.out.println("3 Alterar\n");
			System.out.println("4 Listar\n");
			System.out.println("5 para Sair\n");
		}
		
	}
	

}
