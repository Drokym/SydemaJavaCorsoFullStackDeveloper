package test;

import CommonsUtility.StudenteUtility;
import academy.GestioneCorsi;
import persone.Operaio;
import persone.OperaioBase;
import persone.Persona;
import persone.Studente;
import persone.StudenteBase;
import persone.StudenteOperaio;
import ufficio.Personale;

public class PersoneTest {
	public static void main (String args[]) {
		
		Studente s1 = new StudenteBase("Paolo", "Paperino", "MZZSXD98");
		s1.getMatricola();
		GestioneCorsi gc = new GestioneCorsi();
		gc.iscrizioneAlCorso(s1);
		
		Operaio op1 = new OperaioBase("Bat", "Man", 10.000);
		Personale up = new Personale();
		up.elaboraBustaPaga(op1);

		StudenteOperaio s2 = new StudenteOperaio("Topo", "Lino", "TPLLIN98",11.000);
		
		gc.iscrizioneAlCorso(s2);
		up.elaboraBustaPaga(s2);
		StudenteUtility.calcolaMediaVoti(s2);
		//StudenteUtility su = new StudenteUtility();
		//float voti[] = {3.4f,5.4f};
		//StudenteUtility.calcolaMediaVoti(voti); 
		// periocolo esportazioen di logica utilizzabile senza l'oggetto studente
		
		
	}
}
