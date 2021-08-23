package model;

import java.util.List;

public class OwnName {
	
	/** Atributo*/
	final String PHRASES;

	/**Constructor de la clase
	 *@param phrases: hace referencia a el texto ingreasado por el usuario
	 * */
	public OwnName(String phrases) {
		PHRASES = phrases;
    }
	
	static String chain ="sogamoso ciudad del sol y el acero";
	 /**primer metodo jeimmy*/
	public  void ownName(){

		char letterOne=' ';
		char capitalLetter=' ';
		String outcome=" ";
		int counter=0;
		int aux=0;
		for (int i = 0; i < chain.length(); i++) {
			letterOne=chain.charAt(0);
			capitalLetter=chain.charAt(i);
			if(i==0) {
				capitalLetter=Character.toUpperCase(capitalLetter);
			}if(capitalLetter==' ' || capitalLetter == chain.charAt(24)) {
				counter=i+1;
				
			}if(counter==i) {
				capitalLetter=Character.toUpperCase(capitalLetter);
			}
			outcome+=capitalLetter;
		}
		System.out.println("Frase inicial:  " + chain
				       +"\n Frase Final:   "+ outcome);
      
	}
	
	/**
	 * @param phrases: hace referencia a el texto ingreasado por el usuario
	 * @return Encriptar (método estático)
	 */
   public static String encrypt(String phrases) {
		
		char ecyt[] = phrases.toCharArray();
		
        /**ciclo para encriptar la cadena*/
		for(int i = 0; i < ecyt.length; i++) {
//			La letra en esa posicion va a ser igual a 5 letras mas adelante en el avecedario
				ecyt[i] = (char)(ecyt[i] + (char)5);
			}
//			Tomar el valor del arreglo de caracteres y lo transforma
			String encrypted = String.valueOf(ecyt);
		
		return encrypted;
   }
   
   /**
	 * @param phrases: hace referencia a el texto ingreasado por el usuario
	 * @return Desencriptar (método estático)
	 */
   public static String decrypt(String phrases) {
	   String encrypted = encrypt(phrases);
	   
	   char ecyt[] = encrypted.toCharArray();
	   
        /**Ciclo para desencriptar la cadena*/
	   for(int i = 0; i < ecyt.length; i++) {
			ecyt[i] = (char)(ecyt[i] - (char)5);
		}
		String decrypt = String.valueOf(ecyt);
		
	   return decrypt;
   }
   /**
	 * @param note hace referencia a el texto ingreasado por el usuario
	 * @param leftOrRigth si desea borrar por derecha o izquierda
	 * @return Borra a la izquierda o a la derecha de la cadena los caracteres que
	 *         existen en la cadena de entrada, hasta que encyentre un caracter que
	 *         no exista
	 */
	public String delete(String note, String leftOrRigth) {
       /**elimina por la izquierda*/
		if (leftOrRigth.equals("Izquierda")) {
			String result = chain;
			/**evalua la frase y empieza a comparar con la cadena de entrada*/
			for (int i = 0; i < chain.length(); i++) {
				if (searchLyrics(chain.substring(i, i + 1), note)) {
					result = chain.substring(i + 1, chain.length());
				} else {
					return result;
				}

			}
			/***/
			return result;
		} else {
			String result = chain;
			for (int i = chain.length(); i >= 0; i--) {
				if (searchLyrics(chain.substring(i - 1, i), note)) {
					result = chain.substring(0, i - 1);
				} else {
					return result;
				}

			}
			return result;
		}
	}
	
	/**
	 * @param character que es para un caracter
	 * @param string es para una cadena de caracteres
	 * @return
	 * Este método observa si la letra se encuentra o no
	 */
	public static boolean searchLyrics (String character, String string) {
		int counter = 0;
		/**for para ver si en la letra se encuentra en la cade na string*/
		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i, i + 1).equalsIgnoreCase(character)) {
				counter++;
			}
		}
		if (counter == 0)
			return false;
		else
			return true;
	}
		
}	