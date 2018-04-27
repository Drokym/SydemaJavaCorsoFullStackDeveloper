package test;

import persone.*;
import persone.Persona;
import persone.PersonaBase;
import persone.Studente;

public class personaTests {

	public static void main(String[] args) {
		
		Persona p = new PersonaBase("SUPER", "MAN");
				
		Studente s = new Studente(p);
		s.setMatricola("BATMAN001");
		
		Operaio o = new Operaio(s);
		o.setSalario(23.445);
		
		Pensionato pn = new Pensionato(o);
		pn.setPensione(23.445);
		
		Docente doc = new Docente(pn);
		doc.setPensione(23.445);
		
		System.out.println(doc);

	}

}
