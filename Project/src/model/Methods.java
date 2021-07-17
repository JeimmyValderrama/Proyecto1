package model;

import model.Strings;

public class Methods {

	private Strings strings = new Strings();

	String msj = strings.getMsj();

	public String probando() {
		String out = "";
		char c = ' ';
		int aux = 0;
		for (int i = 0; i < msj.length(); i++) {
			c = msj.charAt(i);
			if (i == 0) {
				c = Character.toUpperCase(c);
			}
			if (i >= 1) {
				c = Character.toLowerCase(c);
			}
			if (c == ' ') {
				aux = (i + 1);
			}
			if (aux == i) {
				if (c == 'y' || c == 'o' || c == 'u') {
					c = Character.toLowerCase(c);
				} else {
					c = Character.toUpperCase(c);
				}
			}
			out += c;
		}
		return out;
	}

	public int timesRepeatString() {
		String in = msj;
		int count = 0;
		String arreglo[] = in.split(" ");
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i].equals("del")) {
				count += 1;
			}
		}
		return count;
	}

	public String deleteChar() {
		String out = "";
		char c = ' ';
		char delete = ' ';
		for (int i = 0; i < msj.length(); i++) {
			c = msj.charAt(i);
			if (c=='a') {
				c = ' ';
			}
			out+=c;
		}
		return out;
	}

}
