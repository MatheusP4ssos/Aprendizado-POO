package list.OperacoesBasicas.OperacoesUtilizandoMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

  //atributos
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionaContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public int quantidadeContatos() {
    return agendaContatoMap.size();
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adicionaContato("Maria Fernanda", 47762686);
    agendaContatos.adicionaContato("Maria empresa", 37282688);
    agendaContatos.adicionaContato("Carlos Eduardo", 47762686);
    agendaContatos.adicionaContato("Julia curso", 11884198);
    agendaContatos.adicionaContato("Carla Médica", 38988845);
    agendaContatos.adicionaContato("Ana Banana", 27484883);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Maria Fernanda");
    agendaContatos.exibirContatos();
    System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Julia curso"));
    System.out.println("Existen " + agendaContatos.quantidadeContatos() + " contatos");
  }
}
