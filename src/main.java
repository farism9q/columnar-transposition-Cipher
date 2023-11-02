import java.util.Arrays;
import java.util.Scanner;


public class main {
	


	public static void main(String[] args) {
		
		ColmnuarTransposiotionCipher c1 = new ColmnuarTransposiotionCipher();
		
		Scanner scan = new Scanner(System.in);

    System.out.print("Enter plain text to be encrypted: ");
		c1.plainText = scan.next();

		System.out.print("Enter your key: ");
		c1.key = scan.next();
		
		System.out.println("Your cipher text: " + c1.encrypt());
		
		System.out.print("Enter cipher text to be deprycted: ");
		c1.cipherText = scan.next();

		System.out.print("Enter your key: ");
		c1.key = scan.next();
		
		System.out.println("Your decrypted text: " + c1.decrypt());
		

		
		
	
	}

}
