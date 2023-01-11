import java.util.Arrays;

public class ColmnuarTransposiotionCipher {
	public String plainText;
	public String key;
	
	public ColmnuarTransposiotionCipher() {
		this.plainText = "";
		this.key = "";
	}
	
	public String encrypt() {
//		Math.ceil() accepts double, we did casting to round it to upper number and we did another casting to convert it to char type
		int nbColumns = key.length(); 
		char[][] table = new char [(char)Math.ceil( (double) plainText.length()/nbColumns)][nbColumns];
		int plainIdx = 0;
		
		 
//		filling the table:
		for (int i = 0; plainIdx < plainText.length(); i++) { // fill the array until the plain text finishes
			for (int j = 0; j < nbColumns && plainIdx < plainText.length(); j++) { // fill in a row way + stop when the plain text finished 
				table[i][j] = plainText.charAt(plainIdx++); 
				}
		}
		
//		Sorting the key:
		char a [] = key.toCharArray();
		 Arrays.sort(a);
		
//		plaint text length - key length = nb of rows 
//		picking up the cipher text:
		String cipherText = "";
		int sortedIdx = 0;
		
		for (int i = key.indexOf(a[sortedIdx]); sortedIdx < key.length();) {
			i = key.indexOf(a[sortedIdx++]);				
			
				
			for (int j = 0; j < Math.ceil( (double) plainText.length()/nbColumns) && table[j][i] != 0  && cipherText.length() != plainText.length(); j++) { //5 - 3 = 2
				cipherText+=table[j][i]; 
			} 
			key = key.replaceFirst(key.charAt(i)+"", "*"); // to get rid of first char and find next occurrence 
			
			
			

		}
		
//		System.out.print("Your cipher text is: ");
//		System.out.println(cipherText);
		return cipherText;

	}
	
	
	

}
