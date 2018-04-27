package ufficio;

import persone.Operaio;

public class Personale {

	public void elaboraBustaPaga(Operaio operaio) {
		System.out.println("calcolo della busta paga di " + operaio.toString() );
	}	
/*	
	// forse dipendenza da Operaio
	public void elaboraBustaPaga(String nome, String cognome, double salario) {
		
		//Operaio op1 = new Operaio(nome, cognome, salario); 
		//System.out.println("calcolo della busta paga di " + op1.toString() );
	}
*/	
}
