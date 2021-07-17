package execution;
import model.Methods;

import javax.swing.JOptionPane;

import model.OwnName;

public class Runner {

	public static void main(String[] args) {
		Methods methods = new Methods();
		
		System.out.println(methods.probando());
		System.out.println(methods.timesRepeatString());
		System.out.println(methods.deleteChar());
		

	}

}
