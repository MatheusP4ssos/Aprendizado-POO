package main.java.list.OperacoesBasicas.OperacoesBasicasComSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  //atributos
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvidado) {
    convidadoSet.add(new Convidado(nome, codigoConvidado));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvidado) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : convidadoSet) {
      if (c.getCodigoConvite() == codigoConvidado) {
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadoSet.size();
  }


  public void exibirConvidados() {
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println(
        "Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

    conjuntoConvidados.adicionarConvidado("Felipe Dior", 125533);
    conjuntoConvidados.adicionarConvidado("Vitenzo Lamborghini", 15576);
    conjuntoConvidados.adicionarConvidado("Henrieta Gucci", 15576);
    conjuntoConvidados.adicionarConvidado("Kalvin Klein", 4564545);

    System.out.println(
        "Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
    conjuntoConvidados.removerConvidadoPorCodigoConvite(125533);
    System.out.println(
        "Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

    conjuntoConvidados.exibirConvidados();
  }
}
