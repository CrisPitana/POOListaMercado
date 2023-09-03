package app;

import java.util.Scanner;
public class Program {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ListaDeCompras l1 = new ListaDeCompras();
		int continuar;
		
		int op;
		
		do {
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Visualizar Produto");
			System.out.println("3 - Ver Qtde Produto");
			System.out.println("4 - Apagar todos os Produtos");
			System.out.println("5 - Ver total de compras");
			System.out.println("0 - Sair");
			
			op = sc.nextInt();
			
			switch (op) {
			
			case 1:		// CADASTRAR PRODUTOS
				do {
					Produto p1 = new Produto();
					System.out.println("Digite o produto: ");
					sc.nextLine();
					p1.setNome(sc.nextLine());
					
					do {
						System.out.println("Quantidade: ");
						p1.setQtde(sc.nextInt());
						if (p1.getQtde()<=0) System.out.println("Erro Quantidade invalida");
													
					} while (p1.getQtde()<=0);
				
				
					do {
						System.out.println("Valor Unitário: ");
						p1.setValorUnitario(sc.nextFloat());
						if (p1.getValorUnitario()<=0) System.out.println("Erro Valor invalido");
				
					} while (p1.getValorUnitario()<=0);
		
					l1.adicionarProduto(p1);
					System.out.println("Produto adicionado a Lista! \n Adicionar mais itens à lista ? 0 - Sim  1 - Não");
					continuar = sc.nextInt(); 
				
				} while (continuar == 0);
				
				break;
				
				
			case 2:		// VISUALIZAR PRODUTOS
				if (l1.getLista().isEmpty()) System.out.println("Não há Produtos");
				else l1.toString();
				
				break;
				
				
			case 3:		//VER QTDE DE PRODUTOS
				System.out.println("Total de cadastros : " 
						          + l1.obterQtdeProdutos());
				break;
				
				
			case 4:		//APAGAR TODOS OS PRODUTOS
				if   (l1.getLista().isEmpty()) System.out.println("Não há produtos para excluir?");
				else  l1.limparLista();
				
				break;
						

			case 5:		//VER TOTAL DE COMPRAS
				l1.calcularTotalDaLista();
				break;
	
				
		    case 0: 		//FINALIZAR
			    System.out.println("Sistema Finalizado");
			    return;
			    
			default:
				System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");
			}	
			
		} while (op != 0);
				
		sc.close();
	}

}
