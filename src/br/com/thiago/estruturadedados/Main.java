package br.com.thiago.estruturadedados;

import java.util.Scanner;

import br.com.thiago.estruturadedados.modelos.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite a op��o desejada");
		System.out.println("1.Gerenciamento de mem�ria");
		Scanner scanner = new Scanner(System.in);
	
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
				break;
			
		}
		scanner.close();
		}
	
	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("=============");
		System.out.println(a);
		System.out.println(b);
		System.out.println("****************");
		Pessoa p1 = new Pessoa(1, "Tiago");
		System.out.println(p1.toString());
		Pessoa p2 = p1;
		System.out.println(p2.toString());
		System.out.println("////////////");
		p2.setNome("Thiago modificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
