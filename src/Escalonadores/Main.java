package Escalonadores;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Main {
   public static void main(String[] args) {
       List<Processo> processos = new ArrayList<>();
       processos.add(new Processo(1, 5));
       processos.add(new Processo(2, 3));
       processos.add(new Processo(3, 8));
       processos.add(new Processo(4, 6));
       Runtime runtime = Runtime.getRuntime();
       // Executando e medindo FCFS
       Queue<Processo> filaFCFS = new LinkedList<>(processos);
       FCFS fcfs = new FCFS(filaFCFS);
       runtime.gc();
       long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
       long startTime = System.currentTimeMillis();
       fcfs.executar();
       long endTime = System.currentTimeMillis();
       long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
       System.out.printf("FCFS - Tempo de execução: %d ms, Memória usada: %d bytes\n",
               (endTime - startTime), (memoryAfter - memoryBefore));
       // Executando e medindo SJF
       SJF sjf = new SJF(new ArrayList<>(processos));
       runtime.gc();
       memoryBefore = runtime.totalMemory() - runtime.freeMemory();
       startTime = System.currentTimeMillis();
       sjf.executar();
       endTime = System.currentTimeMillis();
       memoryAfter = runtime.totalMemory() - runtime.freeMemory();
       System.out.printf("SJF - Tempo de execução: %d ms, Memória usada: %d bytes\n",
               (endTime - startTime), (memoryAfter - memoryBefore));
       // Executando e medindo Round Robin
       Queue<Processo> filaRR = new LinkedList<>(processos);
       Round_Robin rr = new Round_Robin(4, filaRR);
       runtime.gc();
       memoryBefore = runtime.totalMemory() - runtime.freeMemory();
       startTime = System.currentTimeMillis();
       rr.executar();
       endTime = System.currentTimeMillis();
       memoryAfter = runtime.totalMemory() - runtime.freeMemory();
       System.out.printf("Round Robin - Tempo de execução: %d ms, Memória usada: %d bytes\n",
               (endTime - startTime), (memoryAfter - memoryBefore));
   }
}
