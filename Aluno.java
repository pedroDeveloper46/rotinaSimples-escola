package entendendo.memoria;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
      public String nome;
      public String turma;
      public static List<Aluno> alunos = new ArrayList<Aluno>();
      
      //ESSE M�TODO FAZ A CRIA��O DOS ALUNOS e ADICIONA OS ALUNOS NA LISTA
      public static void criaAlunos() {
    	  Aluno a1 = new Aluno();
    	  a1.nome = "Pedro";
    	  a1.turma = "INF3CM";
    	  alunos.add(a1);
    	  
    	  Aluno a2 = new Aluno();
    	  a2.nome = "J�lia";
    	  a2.turma = "INF1ET";
    	  alunos.add(a2);
    	 
    	  
    	  
      }
      //ESSE M�TODO FAZ A LISTAGEM DOS ALUNOS E RETORNA A LISTA 
      public static List<Aluno> listarAlunos() {
    	  
    	  for(Aluno a : alunos) {
    		  System.out.println("NOME DO ALUNO: " +a.nome.toUpperCase());
    		  System.out.println("TURMA: " +a.turma.toUpperCase());
    		  System.out.println();
    	  }
    	  
    	  return alunos;
      }
}
