package main.java.list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.java.list.OperacoesBasicas.Ordenacao.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoa {

  //atributo
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("Maria", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Pedro", 36, 1.87);
    ordenacaoPessoa.adicionarPessoa("João", 19, 1.79);
    ordenacaoPessoa.adicionarPessoa("Gustavo", 23, 1.84);

  System.out.println(ordenacaoPessoa.ordenarPorIdade());
  System.out.println(ordenacaoPessoa.ordenarPorAltura());
  }
}
