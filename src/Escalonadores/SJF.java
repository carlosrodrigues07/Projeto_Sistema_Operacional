package Escalonadores;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class SJF {
   private List<Processo> processos;
   public SJF(List<Processo> processos) {
       this.processos = processos;
   }
   public void executar() {
       System.out.println("=================================");
       System.out.println("Execução usando SJF:");
       System.out.println("=================================");
       // Ordenando os processos pelo tempo de execução (ordem crescente)
       Collections.sort(processos, Comparator.comparingInt(Processo::getTempoExecucao));
       for (Processo processo : processos) {
           System.out.printf("Processo %d | Tempo de Execução: %d segundos\n", processo.getId(), processo.getTempoExecucao());
           try {
               Thread.sleep(processo.getTempoExecucao() * 1000); // Simulando tempo de execução
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println("---------------------------------");
       System.out.println("Todos os processos foram executados usando SJF.");
       System.out.println("=================================\n");
   }
}

