import java.util.Arrays;

public class ColmnuarTransposiotionCipher {
	public String plainText;
	public String key;
	public String cipherText;
	
	public ColmnuarTransposiotionCipher() {
		this.plainText = "";
		this.key = "";
		this.cipherText = "";
	}
	
	public String encrypt() {
    int nbColumns = key.length(); 
    //		Math.ceil() accepts double, we did casting to round it to upper number and we did another casting to convert it to char type
    double nbRows = Math.ceil((double) plainText.length()/nbColumns);
		char[][] table = new char [(char)nbRows][nbColumns];
		int plainIdx = 0;
		String keyCopy = key; 
		 
//		filling the table:
		for (int i = 0; plainIdx < plainText.length(); i++) { // fill the array until the plain text finishes
			for (int j = 0; j < nbColumns && plainIdx < plainText.length(); j++) { // fill in a row way + stop when the plain text finished 
				table[i][j] = plainText.charAt(plainIdx++); 
				}
		}
		
//		Sorting the key:
		char a [] = keyCopy.toCharArray();
		 Arrays.sort(a);
		
//		picking up the cipher text:
		int sortedIdx = 0;
		
		for (int i = keyCopy.indexOf(a[sortedIdx]); sortedIdx < keyCopy.length();) {
			i = keyCopy.indexOf(a[sortedIdx++]);				
			
				
			for (int j = 0; j < nbRows && table[j][i] != 0  && cipherText.length() != plainText.length(); j++) { //5 - 3 = 2
				cipherText+=table[j][i]; 
			} 
			keyCopy = keyCopy.replaceFirst(keyCopy.charAt(i)+"", "*"); // to get rid of first char and find next occurrence 
		}
		
		return cipherText;

	}
	
	public String decrypt() {
    int nbColumns = key.length(); 
    double nbRows = Math.ceil((double) cipherText.length()/nbColumns);
		char[][] table = new char [(char)nbRows][nbColumns];
		int cipherIdx = 0;
		String keyCopy = key; 
		int nbLetterOflastRow = cipherText.length() % nbColumns;

  

    char a [] = keyCopy.toCharArray();
		 Arrays.sort(a);
		
//		picking up the cipher text:
		String decryptedText = "";
		int sortedIdx = 0;
		for (int i = keyCopy.indexOf(a[sortedIdx]); sortedIdx < keyCopy.length();) {
			i = keyCopy.indexOf(a[sortedIdx++]);				
			
				
			for (int j = 0; j < nbRows && decryptedText.length() != cipherText.length(); j++) { //5 - 3 = 2
				if(j != nbRows-1 || i+1 <= nbLetterOflastRow || nbLetterOflastRow == 0) //fill up only if you are not in the last row OR not in the column that > nbLetterOflastRow 
				table[j][i]+=cipherText.charAt(cipherIdx++); 
			} 
			keyCopy = keyCopy.replaceFirst(keyCopy.charAt(i)+"", "*"); // to get rid of first char and find next occurrence 
		}

		cipherIdx = 0;
    for (int i = 0; cipherIdx < cipherText.length(); i++) { // fill the array until the plain text finishes
			for (int j = 0; j < nbColumns && cipherIdx++ < cipherText.length(); j++) { // fill in a row way + stop when the plain text finished 
				decryptedText+=table[i][j];
				}
		}
		return decryptedText;
		}
	
	
	

}
