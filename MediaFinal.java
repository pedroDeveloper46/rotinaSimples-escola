package entendendo.memoria;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.softblue.commons.io.Console;

public class MediaFinal {
	
	public double[] notas = new double[3];
	public double media;
	public Aluno aluno;
	public Materia materia;
	public boolean resultado;
	
	public static List<MediaFinal> medias = new ArrayList<MediaFinal>();
	
	//ESSE MÉTODO FAZ A LEITURA DAS NOTAS DO ALUNO, CALCULA A MÉDIA E ALIMENTA A LISTA medias
	public void Inputmedia(Aluno aluno, Materia materia) {
		 MediaFinal m = new MediaFinal();
		 double media = 0;
	     
		 for (int i = 0; i < notas.length; i++) {
			 System.out.println("DIGITE A " + (i+1) + "ª NOTA DE " + aluno.nome.toUpperCase() + " EM " + materia.nomeMateria);
			 m.notas[i] = Console.readDouble();
			 media += m.notas[i];
		 }
		 m.media = media / notas.length;
		 m.aluno = aluno;
		 
		 if(m.media >= 6.0) {
			 m.resultado = true;
		 }else {
			 m.resultado = false;
		 }
		 
		 m.materia = materia;
		 
		 medias.add(m);
		 
		 
		 
	}
	//ESSE MÉTODO CALCULA A MEDIA DE TODOS OS ALUNOS DA LISTA alunos, TEM COMO PARAMETRO A LISTA DOS ALUNOS E CHAMA O METODO inputMedia(Aluno aluno) PARA FAZER O CALCULO E POR FIM, ELE RETORNA UMA LISTA DE MEDIAS
	public List<MediaFinal> calcularMedia(List<Aluno> alunos, List<Materia> materia) {
		MediaFinal m = new MediaFinal();
		for(Materia mat : materia) {
			for (Aluno aluno : alunos) {
				System.out.println();
				m.Inputmedia(aluno, mat);
				
			}
		}
		
		return medias;
	}
	public List<MediaFinal> calcularMediaPorMateria(List<Aluno> alunos, List<Materia> materia, String ma) {
		MediaFinal m = new MediaFinal();
		for(Materia mat : materia) {
			if(mat.equals(ma)) {
				for (Aluno aluno : alunos) {
					System.out.println();
					m.Inputmedia(aluno, mat);
					
				}
			}
		}
		
		return medias;
	}
	
	//ESSE MÉTODO FAZ A LISTAGEM DAS MÉDIAS
	public void listarMedias(List<MediaFinal> medias) {
		DecimalFormat format = new DecimalFormat("0.00");
		for(MediaFinal media : medias) {
			System.out.println("NOME DO ALUNO: " + media.aluno.nome.toUpperCase());
			System.out.println("TURMA: " + media.aluno.turma);
			System.out.println("MÉDIA FINAL: " + format.format(media.media));
			System.out.println("MATÉRIA: " + media.materia.nomeMateria);
			if(media.resultado) {
				System.out.println("APROVADO");
			}else {
				System.out.println("REPROVADO");
			}
			System.out.println();
			
		}
		
	}
	

}
