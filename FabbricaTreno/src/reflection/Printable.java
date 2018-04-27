package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.*;

public class Printable {

	private double a;
	protected double b;

	@Override
	public String toString() {

		Class c = this.getClass();
		Field[] field = c.getDeclaredFields();
		String s = c.getSimpleName() + "{";
		// Constructor listaCostruttori[] = c.getConstructors();
		String valore = "";
		String nome = "";
		try {
			if (field.length > 1) {
				for (int i = 0; i < field.length - 1; i++) {

					valore = field[i].get(this).toString();
					nome += field[i].getName();
					s += nome + ":" + valore + ",";
				}
				valore = field[field.length - 1].get(this).toString();
				nome = field[field.length - 1].getName();
				s += nome + ":" + valore + ",";
			}
		}

		catch (IllegalArgumentException e) {

			e.printStackTrace();
		}

		catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		s += "}";
		return s += valore + ",";

	}
}