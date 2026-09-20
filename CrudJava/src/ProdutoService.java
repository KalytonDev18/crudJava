import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private int nextId = 1;

    public Produto criarProduto(String nome, double preco){
        Produto produto = new Produto(nextId, nome, preco);
        nextId++;
        produtos.add(produto);
        return produto;
    }

    public Produto buscarPorId(int id){
        for (Produto p: produtos){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean atualizarProduto(int id, String nome, double preco){
        Produto produto = buscarPorId(id);
        if(produto != null){
            
            produto.setNome(nome);
            produto.setPreco(preco);
            
            return true;
        }
        return false;
    }

    public boolean deletarProduto(int id){
        Produto produto = buscarPorId(id);
        if(produto != null){
            produtos.remove(produto);
            System.out.println("Produto deletado com sucesso!");
            return true;
        }
        return false;
    }

    public List<Produto> listarProdutos(){
        return produtos;
    }
}
