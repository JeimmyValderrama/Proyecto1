package execution;
import model.Methods;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		Methods methods = new Methods();
		
		//System.out.println(methods.probando());
		//System.out.println(methods.timesRepeatString());

		
		
		Scanner scanner=new Scanner(System.in); 
		int option=0;
		while (option!=9) {

			System.out.println("Digite la opcion que desea realizar"
					+ "\n 1.Nombre Propio"
					+ "\n 2.Buscar Cadena "
					+ "\n 3.Encriptar"
					+ "\n 4.Desencriptar"
					+ "\n 5 Llenar caracteres"
					+ "\n 6.Borrar caracteres"
					+"\n 7.Interseccion"
					+"\n 8.Diferencia"
					+"\n 9.Borrar caracteres"
					+"\n 10.Validar direccion de correo"
					+ "\n 11.Salir");
			
			System.out.println("\n   ");
			
			option=scanner.nextInt();
			
			switch (option) {

			case 1:

				System.out.println(methods.ownName());
				System.out.println("\n   ");

				break;
				
			case 2:

				break;
				
				
			case 3:
			

				break;
				
				
			case 4:
				
				break;
				
			case 5:
						
				break;
				
			case 6:
		
				System.out.println(methods.deleteChar());
				System.out.println("\n   ");
				
				break;
				
			case 7:
				
				Methods.showChain();
				System.out.println("\n   ");
				
				break;
				
            case 8:
	             
            	Methods.Diference();
            	System.out.println("\n   ");
            	
				break;
				
           case 9:
	
	
	
	           break;
	           
            case 10:
	
	
	
	         break;
			case 11:
				System.out.println("SALIENDO...");
				System.exit(0);
				break;

			}
		}
		}
		
		

	}


