package Escalonadores;

public class Processo {
	   int id;
	   int tempoExecucao;
	   public Processo(int id, int tempoExecucao) {
	       this.id = id;
	       this.tempoExecucao = tempoExecucao;
	   }
	   // Método getter para obter o ID do processo
	   public int getId() {
	       return id;
	   }
	   // Método getter para obter o tempo de execução do processo
	   public int getTempoExecucao() {
	       return tempoExecucao;
	   }
	}
