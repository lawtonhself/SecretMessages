package secretMessages;

import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {
		codeIt();
	}
	public static void codeIt () {
		//declaring a new scanner
		Scanner scan = new Scanner(System.in);
		//output to user to ask for message to encode or decode
		System.out.println("Enter a message to encode or decode:");
		//we will store the users input as a String called message
		String message = scan.nextLine();
		//this will be the String that we will output to the user after encoding or decoding
		String output = "";
		//prompts user to enter a number from -25 to 25 to use as the key for how the letters will shift like A = B(key = 1)
		System.out.println("Enter a secret key (-25 to 25):");
		int keyVal = Integer.parseInt(scan.nextLine());
		char key = (char) keyVal;
		
		//For right now this for loop goes through and add the key(13) to each char and converts it to that char
				//example A will equal N by adding 13
				for ( int x = 0; x < message.length(); x++ ) {
					char input = message.charAt(x);
					if (input >= 'A' && input <= 'Z'){
						input += key;
						if (input > 'Z')
							input -= 26;
						if (input < 'A')
							input += 26;
					}
					else if (input >= 'a' && input <= 'z'){
						input += key;
						if (input > 'z')
							input -= 26;
						if (input < 'a')
							input += 26;
					}
					else if (input >= '0' && input <= '9') {
						input += (keyVal % 10);
						if (input > '9')
							input -= 10;
						if (input <'0')
							input += 10;
					}
					output += input;
				}
				System.out.println(output);
				//scan.close();
				codeIt();
	}
}
