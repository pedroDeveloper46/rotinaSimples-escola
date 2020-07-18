package entendendo.memoria;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	
	public String nomeMateria;
	
	static List<Materia> materias = new ArrayList<>();
    	
    public static void criaMateria() {
    	Materia m1 = new Materia();
    	m1.nomeMateria = "MATEM�TICA";
    	
    	Materia m2 = new Materia();
    	m2.nomeMateria = "PORTUGU�S";
    	materias.add(m1);
    	materias.add(m2);
    	
    	
    }
    
     public static List<Materia> listarMateria(){
    	for(Materia m: materias) {
    	     System.out.println("MAT�RIA: " + m.nomeMateria);
    	}
    	
    	return materias;
    }
    
    
}
