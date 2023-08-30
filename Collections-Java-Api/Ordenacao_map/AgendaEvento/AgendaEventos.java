package AgendaEvento;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
    eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      Evento evento = entry.getValue();
      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atra��o: " + evento.getAtracao());
    }
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    if (proximoEvento != null) {
      System.out.println("O pr�ximo evento: " + proximoEvento.getNome() + " acontecer� na data " + proximaData);
    } else {
      System.out.println("N�o h� eventos futuros na agenda.");
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos � agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Confer�ncia de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programa��o", "Aula pr�tica de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lan�amento de Software", "Demonstra��o da nova vers�o");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inova��o", "Competi��o de solu��es criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Semin�rio de Intelig�ncia Artificial", "Discuss�o sobre IA avan�ada");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obt�m e exibe o pr�ximo evento na agenda
    agendaEventos.obterProximoEvento();
  }
}