import java.util.Arrays;
import java.util.Scanner;


public class main {
	
//	private static int countChar(char c, String key) {
//		int count = 0;
//	
//		for (int i = 0; i < key.length(); i++) {
//		    if (key.charAt(i) == c) {
//		        count++;
//		    }
//		   
//	}
//		return count;
//	}

	public static void main(String[] args) {
		
		ColmnuarTransposiotionCipher c1 = new ColmnuarTransposiotionCipher();
		
		Scanner scan = new Scanner(System.in);
//		
		System.out.print("Enter plain text to be encrypted: ");
		c1.plainText = scan.next();

		System.out.print("Enter your key: ");
		c1.key = scan.next();
		
		System.out.println("Your cipher text: " + c1.encrypt());
//		
		
		System.out.print("Enter cipher text to be deprycted: ");
		c1.cipherText = scan.next();

		System.out.print("Enter your key: ");
		c1.key = scan.next();
		
		System.out.println("Your decrypted text: " + c1.decrypt());
		

		
		
	
//		Scanner scan = new Scanner(System.in);
//		
//		int stop = 0;
//		while(stop != -1) {
//			
//		
//		System.out.print("Enter plain text to be encrypted: ");
//		String plainText = scan.next();
//
//		System.out.print("Enter your key: ");
//		String key = scan.next();
//		
//		
//		
//		
////		Math.ceil() accepts double, we did casting to round it to upper number and we did another casting to convert it to char type
//		int nbColumns = key.length(); 
//		char[][] table = new char [(char)Math.ceil( (double) plainText.length()/nbColumns)][nbColumns];
//		int plainIdx = 0;
//		
//		 
////		filling the table:
//		for (int i = 0; plainIdx < plainText.length(); i++) { // fill the array until the plain text finishes
//			for (int j = 0; j < nbColumns && plainIdx < plainText.length(); j++) { // fill in a row way + stop when the plain text finished 
//				table[i][j] = plainText.charAt(plainIdx++); 
//				}
//		}
//		
////		Sorting the key:
//		char a [] = key.toCharArray();
//		 Arrays.sort(a);
//		
////		plaint text length - key length = nb of rows 
////		picking up the cipher text:
//		String cipherText = "";
//		int sortedIdx = 0;
//		
//		for (int i = key.indexOf(a[sortedIdx]); sortedIdx < key.length();) {
//			i = key.indexOf(a[sortedIdx++]);				
//			
//				
//			for (int j = 0; j < Math.ceil( (double) plainText.length()/nbColumns) && table[j][i] != 0  && cipherText.length() != plainText.length(); j++) { //5 - 3 = 2
//				cipherText+=table[j][i]; 
//			} 
//			key = key.replaceFirst(key.charAt(i)+"", "*"); // to get rid of first char and find next occurrence 
//			
//			
//			
//
//		}
//		
//		System.out.print("Your cipher text is: ");
//		System.out.println(cipherText);
//		System.out.println("----------------------");
//		System.out.print("Do you want to encrypt another text? press any number,  if NOT press -1 to stop: ");
//		stop = scan.nextInt();
//	}
//		
	}

}
