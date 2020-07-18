package entendendo.memoria.app;



import java.util.List;

import entendendo.memoria.Aluno;
import entendendo.memoria.Materia;
import entendendo.memoria.MediaFinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("ESCOLA");
        System.out.println(" ");
        MediaFinal m = new MediaFinal();
        Materia.criaMateria();
        List<Materia> materias = Materia.listarMateria();
        System.out.println("");
        
        Aluno.criaAlunos();
        List<Aluno> alunos = Aluno.listarAlunos();
        
        List<MediaFinal> medias = m.calcularMedia(alunos, materias);
        m.listarMedias(medias);
        
        
        
       
        
	}

}
