package reflection;

import train.factory.*;
import java.lang.reflect.*;

public class ReflectionWagon {

	public static void main(String[] args) {
		try {
			// Ottengo il riferimento alla Classe di interesse
			Class c = Class.forName("train.factory.BasicWagon");

			// Acquisisco la lista dei costruttori
			Constructor listaCostruttori[] = c.getConstructors();
			System.out.println("Numero Costruttori: " + listaCostruttori.length);

			// Stampo a video i dettagli di ciascun costruttore
			for (int i = 0; i < listaCostruttori.length; i++) {
				String fullDesc = listaCostruttori[i].toString();
				System.out.println("Costruttore n." + (i + 1) + ": " + fullDesc);
				Class tipiParam[] = listaCostruttori[i].getParameterTypes();
				if (tipiParam.length == 0) {
					System.out.println("Nessun Parametro!");
					continue;
				}
				System.out.println("Parametri: ");
				for (int j = 0; j < tipiParam.length; j++)
					System.out.println(tipiParam[j].getName());
			}
			// Recupero la lista dei Campi della Classe
			Field campi[] = c.getDeclaredFields();

			// Visualizzo i dati di Ciascun Campo
			for (int i = 0; i < campi.length; i++) {
				Field campoCorrente = campi[i];
				System.out.println("Campo n." + (i + 1) + ":");
				System.out.println("Nome: " + campoCorrente.getName());
				System.out.println("Tipo: " + campoCorrente.getType());
				String modificatore = Modifier.toString(campoCorrente.getModifiers());
				System.out.println("Modificatore: " + modificatore);
			}
			Method listaMetodi[] = c.getDeclaredMethods();
			// Print Methods number
			System.out.println("Method lenght: " + listaMetodi.length);
			for (int i = 0; i < listaMetodi.length; i++) {
				Method currentMethod = listaMetodi[i];

				// Full description del Metodo
				String fullDesc = currentMethod.toString();
				System.out.println("Metodo n." + (i + 1) + ": " + fullDesc);

				// Nome e Modificatore del Metodo
				System.out.println("Nome: " + currentMethod.getName());
				String modificatore = Modifier.toString(currentMethod.getModifiers());
				System.out.println("Modificatore d'Accesso: " + modificatore);

				// Eventuali Parametri del Metodo
				Class tipiParam[] = currentMethod.getParameterTypes();
				if (tipiParam.length == 0)
					System.out.println("Il metodo suddetto non prevede alcun parametro!");
				else
					System.out.println("Il metodo suddetto prevede i seguenti parametri: ");
				for (int j = 0; j < tipiParam.length; j++)
					System.out.println(tipiParam[j].getName());

				// Parametro di Ritorno
				Class returnType = currentMethod.getReturnType();
				System.out.println("Tipo di ritorno: " + returnType.getName());

				// Eventuali Eccezioni
				Class eccezioni[] = currentMethod.getExceptionTypes();
				if (eccezioni.length == 0)
					System.out.println("Il metodo suddetto non solleva eccezioni!");
				else
					System.out.println("Il metodo suddetto può sollevare le seguienti eccezioni: ");
				for (int j = 0; j < eccezioni.length; j++)
					System.out.println(eccezioni[j].getName());
			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("Classe non trovata!");
		}
	}

}
