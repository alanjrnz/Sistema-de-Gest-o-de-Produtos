import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    public Estoque(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto item) {
        produtos.add(item);
    }

    public void removerProduto(Produto item) {
        produtos.remove(item);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto item : produtos) {
            double precoComDesconto = item.calcularDesconto(porcentagem);
            System.out.println("Produto: " + item.getNome() + " | Preço com desconto: " + precoComDesconto);
        }
    }

    public void exibirPrecosSemDesconto() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Preço: " + produto.getPreco());
        }

    }
}
