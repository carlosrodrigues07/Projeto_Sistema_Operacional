package Escalonadores;

import java.util.Queue;
public class FCFS {
   private Queue<Processo> fila;
   public FCFS(Queue<Processo> fila) {
       this.fila = fila;
   }
   public void executar() {
       System.out.println("=================================");
       System.out.println("Execução usando FCFS:");
       System.out.println("=================================");
       while (!fila.isEmpty()) {
           Processo processo = fila.poll();
           System.out.printf("Processo %d | Tempo de Execução: %d segundos\n", processo.getId(), processo.getTempoExecucao());
           try {
               Thread.sleep(processo.getTempoExecucao() * 1000); // Simulando tempo de execução
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println("---------------------------------");
       System.out.println("Todos os processos foram executados usando FCFS.");
       System.out.println("=================================\n");
   }
}

