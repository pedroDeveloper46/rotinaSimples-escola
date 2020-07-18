package entendendo.memoria;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
      public String nome;
      public String turma;
      public static List<Aluno> alunos = new ArrayList<Aluno>();
      
      //ESSE MÉTODO FAZ A CRIAÇÃO DOS ALUNOS e ADICIONA OS ALUNOS NA LISTA
      public static void criaAlunos() {
    	  Aluno a1 = new Aluno();
    	  a1.nome = "Pedro";
    	  a1.turma = "INF3CM";
    	  alunos.add(a1);
    	  
    	  Aluno a2 = new Aluno();
    	  a2.nome = "Júlia";
    	  a2.turma = "INF1ET";
    	  alunos.add(a2);
    	 
    	  
    	  
      }
      //ESSE MÉTODO FAZ A LISTAGEM DOS ALUNOS E RETORNA A LISTA 
      public static List<Aluno> listarAlunos() {
    	  
    	  for(Aluno a : alunos) {
    		  System.out.println("NOME DO ALUNO: " +a.nome.toUpperCase());
    		  System.out.println("TURMA: " +a.turma.toUpperCase());
    		  System.out.println();
    	  }
    	  
    	  return alunos;
      }
}
