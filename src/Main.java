//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
    Produto Bolacha = new ProdutoPerecivel("Trakinas", 11.00);
    Produto Ferramenta = new Produto("Chave Fenda",20.00);
    Produto Celular = new ProdutoEletronico("Samsung Galaxy J5", 500.00);
    Produto Salgadinho = new ProdutoPerecivel ("Doritos", 11.00);
    Produto Leite = new ProdutoPerecivel("Líder", 8.00);



        estoque.adicionarProduto(Bolacha);
        estoque.adicionarProduto(Ferramenta);
        estoque.adicionarProduto(Celular);
        estoque.adicionarProduto(Salgadinho);
        estoque.adicionarProduto(Leite);

        System.out.printf("Produtos antes do desconto:");
        estoque.exibirPrecosSemDesconto();
        System.out.println("*********");
        System.out.print("Depois do desconto aplicado:\n");
        estoque.exibirPrecosComDesconto(20);
    }
}