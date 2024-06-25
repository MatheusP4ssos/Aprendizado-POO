package list.OperacoesBasicas.OperacoesUtilizandoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEvento {

  private Map<LocalDate, Evento> eventosMap;

  public AgendaEvento() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximaEvento = null;
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximaEvento = entry.getValue();
        System.out.println(
            "O próximo evento: " + entry.getKey() + " acontecerá na data " + entry.getKey());
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEvento agendaEvento = new AgendaEvento();
    agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 1), "Micareta Paulera", "Kurt Kobain");
    agendaEvento.adicionarEvento(LocalDate.of(2024, Month.APRIL, 12), "Desputa Calvice", "Kurt Kobain");
    agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JUNE, 1), "Sociedade Wookie", "Kurt Kobain");
    agendaEvento.adicionarEvento(LocalDate.of(2023, Month.FEBRUARY, 1), "Nerds, Gays, Fanaticos de fast food", "Kurt Kobain");
    agendaEvento.adicionarEvento(LocalDate.now(), "Guerra Sigma", "Kurt Kobain");

    agendaEvento.exibirAgenda();
    agendaEvento.obterProximoEvento();
  }
}
