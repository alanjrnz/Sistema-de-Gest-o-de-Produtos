public class ProdutoPerecivel extends Produto {


    public ProdutoPerecivel(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularDesconto(double porcentagem) {
        preco = preco * ((100 - porcentagem) / 100);
        preco = preco - 2.0;
        return preco;

    }
}
