package list.OperacoesBasicas.OperacoesUtilizandoMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

  //atributos
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionaProduto(Long cod, String nome, int quantidade, double preço) {
    estoqueProdutosMap.put(cod, new Produto(nome, preço, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double valorTotal() {
    double total = 0;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) {
        total += p.getQuantidade() * p.getPreco();
      }

    }
    return total;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) {
        if (p.getPreco() > maiorPreco) {
          maiorPreco = p.getPreco();
          produtoMaisCaro = p;
        }
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.exibirProdutos();

    estoque.adicionaProduto(001L, "Coca latão", 12, 3.00);
    estoque.adicionaProduto(002L, "Glacial geladinha", 8, 4.00);
    estoque.adicionaProduto(005L, "biscoito milho bom", 6, 2.00);
    estoque.adicionaProduto(006L, "Miojo de galinha", 26, 2.00);
    estoque.adicionaProduto(007L, "frauda bebê cagão", 9, 15.00);

 estoque.exibirProdutos();
 System.out.println(estoque.valorTotal());
 System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
  }
}
