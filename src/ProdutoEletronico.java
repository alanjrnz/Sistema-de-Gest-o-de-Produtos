public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularDesconto(double porcertagem){
        //Desconto fixo de 10%
        return preco * 0.9;
    }
}
