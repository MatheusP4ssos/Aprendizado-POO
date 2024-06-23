package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import main.list.OperacoesBasicas.Tarefa;

public class ListaTarefa {

  private final List<main.list.OperacoesBasicas.Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefa() {
    return tarefaList.size();
  }

  public void obterDescricaoTarefa() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    listaTarefa.adicionarTarefa("tarefa 1");
    listaTarefa.adicionarTarefa("tarefa 2");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

    listaTarefa.removerTarefa("tarefa 1");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());


    listaTarefa.obterDescricaoTarefa();
  }
}

