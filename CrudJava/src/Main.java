import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        while(true){
            System.out.println("--------------------------------");
            System.out.println("MENU:");
            System.out.println("1 - Criar produto");
            System.out.println("2 - Buscar pelo ID");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Deletar Produto");
            System.out.print("OPÇÃO: ");

            int opcao = sc.nextInt();
            sc.nextLine(); //limpar buffer;


            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o preco do produto: ");
                    double preco = sc.nextDouble();
                    System.out.println("--------------------------------");
                    Produto produto = service.criarProduto(nome, preco);
                    System.out.println("Produto criado com sucesso!");
                    System.out.println("ID: " + produto.getId());
                }
                
                case 2 -> {
                    System.out.print("Digite o ID do produto:");
                    int id = sc.nextInt();

                    Produto produto = service.buscarPorId(id);
                    System.out.println("Produto encontrado: " + produto.getNome() + " - R$" + produto.getPreco());
                    System.out.println("--------------------------------");

                }

                case 3 ->{
                    List<Produto> produtos = service.listarProdutos();
                    if (produtos.isEmpty()){
                        System.out.println("Nenhum produto cadastrado!");
                    }else{
                        for (Produto p: produtos){
                            System.out.println("ID: " + p.getId() + " - NOME: " + p.getNome() + " - PRECO: R$" + p.getPreco());
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Digite o ID do Produto que deseja atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine(); //limpar buffer

                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o preco do produto: ");
                    double preco = sc.nextDouble();
                    System.out.println("--------------------------------");
                    boolean ok = service.atualizarProduto(id, nome, preco);
                    if (ok) {
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                }
                    case 5 -> {
                        System.out.println("Digite o ID do produto para deletar: ");
                        int id = sc.nextInt();
                        
                        service.deletarProduto(id);
                    }

                    default -> System.out.println("OPCAO INVALIDA");  
            }
        }
    }
}
