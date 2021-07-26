package model;

import java.util.Scanner;

import model.Strings;

public class Methods {

	public static Strings strings = new Strings();

	String msj = strings.getMsj();
	
	//nombre propio+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public  String ownName(){
		
		String chain = strings.getMsj();
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
		
		return "Frase inicial:  " + chain
			   +"\n Frase Final:   "+ outcome;
      
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	

	/*public String probando() {
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
	}*/
	
	
   //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
   
	//borrar caracteres +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	//Interseccion +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	 public static void showChain() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Ingrese la primera cadena: ");
			 String firstChain=new String (scanner.nextLine()).toLowerCase();

			System.out.println("Ingrese la segunda cadena: ");
			 String secondChain=new String (scanner.nextLine()).toLowerCase();
				
				String arrayTwo[]=secondChain.split("");
				String arrayOne[]=firstChain.split("");
				
			   Methods.checkChain(arrayOne, arrayTwo);

			}
		public static void checkChain(String arrayOne[],String arrayTwo[]) {
			
				String message="";
				String result="";
				for (int i = 0; i < arrayOne.length; i++) {
					
					for (int j = 0; j < arrayTwo.length; j++) {
						if(arrayOne[i].equals(arrayTwo[j])) {
							message+=arrayTwo[j];
						}
					}
					
				}
				
				String arrayThree[]=message.split("");
				for (int i = 0; i < arrayThree.length; i++) {
					for (int j = i+1; j < arrayThree.length; j++) {
						if(arrayThree[i].equals(arrayThree[j])) {
							arrayThree[j]="";
						}
					}
				}
				
				for (int i = 0; i < arrayThree.length; i++) {
					result+=arrayThree[i];
				}
				System.out.println( "El resultado de la Interseccion es: " + result);
          ;
				
			}
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	

//Diferencia+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		public static void Diference() {
			
			Scanner scanner=new Scanner(System.in);
			
	        String firstChain= strings.getMsj() ;
	         System.out.println("Digite la primera cadena ");
	        String secondChain=new String (scanner.nextLine().toLowerCase());
	         String arrayOne[]=firstChain.split("");
	        String arrayTwo[]=secondChain.split("");
	        
	       
	   
	    
	       System.out.println(delete(arrayOne.clone(),arrayTwo.clone()));
	    	
		}


		public static String delete(String arrayOne[], String arrayTwo[] ) {
			for (int i = 0; i < arrayOne.length; i++) {
				boolean repeat=false;
				for (int j = 0; j < arrayTwo.length; j++) {
					if (arrayOne[i].equals(arrayTwo[j])) {
						arrayOne[i]="";
						repeat=true;
						break;
					}
					if (repeat=false) {
						break;
					}
					
					
				}
			}
			return fillChain(arrayOne);
			
		}
		
		public static  String fillChain(String[] arrayOne) {
			String result=new String();
			for (int i = 0; i < arrayOne.length; i++) {
				result+=arrayOne[i];
				
			}
			
			
			return "Diferencia:  " + result;
		}
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
	
	
	
	
	
	
	
	

}
