package execution;

import javax.swing.JOptionPane;

import model.OwnName;

public class Runner {

	public static void main(String[] args) {
		
		String phrases = "";
		String note = "sogamoso ciudad del sol y el acero";
		OwnName nm = new OwnName(note);
		nm.ownName();
		
        /**Encriptar cadena*/
		phrases = JOptionPane.showInputDialog("escriba palabra u oracion a encriptar");
		JOptionPane.showMessageDialog(null, nm.encrypt(phrases));
		/**Desencriptar cadena*/
		JOptionPane.showMessageDialog(null, nm.decrypt(phrases));

		/**Borar caracteres izquierda o derecha*/
		String sentence = JOptionPane.showInputDialog("Digite texto: ");
		String[] leftOrRigth = { "Derecha", "Izquierda"};
		String orientation = Integer.toString(JOptionPane.showOptionDialog(null, "Por favor eliga por donde quiere empezar a borrar : ","Elegir dirección",
				JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, leftOrRigth, leftOrRigth[0]));
		JOptionPane.showMessageDialog(null, nm.delete(sentence, orientation));

	}

}
