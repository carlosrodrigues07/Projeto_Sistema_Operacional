package Escalonadores;

import java.util.Queue;
public class Round_Robin {
   private int quantum;
   private Queue<Processo> fila;
   public Round_Robin(int quantum, Queue<Processo> fila) {
       this.quantum = quantum;
       this.fila = fila;
   }
   public void executar() {
       System.out.println("=================================");
       System.out.println("Execução usando Round Robin:");
       System.out.println("Quantum = " + quantum + " segundos");
       System.out.println("=================================");
       while (!fila.isEmpty()) {
           Processo processo = fila.poll();
           if (processo.getTempoExecucao() > quantum) {
               System.out.printf("Processo %d | Executado por %d segundos | Restam %d segundos\n",
                                 processo.getId(), quantum, processo.getTempoExecucao() - quantum);
               try {
                   Thread.sleep(quantum * 1000); // Simulando execução do quantum
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               // Processo ainda não terminou, voltando para a fila com o tempo restante
               fila.add(new Processo(processo.getId(), processo.getTempoExecucao() - quantum));
           } else {
               System.out.printf("Processo %d | Executado por %d segundos | Processo Concluído\n",
                                 processo.getId(), processo.getTempoExecucao());
               try {
                   Thread.sleep(processo.getTempoExecucao() * 1000); // Simulando tempo de execução restante
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
       System.out.println("---------------------------------");
       System.out.println("Todos os processos foram executados usando Round Robin.");
       System.out.println("=================================\n");
   }
}






