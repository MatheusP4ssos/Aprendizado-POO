package main.java.list.OperacoesBasicas.OperacoesBasicasComSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

  private Set<Produto> produtosSet;

  public CadastroProduto(Set<Produto> produtosSet) {
    this.produtosSet = new HashSet<>();
  }

  public CadastroProduto() {
    this.produtosSet = new HashSet<>();
  }

  public void addProduto(String nome, Long cod, double preco, int quantidade) {
    produtosSet.add(new Produto(nome, cod, preco, quantidade));
  }


  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(produtosSet);
    produtosSet.addAll(produtosSet);
    return produtosPorPreco;
  }

public static void main(String[] args) {
  CadastroProduto cadastroProduto = new CadastroProduto();
  cadastroProduto.addProduto("Batata", 001L, 15.00, 2);
  cadastroProduto.addProduto("feijão", 012L, 12.00, 1);
  cadastroProduto.addProduto("Cheetos", 012L, 9.45, 4);
  cadastroProduto.addProduto("refrigerante", 014L, 12.00, 2);

  System.out.println(cadastroProduto.produtosSet);
  System.out.println(cadastroProduto.exibirProdutosPorNome());
  System.out.println(cadastroProduto.exibirProdutosPorPreco());
  }
}
