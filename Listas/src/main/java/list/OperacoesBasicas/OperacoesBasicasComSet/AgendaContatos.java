package main.java.list.OperacoesBasicas.OperacoesBasicasComSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

  //atributos
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void addContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> pesquisados = new HashSet<>();
    for (Contato c : contatoSet) {
      if (c.getNome().startsWith(nome)) {
        pesquisados.add(c);
      }
    }
    return pesquisados;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for (Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.exibirContatos();

    agendaContatos.addContato("Camila Felinto", 97765186);
    agendaContatos.addContato("Jackson Silva", 97765186);
    agendaContatos.addContato("Jackson Supervisor", 96684311);
    agendaContatos.addContato("Leandrin do Lanche", 976463774);
    agendaContatos.addContato("Leandrin pvv", 987154225);

  agendaContatos.exibirContatos();

  System.out.println(agendaContatos.pesquisarPorNome("Jackson"));

  System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Jackson Supervisor", 988651853));
  agendaContatos.exibirContatos();
  }
}
