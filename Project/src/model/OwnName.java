package model;

public class OwnName {
	
	String chain;
	public OwnName(String chain) {
		this.chain=chain;
	}
	public  void ownName(){
		chain="sogamoso ciudad del sol y el acero";
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

}
