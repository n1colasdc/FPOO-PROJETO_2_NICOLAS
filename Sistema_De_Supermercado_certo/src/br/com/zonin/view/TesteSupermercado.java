package SistemaDeGerenciamentoDeSupermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Aula_04_09.Livro;

public class TesteSupermercado {


	public static void main(String[] args) {
		
		String opcao;
		int op;
		do {
			opcao = JOptionPane.showInputDialog("Selecione uma opcao:"+"\n 1- Area do estoque; "+"\n 2- Area do Funcionario; "+ "\n 3- Area de informacao da empresa; "+"\n 0- sair.");
			op=Integer.parseInt(opcao);
			switch (op) {
			case 0:
					JOptionPane.showMessageDialog(null, "saindo do programa...");
			break;
			
			case 1:
				System.out.println("opcao 1 Estoque selecionado !!!");
				
				//inserir dados do produto1
				String nome1= JOptionPane.showInputDialog("digite o nome do produto: ");
				String valor1 =JOptionPane.showInputDialog("digite o valor do produto: ");
				float v1 = Float.parseFloat(valor1);
				String quant1 = JOptionPane.showInputDialog("digite a quantidade do produto: ");
				int q1=Integer.parseInt(quant1);
				
				
				//criando o 1° produto
				Produto p1 = new Produto(nome1,v1,q1);
				
				
				//inserir dados do produto2
				String nome2 =JOptionPane.showInputDialog("digite o nome do produto: ");
				String valor2 = JOptionPane.showInputDialog("digite o valor do produto: ");
				float v2= Integer.parseInt(valor2);
				String quant2 = JOptionPane.showInputDialog("digite a quantidade do produto: ");
				int q2 = Integer.parseInt(quant2);
				
				
				//criando o 2° produto
				Produto p2 = new Produto(nome2, v2, q2);
				
				
				//inserir dados do produto2
				String nome3 = JOptionPane.showInputDialog("digite o nome do produto: ");
				String valor3 = JOptionPane.showInputDialog("digite o valor do produto: ");
				float vl3 = Integer.parseInt(valor3);
				String quant3=JOptionPane.showInputDialog("digite a quantidade do produto: ");
				int q3=Integer.parseInt(quant3);
				Produto p3= new Produto(nome3,vl3, q3);
				
				
				//criando o 3° produto
				
				
				//criando lista vazia
				
				
				List<Produto> list_produto = new ArrayList<Produto>();
				
				
				//adicionando produtos na lista vazia
				list_produto.add(p1);
				list_produto.add(p2);
				list_produto.add(p3);
				
				
				
				for (Produto pr : list_produto) {
					JOptionPane.showMessageDialog(null, "nome: "+ pr.getNome() + "\n"+ "valor: "+ pr.getValor() + "\n" +"quantidade: "+ pr.getQuant());
				
				}
				
				
				//calculando quantidade total
				int quantidadeTotal = q1 + q2 + q3; 
				float valorTotalDoEstoque = v1*q1+v2*q1+vl3*q3;
				
				
				//criando estoque
				Estoque e1 = new Estoque(list_produto,200);
				
				
				//criando lista para ver oque tem no estoque
				List<Produto> pr1 = e1.exibir();
				
					for (Produto pro : pr1) {
						JOptionPane.showMessageDialog(null, "No estoque possui: "+ pro.getNome() + " do valor: "+ pro.getValor()
						+ " e "+ pro.getQuant()+" unidades");
							
				}
				
					
					JOptionPane.showMessageDialog(null, ("tendo no estoque o total de: "+ quantidadeTotal +" produtos"+" Avaliados em: "+ valorTotalDoEstoque+ " com capacidade maxima de: " +e1.capacidadeMaxima));
					
					//condicao 1
					String j =JOptionPane.showInputDialog("Adicionar mais produtos (true/false): ");
					Boolean jp = Boolean.parseBoolean(j);
					if(jp==true) {
					
					//add mais itens no estoque
					
					JOptionPane.showMessageDialog(null, "adicionando novos itens...");
					String n =JOptionPane.showInputDialog("quantidade de produtos a ser adicionados: ");
					int n1= Integer.parseInt(n);
					
					//condicao 2
					for (int i = 0; i < n1 ;i++) {
						
						String no= JOptionPane.showInputDialog("digite o nome do produto: ");
						String val =JOptionPane.showInputDialog("digite o valor do produto: ");
						float val1 = Integer.parseInt(val);
						String quant= JOptionPane.showInputDialog("digite a quantidade do produto: ");
						int quant12=Integer.parseInt(quant);
						Produto produtos= new Produto(no, val1, quant12);
						list_produto.add(produtos);
						
								
					}
					
					
					JOptionPane.showMessageDialog(null, "Agora na lista possui...");
					
					for (Produto pro : pr1) {
						JOptionPane.showMessageDialog(null, "No estoque possui: "+ pro.getNome() + " do valor: "+ pro.getValor()
						+ " e "+ pro.getQuant()+" unidades");
						
					}
					
					//fim da condicao
					} else{
						JOptionPane.showMessageDialog(null, "encerrando operacao...");
					}
				break;
			
			
			case 2:
				System.out.println("opcao 2 Funcionarios");
				
				//inserindo dados
				String nom = JOptionPane.showInputDialog("inserir nome do funcionario");
				String ida=JOptionPane.showInputDialog("inserir idade do funcionario");
				String cp=JOptionPane.showInputDialog("inserir o CPF do funcionario");
				String carg= JOptionPane.showInputDialog("inserir o cargo do funcionario");
				
				//criando funcionario
				Funcionario f1 =new Funcionario(carg);
				f1.setNome(nom);
				f1.setIdade(ida);
				f1.setCpf(cp);
				
				//criando uma lista
				List<Funcionario> list_fun= new ArrayList<Funcionario>();
				list_fun.add(f1);
				
				
				
				//varrendo e imprimindo a lista
				for (Pessoa pr:list_fun) {
					JOptionPane.showMessageDialog(null, "Funcionario: "+pr.getNome()+"\n"+"de: "+pr.getIdade()+" anos"+"\n"+"CPF: "+pr.getCpf()+"\n"+"Ocupacao: "+f1.getCargo());
					
				}
				
				// variaveis e condicao 1
				String pp =JOptionPane.showInputDialog("deseja adicionar mais funcionarios(true/false): ");
				Boolean p = Boolean.parseBoolean(pp);
				if(p==true) {
				
				//add mais funcionarios
				
				JOptionPane.showMessageDialog(null, "carregando...");
				String n =JOptionPane.showInputDialog("quantos funcionarios deseja adicionar: ");
				int n1= Integer.parseInt(n);
				
				//condicao 2
				for (int i = 0; i < n1 ;i++) {
					
					//add dados
					String nom1 = JOptionPane.showInputDialog("inserir nome do funcionario");
					String ida1=JOptionPane.showInputDialog("inserir idade do funcionario");
					String cp1=JOptionPane.showInputDialog("inserir o CPF do funcionario");
					String carg1= JOptionPane.showInputDialog("inserir o cargo do funcionario");
					
					Funcionario fun2 = new Funcionario(carg1);
					fun2.setNome(nom1);
					fun2.setIdade(ida1);
					fun2.setCpf(cp1);
							
				}
				
				
				JOptionPane.showMessageDialog(null, "Agora na lista possui...");
				
				//varrendo a lista
				for (Pessoa pr:list_fun) {
					JOptionPane.showMessageDialog(null, "Funcionario: "+pr.getNome()+"\n"+"de: "+pr.getIdade()+" anos"+"\n"+"CPF: "+pr.getCpf()+"\n"+"Ocupacao: "+f1.getCargo());
					
				}
				
				//outra opcao
				} else{
					JOptionPane.showMessageDialog(null, "encerrando operacao...");
				}
				
				break;
			case 3:
				System.out.println("opcao 3 informacao");
				
				Supermercado s1 = new Supermercado("jau", 3200);
				
			
				
				JOptionPane.showMessageDialog(null,"Nome da empresa: "+s1.getNome()+"\n CNPJ da empresa: "+ s1.getCNPJ());
				
				
				break;
			
				
			default:
				JOptionPane.showMessageDialog(null,"escolha a opcao de 1 a 3");
				break;
			}
			System.out.println();
		} while(op!=0);
		
	}


}
