package Colecoes.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);  // no momento em que o treemap é criado, os elementos já estarão ordenados de forma crescente.
        // O LocalDate implementa a interface ChronoLocalDate, que ordena as datas
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){  // o método entrySet cria um Set com os pares contidos no TreeMap
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximoEvento + " - Data: " + proximaData);
                break;  // se não der break, não vai pegar só o próximo evento e, sim, todos os eventos da data informada em diante.
            }
        }
        if(proximoEvento == null){
            System.out.println("Não há nenhum evento para datas futuras.");
        }
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 01), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 07), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 31), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 07), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 31), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


    }

}
